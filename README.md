# **Employee Management System 🏢**  

A **Java-based Employee Management System** built using **Swing, AWT**, and **SQL (JDBC)** for efficient employee data management. This project allows users to add, update, view, and delete employee records through an interactive interface.  

## **Features 🚀**  
✔️ **User Authentication** – Secure login system for accessing employee records.  
✔️ **Add Employee** – Register new employees with essential details.  
✔️ **Update Employee** – Modify existing employee records.  
✔️ **View Employee** – Search and filter employee details.  
✔️ **Remove Employee** – Delete employee records securely.  
✔️ **Database Integration** – Uses **SQL (JDBC)** to store and retrieve employee data.  

## **Technologies Used 🛠️**  
- **Programming Language:** Java  
- **GUI Frameworks:** Swing, AWT  
- **Database:** MySQL (via JDBC)  

## **Setup Instructions 🔧**  
1. Clone the repository:  
   ```bash
   git clone https://github.com/bhavsarhardeep/Employee-Management-System.git
   ```  
2. Import the project into your **Java IDE (Eclipse/IntelliJ IDEA)**.  
3. **Create and set up the MySQL database:**  
   - Open MySQL and run the following commands:
     ```sql
     CREATE DATABASE employee_management;
     USE employee_management;
     CREATE TABLE employees (
         emp_id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(50),
         age INT,
         gender VARCHAR(10),
         job VARCHAR(50),
         salary DECIMAL(10,2),
         phone VARCHAR(15),
         email VARCHAR(50)
     );
     ```  
   - Update **JDBC connection settings** in the project accordingly.  
4. Run the `login.java` file to launch the application.  
5. Use the **Add Employee** section to enter employee details.  
6. Manage employee records with **update, view, and remove** functionalities.  

## **Screenshots 📸**

Add screenshots in the `screenshots/` folder and reference them in this section:

```markdown
![Login Screen](screenshots/login_screen.png)
![Dashboard](screenshots/dashboard.png)
![Employee Management](screenshots/employee_management.png)
```  
_(You can add screenshots of the application here)_  

## **License 📜**  
This project is licensed under the **MIT License**.  

---
