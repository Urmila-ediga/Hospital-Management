# 🏥 Hospital Management System

A web-based Hospital Management System developed using **Java, JSP, Servlets, JDBC, Maven, and MySQL**. The system helps manage hospital operations such as patient registration, doctor management, appointments, specialists, and user accounts through separate modules for Admin, Doctor, and User.

## 📌 Project Overview

The Hospital Management System provides a centralized platform for managing hospital-related activities.

The application has three main modules:

- 👨‍💼 **Admin**
- 👨‍⚕️ **Doctor**
- 👤 **User / Patient**

Each module provides role-specific functionality for managing and accessing hospital information.

---

## ✨ Features

### 👤 User / Patient Module

- User Registration
- User Login / Logout
- View hospital services
- Book doctor appointments
- View appointments
- Change Password
- Manage user profile

### 👨‍⚕️ Doctor Module

- Doctor Login / Logout
- View appointments
- View patient information
- Update appointment status
- Edit doctor profile
- Change Password

### 👨‍💼 Admin Module

- Admin Login / Logout
- Manage Doctors
- Add / Update / Delete Doctors
- Manage Specialists
- Add / Update / Delete Specialists
- View Patients
- View Appointments
- Change Admin Password

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Backend development |
| JSP | Dynamic web pages |
| Servlets | Request handling and business logic |
| JDBC | Database connectivity |
| MySQL | Database |
| HTML | Web page structure |
| CSS | Styling |
| JavaScript | Client-side functionality |
| Maven | Project and dependency management |
| Apache Tomcat | Application server |
| Eclipse / VS Code | Development |

---

## 🏗️ Project Architecture

```text
                    Hospital Management System
                              |
             +----------------+----------------+
             |                |                |
           Admin            Doctor          User/Patient
             |                |                |
       Manage Doctors    View Appointments   Book Appointment
       Manage Specialists Patient Details    View Appointment
       Manage Patients    Update Status      User Profile
       Manage Appointments
             |
             +---------------+
                     |
                  JDBC
                     |
                  MySQL
