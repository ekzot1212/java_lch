-- 등록된 영화를 조회하는 쿼리
SELECT *
FROM MOVIE;

-- 장르가 드라마인 영화를 조회하는 쿼리
SELECT *
FROM MOVIE
JOIN MOVIE_GENRE ON MG_MO_NUM = MO_NUM
WHERE MG_GE_NAME = '드라마';

-- 개봉전인 영화를 조회하는 쿼리
SELECT *
FROM MOVIE
WHERE NOW() < MO_OPENING_DATE;

-- 상영 종료된 영화를 조회하는 쿼리(현재 개봉중인 영화는 오늘을 기준으로 2주까지 스케줄이 반드시 등록이 됨)
SELECT MO_TITLE AS 상영종료영화, COUNT(MS_NUM)
FROM MOVIE
LEFT JOIN MOVIE_SCHEDULE ON MO_NUM = MS_MO_NUM
WHERE NOW() >= MO_OPENING_DATE
HAVING COUNT(MS_NUM) = 0; 	-- 집계함수는 WHERE절에 못넣음.

