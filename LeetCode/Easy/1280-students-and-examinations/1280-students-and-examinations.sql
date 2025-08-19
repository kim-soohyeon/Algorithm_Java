SELECT ST.student_id
     , ST.student_name 
     , SUB.subject_name
     , NVL(EXM.attended_exams, 0) AS attended_exams
FROM Students ST
INNER JOIN Subjects SUB
    ON 1=1
LEFT OUTER JOIN (
    SELECT student_id
         , subject_name
         , count(*) AS attended_exams 
    FROM Examinations
    GROUP BY student_id, subject_name
) EXM
    ON ST.student_id = EXM.student_id
    AND SUB.subject_name = EXM.subject_name
ORDER BY student_id, subject_name
;    