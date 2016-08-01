
CREATE TABLE Teacher
  (TeacherID int,
 FirstName VARCHAR,
 LastName VARCHAR,
 Age int,
 Salary Decimal);
VALUES
(1,	'Jumbo' 'Jim', 22,	68000,
2,  'Katie'	'Noall',	25,	100000,
3,	'Hazel'	'Noall',	1,	10000000000);


CREATE TABLE Student
(StudentID int,
 FirstName varchar,
 LastName varchar,
 Grade int,
 GPA Decimal);
VALUES
(1,	'Saca' 'Tooya',	5,	4,
2,	'Danny'	'Noall',	4,	3.5,
3,	'Brad'	'Noall',	4,	3.5,
4,	'Susan'	'Noall',	4.5,	4,
5,	'Bree'	'Noall',	5,	4,
6,	'Jason'	'Noall',	6,	5,
7,	'Patrick'	'Shepherd',	6.5,	5.5,
8,	'Amber'	'Shepherd',	5.5,	4.5,
9,	'Tala'	'Shepherd',	5,	4,


SELECT * FROM [Student]
WHERE FirstName LIKE 'Am%';

CREATE TABLE Class(ClassID int,Name VARCHAR, Description VARCHAR,
 TeacherID int);
VALUES
(1,	'Energy Work'	'Chakras',	1,
2,	'Holistic Healing'	'FootZoning',	1,
3,	'VoCal'	'Traumatic Healing',	2,
4,	'Yoga'	'Finding Balance',	2,
5,	'Humility'	'Being Childlike',	3,
6,	'Charity'	'Being Christlike', 3);

CREATE TABLE ClassStudent
(ClassStudentID int,
 ClassID int,
 StudentID int);
VALUES
  (1, 1,	1,
  1,	2,	1,
  2,	3,	2,
  2,	4,	2,
  3,	5,	3,
  3,	6,	3,
  4,	6,	4,
  4,	1,	4,
  5,	1,	5,
  5,	2,	5,
  6,	3,	6,
  6,	4,	6,
  8,	6,	8,
  8,	4,	8,
  9,	4,	9,
  9,	2,	9,
  10,	2,	10,
  10,	5,	10,
  7,	5,	7,
  7,	3,	7
  );

JOINED TABLE
SELECT
  Teacher.FirstName,
  Teacher.LastName,
  Class.Name
FROM
  Class,
  Teacher
WHERE
  Class.TeacherID = Teacher.TeacherID;