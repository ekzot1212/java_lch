/*
select문 기본
select 속성명1, ..., 속성명n from 테이블명;
=> 테이블에서 속성명1, ..., 속성명n의 값들을 조회

as : 속성 또는 테이블명을 일시적으로 변경해서 사용할 때 쓰는 키워드
속성명1 as 속성명2 => 속성명1을 일시적으로 속성명2로 사용 (num as '학번' => '학번'으로 표시됨)
*/
use course;
-- 등록된 모든 학생의 모든 정보를 조회하는 쿼리
select * from student;
-- 등록된 모든 학생의 학번을 조회하는 쿼리
select num as '학번' from student;

/*
select 속성명1, ..., 속성명n from 테이블명 where 조건식;
=> 조건식을 만족하는 투플들만 검색해서 해당 행의 속성1, ..., 속성n 의 정보를 조회하는 방법
where절
속성명1 = 값1 or 속성명2 = 값2 and 속성명3 = 값3
where절에 사용되는 연산자
= : 같다 (null과 비교가 안됨)
!=: 같지 않다 (null과 비교가 안됨)
<>: 같지 않다 (null과 비교가 안됨)
and : ~하고, 자바의 &&연산자
or  : ~하거나, 자바의 ||연산자
is null : null인지 확인
is not null : null이 아닌지 확인
like : 와일드 카드와 함께 사용되며, 값이 주어진 와이드가 포함된 문자열과 같은지를 비교할때 사용.
_ : 한글자를 의미하는 와일드 카드
% : 0글자 이상을 의미하는 와일드 카드
between A and B : A이상 B이하인 조건을 만족할 때 사용
=> 속성명 >= A and 속성명 <= B
속성명 in(값1, 값2, ..., 값n) : 속성의 값이 값1이거나 값2이거나 ... 값n인 조건을 만족할 때 사용
=> 속성명 = 값1 or 속성명 = 값2 or ... or 속성명 = 값n
*/
/*
distinct : 중복된 결과를 제거하고 조회
select distinct 속성명 from 테이블명;
*/
/* !!!
-ANY
where 속성명 비교연산자(=, >=, <=, !=, <, >) any(서브쿼리);
=> 속성이 서브쿼리 결과와 비교연산을 했을 때 서브쿼리 결과 중 하나라도 만족하면 조회
where 속성명 = any(서브쿼리)
=> where 속성명 in(서브쿼리)

-SOME은 ANY와 같음

-ALL
where 속성명 비교연산자(>=, <=, !=, <, >) all(서브쿼리);
=> 속성이 서브쿼리 결과와 비교연산을 했을 때 서브쿼리 결과 모두를 만족하면 조회
*/
/*
- 정렬 : ORDER BY
- order by는 where절과 group by절 뒤에 나와야 함
order by 속성명1 정렬방법, 속성명2 정렬방법, ...
=> 속성명1을 정렬방법 기준으로 정렬하고, 속성명1의 값이 같으면 속성명2를 기준으로 정렬
- 정렬방법
	- ASC : 오름차순. 기본값. 
    - DESC : 내림차순.
*/
/*
LIMIT : 행(튜플)을 원하는 위치부터 원하는 개수를 가져오기 위한 방법
- 전체 검색 결과가 아닌 일부를 가져올 때 사용.
- 위치가 order by절 뒤. 제일 마지막에 위치해야 함.
limit A;
=> 0번지부터 A개를 가져옴
limit A B;
=> A번지부터 B개를 가져옴
*/
/*
GROUP BY : 같은 값을 가지는 행들을 묶어서 평균을 내거나 개수를 세는 등의 작업을 할 때 사용
HAVING절 : 집계함수에 조건 사용
- 위치는 where절 다음. order by 앞.
자주사용하는 집계함수
- avg(속성 또는 식) : 평균
- min(속성 또는 식) : 최소값
- max(속성 또는 식) : 최대값
- count(속성) : 행(튜플)의 개수
- count(distinct 속성) : 중복을 배제한 행의 개수
- sum(속성 또는 식) : 합
*/
select * from student;
select * from student 
where num like '___\_%';
-- 컴퓨터공학과 학생들을 조회하는 쿼리
select * from student where major ='컴퓨터공학과'; 
-- 컴퓨터공학과가 아닌 학생들을 조회하는 쿼리
select * from student where major !='컴퓨터공학과';
-- 학번이 2023135001인 학생이 듣는 수강정보를 조회하는 쿼리
select * from course where student_num = '2023135001';
-- 학점이 3학점인 과목의 과목명을 조회하는 쿼리
select title from subject where point = '3';
-- 이름이 3자인 학생 정보를 조회하는 쿼리
select * from student where name like '___%';
-- 성이 유씨인 학생 정보를 조회하는 쿼리
select * from student where name like '유%';
-- 학생의 학번은 입학년도 4자 + 학과코드 3자 + 번호 3자
-- 23학번 학생을 조회하는 쿼리
select * from student where num like '2023%';
-- 방송학과 코드는 135이다.
-- 방송학과 학생을 조회하는 쿼리를 작성
select * from student where major = '방송학과';
-- 학점이 2이상 3이하인 과목을 조회하는 쿼리를 작성
select * from subject where point >= 2 and point <= 3;
select * from subject where point between '2' and '3';
-- 이순신교수님과 한석봉 교수님이 강의하는 수강정보를 조회하는 쿼리
select * from course;
select * from course where professor_name = '이순신' or professor_name = '한석봉';
select * from course where professor_name in('이순신','한석봉');

select * from student
where num='2023135001' or num ='2023135002' and major = '방송학과'
and name = '영심이';


-- 2023년에 수강하는 과목들의 과목코드를 조회하는 쿼리
select distinct subject_code from course where year ='2023';
select * from course;
select * from course where subject_code = (select code from subject where title = '글쓰기');

-- 학점이 2학점 또는 3학점 이상인 과목의 수강 정보를 조회
select * from course where subject_code = any(select code from subject where point in(2,3));
select * from subject where point in(2,3);
-- 글쓰기와 영어가 아닌 모든 과목의 수강 정보를 조회
select * from course 
	where subject_code != all(select code from subject where title in('글쓰기','영어'));
select * from course 
	where subject_code in(select code from subject where title != '글쓰기' and title !='영어');

-- 학생 정보를 이름순으로 오름차순 정렬하여 조회
select * from student order by name; 
-- 학생 정보를 이름순으로 내림차순 정렬하여 조회   
select * from student order by name desc;
-- 학생정보를 전공, 이름순으로 오름차순 정렬하여 조회
select * from student order by major, name;
-- 학생들이 소속된 과를 조회하는 쿼리
select distinct major from student; 
-- 학생들 정보를 학번순으로 오름차순 정렬 후 위에서 2명의 학생 정보를 조회하는 쿼리
select * from student order by num limit 2;
-- 학생들 정보를 학번순으로 오름차순 정렬 후 3,4번째 학생 정보를 조회하는 쿼리
select * from student order by num limit 2, 2;
-- 학생들 정보를 학번순으로 오름차순 정렬 후, 2명씩 보여줄 때 3번째 페이지에 있는 학생 정보를 조회하는 쿼리
select * from student order by num limit 4, 2;

-- 각 과별 학생수를 조회
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
select major,count(num) from student group by major;
-- 과목별 수강 학생수를 과목코드, 수강생수로 조회하는 쿼리 !!!!!!!!
select subject_code as 과목코드, count(num) as '수강생 수' 
from course group by subject_code;
-- 과목별 수강생 수가 4명 이상인 과목의 과목코드를 조회하는 쿼리
select subject_code as 과목코드, count(num) as '수강생 수' 
from course group by subject_code having count(*) >= 4;











