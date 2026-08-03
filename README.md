# BridgeLabz Training - Health Clinic Database (Day 1)

## 📌 Overview

This repository contains the SQL practice completed during BridgeLabz Refresher Training.

The project demonstrates the fundamentals of MySQL Database Management System, including:

- Database creation
- Table creation
- Data Definition Language (DDL)
- Data Manipulation Language (DML)
- Table modification
- Data retrieval
- User privilege management

---

## 🛠 Technologies Used

- MySQL
- SQL

---

## 📂 Database Name

```
health_clinic_db
```

---

## 📋 Topics Covered

### Database Operations
- Create Database
- Use Database
- Drop Database
- Show Databases

### Table Operations
- Create Table
- Rename Table
- Alter Table
- Add Column
- Modify Column
- Change Column Name
- Drop Column

### CRUD Operations
- Insert Records
- Update Records
- Delete Records
- Select Records

### Database Objects
- Patients
- Specializations
- Appointments

### User Permissions
- GRANT privileges

---

## 📁 Tables Created

### 1. clinic_patients

Stores patient details.

Fields include:

- Patient ID
- First Name
- Last Name
- Date of Birth
- Gender
- Phone Number
- Email
- Registration Date

---

### 2. specializations

Stores doctor specialization details.

Fields:

- ID
- Name
- Description

---

### 3. appointments

Stores appointment details.

Fields:

- ID
- Patient ID
- Doctor ID
- Appointment Date

---

## 📚 SQL Concepts Practiced

### DDL Commands

- CREATE DATABASE
- CREATE TABLE
- ALTER TABLE
- RENAME TABLE
- DROP DATABASE

---

### DML Commands

- INSERT
- UPDATE
- DELETE

---

### DQL Commands

- SELECT
- WHERE

---

### DCL Commands

- GRANT

---

## 📌 Sample Operations Performed

- Created Health Clinic database
- Created Patient table
- Renamed Patients table to Clinic Patients
- Inserted patient records
- Updated phone numbers
- Deleted records
- Added Specializations table
- Added Appointments table
- Inserted appointment details
- Added and removed Blood Group column
- Granted database permissions to a user
- Retrieved data using SELECT queries

---

## ▶️ How to Run

1. Open MySQL Workbench or MySQL CLI.
2. Execute the SQL script.
3. Verify the tables using:

```sql
SHOW TABLES;
```

4. View data:

```sql
SELECT * FROM clinic_patients;

SELECT * FROM specializations;

SELECT * FROM appointments;
```

---

## 📖 Learning Outcomes

After completing this assignment, I learned:

- Database creation and management
- Table design
- CRUD operations
- Table alteration
- Managing relationships between tables
- SQL syntax and best practices
- Granting database permissions

---

**Priyanka Yadav**

BridgeLabz Refresher Training
