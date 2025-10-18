SELECT book_id, TO_CHAR(published_date, 'YYYY-MM-DD')
FROM BOOK 
WHERE TO_CHAR(published_date, 'YYYY') = '2021' AND category LIKE '인문'
ORDER BY published_date;