--Query1
use AdventureWorksLT2022;
SELECT * FROM SalesLT.Customer;
-- Query 2
SELECT * FROM SalesLT.Customer ORDER BY FirstName;
-- Query 3
SELECT * FROM SalesLT.Customer ORDER BY FirstName ASC;
-- Query 4
SELECT * FROM SalesLT.Customer ORDER BY FirstName DESC;
-- Query 5
SELECT * FROM SalesLT.Customer ORDER BY 3;
-- Query 5
SELECT * FROM SalesLT.Customer ORDER BY Title;
-- Query 6
SELECT * FROM SalesLT.Customer ORDER BY 3 DESC;
-- Query 7
SELECT * FROM SalesLT.Customer WHERE CustomerID < 6;
-- Query 8
SELECT * FROM SalesLT.Customer WHERE LastName = 'Gee';
-- Query 10 
SELECT * FROM SalesLT.Customer ORDER BY FirstName ASC , LastName DESC;
-- Query 11
SELECT * FROM SalesLT.Customer ORDER BY 3 ASC , 2 DESC;
-- Query 12 & 15
SELECT * FROM SalesLT.Customer WHERE 1 = 2;
-- Query 13 & 14
SELECT * FROM SalesLT.Customer WHERE 1 = 1;
-- Query 16
SELECT Count(*) FROM SalesLT.Customer ;

SELECT * FROM SalesLT.SalesOrderHeader;
-- Query 17
SELECT SalesOrderID As ID FROM SalesLT.SalesOrderHeader;
-- Query 19
SELECT RevisionNumber AS Revision FROM  SalesLT.SalesOrderHeader;
SELECT * FROM SalesLT.SalesOrderDetail;
-- Query 21
SELECT ROUND (LineTotal, 2) FROM SalesLT.SalesOrderDetail;
--Query 22
SELECT ROUND (8.45, 1) FROM SalesLT.SalesOrderDetail;
--Query 23
SELECT ROUND (8.5, 0) FROM SalesLT.SalesOrderDetail;
--Query 24
SELECT ROUND (-14.33, 0) FROM SalesLT.SalesOrderDetail;
--Query 25
SELECT ROUND (1.234, 1) FROM SalesLT.SalesOrderDetail;
--Query 28
SELECT ROUND (1234.567, -1) FROM SalesLT.SalesOrderDetail;
--Query 29
SELECT ROUND (1234.567, -2) FROM SalesLT.SalesOrderDetail;
-- Query 30
SELECT LineTotal FROM SalesLT.SalesOrderDetail;
--Query 31
SELECT ROUND(LineTotal, 0) FROM SalesLT.SalesOrderDetail;
--Query 32
SELECT FLOOR(1.2);
--Query 33
SELECT CEILING(1.2);
--Query 34
SELECT FLOOR(-1.2);
--Query 35
SELECT CEILING(-1.2);
--Query 36
SELECT 1 + 1;
--Query 37
SELECT '1' + '1' AS [ADD];
--Query 38
SELECT '1A' + '1' AS [ADD];
--Query 39
SELECT '1A' + 'B';
--Query 40
SELECT 'A2' + '1';
--Query 41
SELECT 'A2' + '2';
--Query 42
SELECT 'A2' + 'A2';
--Query 46
SELECT 'RED' + 'GREEN' + 'BLUE' AS COLORS;
--Query 47
SELECT * FROM SalesLT.Customer;
--Query 48
SELECT CustomerID, CONCAT(FirstName,' ', LastName) AS FullName FROM SalesLT.Customer;
SELECT CustomerID, (FirstName + LastName) AS FullName FROM SalesLT.Customer;
--Query 49
SELECT LOWER(FirstName) FROM SalesLT.Customer;
--Query 50
SELECT UPPER(FirstName) FROM SalesLT.Customer;
--Query 51
SELECT LEFT(FirstName, 2) FROM SalesLT.Customer;
--Query 52
SELECT LOWER(LEFT(FirstName, 2)) FROM SalesLT.Customer;
--Query 54
SELECT REVERSE(LastName) + REVERSE(FirstName) FROM SalesLT.Customer;
--Query 55
SELECT REVERSE(FirstName + LastName) AS [REVERSE FULL NAME] FROM SalesLT.Customer;
--Query 57
SELECT REVERSE(FirstName) FROM SalesLT.Customer;
--Query 58
SELECT ModifiedDate FROM SalesLT.Customer;
--Query 59
SELECT FORMAT( ModifiedDate, 'MM/dd/yy') FROM SalesLT.Customer;
--Query 60
SELECT FORMAT( ModifiedDate, 'MM-dd-yy') FROM SalesLT.Customer;
--Query 61
SELECT DATEPART(WEEK, ModifiedDate) FROM SalesLT.Customer;
--Query 62
SELECT SalesOrderDetails_DATE FROM SalesLT.SalesOrderDetail;
--Query 65
SELECT DISTINCT FirstName FROM SalesLT.Customer  ORDER BY FirstName;
--Query 66
SELECT COUNT(FirstName) FROM SalesLT.Customer;
--Query 67
SELECT FirstName FROM SalesLT.Customer WHERE FirstName IS NOT NULL;
--Query 68
SELECT COUNT(DISTINCT FirstName) FROM SalesLT.Customer;
--Query 69
SELECT COUNT(*)  FROM SalesLT.Customer WHERE FirstName = 'NICK';
--Query 70
SELECT FirstName  FROM SalesLT.Customer WHERE FirstName = 'NICK';
--Query 71
SELECT CustomerID FROM SalesLT.Customer WHERE CustomerID<5;
--Query 72
SELECT CustomerID FROM SalesLT.Customer WHERE CustomerID BETWEEN 1 AND 5 ;
--Query 73
SELECT CustomerID FROM SalesLT.Customer WHERE CustomerID  NOT BETWEEN 1 AND 5 ;
--Query 74
SELECT FirstName  FROM SalesLT.Customer WHERE FirstName LIKE 'A%';
--Query 75
SELECT FirstName  FROM SalesLT.Customer WHERE FirstName <= 'AL%';
--Query 76
SELECT *  FROM SalesLT.Customer WHERE LEN(FirstName) = 4;
--Query 78
SELECT * FROM SalesLT.Customer WHERE LEN(LastName) = 5 AND LastName LIKE '%y' ORDER BY FirstName ;
--Query 79
SELECT * FROM SalesLT.Customer WHERE LEN(LastName) = 5 AND LastName LIKE '%y' ORDER BY LastName ;
--Query 80
SELECT * FROM SalesLT.Customer WHERE FirstName = 'KENNETH';
SELECT * FROM SalesLT.Customer WHERE FirstName LIKE 'KENNETH';
--Query 81
SELECT * FROM SalesLT.Customer 
WHERE FirstName = 'KENNETH' AND CustomerID < 100 AND (LastName LIKE '%I' OR LastName LIKE '%W' );
--Query 82
SELECT * FROM  SalesLT.Customer WHERE CustomerID IN (1,3,4);
--Query 83
SELECT * FROM  SalesLT.Customer WHERE CustomerID NOT IN (1,4,5,8,67,3,9);
--Query 86
SELECT * FROM SalesLT.Customer WHERE LastName IN (SELECT LastName FROM SalesLT.Customer WHERE FirstName = 'CUBA');
--Query 87
SELECT * FROM  SalesLT.Customer WHERE LastName IN ('OLIVIER', 'ALLEN',  'BIRCH') ORDER BY CustomerID ASC;  
-- Query 89
SELECT * FROM SalesLT.Customer ORDER BY LastName;
-- Query 90
SELECT * FROM SalesLT.Address;
-- Query 91
UPDATE SalesLT.Address SET AddressLine2 = NULL;
--QUERY 92
UPDATE SalesLT.Address SET AddressLine2 = 'DEMO Address' WHERE AddressID = 9;
--Query 94
SELECT * FROM SalesLT.Address WHERE AddressLine2 IS NOT NULL ;
--Query 96
UPDATE SalesLT.Address SET AddressLine2 = 'EMPTY' WHERE AddressID = 11;
--Query 99
SELECT * FROM SalesLT.Address WHERE AddressLine2 ='';

