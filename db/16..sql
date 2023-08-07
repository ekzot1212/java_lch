-- qwe123회원이 구매(환불, 반품은 제외)한 제품명과 옵션명 목록을 확인하는 쿼리
SELECT ME_ID AS 주문아이디, PR_NAME AS 제품명,  OP_NAME AS 옵션명
	,PR_PRICE AS 제품가격, OL_AMOUNT AS 구매수량
FROM MEMBER
JOIN `ORDER` ON OR_ME_ID = ME_ID
JOIN ORDER_LIST ON OL_OR_NUM = OR_NUM
JOIN `OPTION` ON OL_OP_NUM = OP_NUM
JOIN PRODUCT ON OP_PR_CODE = PR_CODE
WHERE OR_STATE NOT IN('환불','반품') AND ME_ID='qwe123';

-- abc123회원이 장바구니에 담은 제품명과 옵션명, 수량을 확인하는 쿼리
SELECT PR_NAME AS 제품명, OP_NAME AS 옵션명, BA_AMOUNT AS 수량
FROM MEMBER
JOIN BASKET ON ME_ID = BA_ME_ID
JOIN `OPTION` ON OP_NUM = BA_OP_NUM
JOIN PRODUCT ON OP_PR_CODE = PR_CODE
WHERE ME_ID = 'abc123' ;