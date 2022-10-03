SELECT * FROM Jaegers;

SELECT * 
  FROM Jaegers
 WHERE status = 'Active';
 
SELECT *
  FROM Jaegers
 WHERE mark in (1, 3, 5);
  
SELECT *
  FROM Jaegers
 ORDER BY mark;
 
SELECT *
  FROM Jaegers
 WHERE launch =
	   (SELECT MIN(launch) 
	      FROM Jaegers);
		  
SELECT *
  FROM Jaegers
 WHERE kaijuKill 
	IN ((SELECT MIN(kaijuKill) 
	       FROM Jaegers), 
	    (SELECT MAX(kaijuKill) 
	       FROM Jaegers));	 
		   
SELECT AVG(weight) AS "Средний вес роботов"
  FROM Jaegers;

UPDATE Jaegers 
   SET kaijuKill = kaijuKill + 1
 WHERE status = 'active';
  
UPDATE Jaegers 
   SET kaijuKill = kaijuKill + 1
 WHERE status = 'Active';
 
 DELETE 
   FROM Jaegers
  WHERE status = 'Destroyed';