# Banking Portal UI

[![GitHub Repo](https://img.shields.io/badge/GitHub-UI%20Repo-blue.svg?style=flat-square)](https://github.com/vishalbhandary/FullStack-BankingPortal/tree/master/BankingPortalUI-main)
[![GitHub Repo](https://img.shields.io/badge/GitHub-API%20Repo-blue.svg?style=flat-square)](https://github.com/vishalbhandary/FullStack-BankingPortal/tree/master/BankingPortalAPI-main)

![image](https://github.com/vishalbhandary/FullStack-BankingPortal/blob/master/BankingPortalAPI-main/assets/Dashboard.png)

## Banking Portal API

- [https://github.com/vishalbhandary/FullStack-BankingPortal](https://github.com/vishalbhandary/FullStack-BankingPortal)

The Banking Portal API provides a set of endpoints for managing user accounts, fund transfers, and transactions. This project aims to facilitate secure and efficient banking operations for users.

***

## Features

- User Authentication: Secure login and registration for users.
- Account Management: Create and manage multiple bank accounts.
- Transactions: Deposit, withdraw, and transfer funds between accounts.
- Transaction History: View detailed transaction history, including date, amount, and type.
- Charts and Analytics: Visualize transaction data through monthly and daily transaction charts.
- Filtering: Filter transactions by type (deposit, withdrawal, transfer).
* Export: Export transaction data to Excel for further analysis.

## Technology Stack

- Backend: Java Spring Boot
- Frontend: Angular
- Database: MySQL
- API: RESTful API for communication between frontend and backend

## Output 

![image](https://github.com/vishalbhandary/FullStack-BankingPortal/blob/master/BankingPortalAPI-main/assets/Features.gif)


## Set Up Environment:

   - Install Java and Maven (or Gradle).
   - Install Node.js and npm (or yarn).

## Configure Database:
   - Create a database with the specified name and credentials.
## Update the database configuration in the application.properties file (Spring Boot) and environment.ts file (Angular).
## Run the Application:
   - Backend:
      cd backend
	mvn spring-boot:run
 
   - Frontend:
      cd frontend
	npm start

## Usage

- Access the Application: Open your web browser and navigate to http://localhost:4200.
- Login or Register: Create a new account or login with existing credentials.
- Explore Features: Use the dashboard to view account information, perform transactions, and analyze transaction data.

## Security

- Password Hashing: User passwords are stored as hashed values using a secure hashing algorithm.
- Input Validation: Input validation is implemented to prevent injection attacks and other security vulnerabilities.
- Session Management: Proper session management ensures user security.

## Contributing

Contributions are welcome! Please follow these guidelines:
- Fork the Repository: Create a fork of the project.
- Create a Branch: Create a new branch for your feature or bug fix.
- Make Changes: Implement your changes and write tests.
- Submit a Pull Request: Submit a pull request to the main branch.

## Future Plans
- Additional Features: Implement features like budgeting, bill payments, and investment tracking.
- Mobile App: Develop a mobile app for on-the-go access.
- Integration: Integrate with other financial services (e.g., payment gateways, credit bureaus).



