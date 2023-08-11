-- 검색 결과 테이블을 반복문을 이용해서 활용하는 프로시저
-- 학생 정보를 출력하는 프로시저(프로시저 이용 안해도 SELECT문으로 처리 가능하지만 연습을 위해)


DROP PROCEDURE IF EXISTS SELECT_STUDENT;

DELIMITER //
CREATE PROCEDURE SELECT_STUDENT()
BEGIN
	DECLARE DONE INT DEFAULT 0; -- CURSOR를 이용하여 반복문을 할 때 종료할 지를 결정해주는 변수
    DECLARE _NUM CHAR(10); -- 검색결과에 있는 한 행의 있는 학번을 저장 할 변수
    DECLARE _NAME VARCHAR(20); -- 검색결과에 있는 한 행의 있는 이름을 저장 할 변수
    DECLARE _MAJOR VARCHAR(20); -- 검색결과에 있는 한 행의 있는 전공을 저장 할 변수
    
    -- 이터레이터랑 비슷함
    DECLARE CUR CURSOR FOR
		SELECT * FROM STUDENT;
	-- CURSOR가 더이상 꺼낼 내용이 없으면 DONE을 1로 설정
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET DONE = 1;	
    -- CURSOR를 엶
    OPEN CUR;
    
    -- 이름 : LOOP
    STUDENT_LOOP : LOOP 
		-- FETCH : CUR에서 한 행씩 꺼내는 작업을 함
		FETCH CUR INTO _NUM, _NAME, _MAJOR;
        -- FETCH를 이용하여 하나씩 꺼낼 때 더 이상 꺼낼 내용이 없으면
        -- DONE이 자동으로 1이 됨(왜냐면 19번째 줄에서 설정했기 때문에)
        IF DONE THEN
			LEAVE STUDENT_LOOP;
		END IF;
		-- 하고싶은 작업
        SELECT CONCAT(_NUM, _NAME, _MAJOR);
    END LOOP;
    -- CURSOR를 닫음
    CLOSE CUR;
END //
DELIMITER ;

CALL SELECT_STUDENT();

