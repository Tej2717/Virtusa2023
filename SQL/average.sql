SELECT studentID, FullName, AVG(sat_score) 
FROM student 
GROUP BY studentID, FullName;
