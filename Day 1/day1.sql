CREATE DATABASE health_clinic_db;
USE health_clinic_db;
DROP DATABASE health_clinic_db;
SHOW DATABASES;
CREATE DATABASE health_clinic_db;
USE health_clinic_db;
CREATE TABLE patients (
patient_id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
date_of_birth DATE,
gender ENUM('Male', 'Female', 'Other'),
phone_number VARCHAR(15) UNIQUE,
email VARCHAR(100),
registered_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
CREATE TABLE patients (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    gender ENUM('Male', 'Female', 'Other'),
    phone_number VARCHAR(15) UNIQUE,
    email VARCHAR(100),
    registered_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE patients ADD COLUMN address VARCHAR(200);
ALTER TABLE patients MODIFY COLUMN phone_number VARCHAR(20);
ALTER TABLE patients CHANGE COLUMN address home_address VARCHAR(200);

RENAME TABLE patients TO clinic_patients;
INSERT INTO patients (first_name, last_name, date_of_birth, gender, phone_number, email)
VALUES ('Aarav', 'Sharma', '1998-03-15', 'Male', '9876501234', 'aarav.sharma@emai
l.com');
INSERT INTO clinic_patients
(first_name, last_name, date_of_birth, gender, phone_number, email)
VALUES
('Aarav', 'Sharma', '1998-03-15', 'Male', '9876501234', 'aarav.sharma@email.com');
INSERT INTO clinic_patients
(first_name, last_name, date_of_birth, gender, phone_number, email)
VALUES
('Aarav', 'Sharma', '1998-03-15', 'Male', '9876501234', 'aarav.sharma@email.com');
INSERT INTO clinic_patients
(first_name, last_name, date_of_birth, gender, phone_number, email)
VALUES
('Priya', 'Gupta', '1995-06-15', 'Female', '9876543211', 'priya.gupta@email.com'),
('Rahul', 'Singh', '1998-11-22', 'Male', '9876543212', 'rahul.singh@email.com');
UPDATE clinic_patients
SET phone_number = '9998887777'
WHERE patient_id = 1;
DELETE FROM clinic_patients
WHERE patient_id = 3;
USE health_clinic_db;
CREATE TABLE specializations (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(255)
);
CREATE TABLE appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    appointment_date DATETIME NOT NULL
);
INSERT INTO specializations (name, description)
VALUES
('Cardiology', 'Heart and cardiovascular treatments'),
('Dermatology', 'Skin, hair and nail treatments'),
('Pediatrics', 'Healthcare for infants and children');
INSERT INTO appointments (patient_id, doctor_id, appointment_date)
VALUES
(1, 101, '2026-08-01 10:00:00'),
(2, 102, '2026-08-02 11:30:00'),
(1, 103, '2026-08-03 03:00:00');
SELECT * FROM specializations;

SELECT * FROM appointments;
ALTER TABLE clinic_patients
ADD blood_group VARCHAR(5);
DESCRIBE clinic_patients;
ALTER TABLE clinic_patients
ADD blood_group VARCHAR(5);
ALTER TABLE clinic_patients
DROP COLUMN blood_group;

SELECT * FROM clinic_patients
WHERE patient_id = 2;
UPDATE clinic_patients
SET phone_number = '9876509999'
WHERE patient_id = 2;



GRANT SELECT, INSERT, UPDATE, DELETE
ON health_clinic_db.*
TO 'clinic_app_user'@'localhost';



SELECT * FROM clinic_patients;

SELECT * FROM specializations;

SELECT * FROM appointments;