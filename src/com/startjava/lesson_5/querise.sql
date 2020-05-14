
SELECT * FROM Jaegers;

SELECT * FROM Jaegers WHERE status = 'Y';

SELECT * FROM Jaegers WHERE mark IN ('5', '7');

SELECT * FROM Jaegers ORDER BY mark DESC;

SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);

SELECT AVG(weight) FROM Jaegers;

UPDATE Jaegers SET kaijuKill = (kaijuKill + 1) WHERE status = 'Y';

DELETE FROM Jaegers WHERE status = 'N';