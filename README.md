# Janitri Login Automation Framework

This project automates the login functionality of the **Janitri Dashboard** using Java, Selenium WebDriver, TestNG, and the Page Object Model (POM) design pattern.

## 🔗 Test Page URL
[https://dev-dash.janitri.in](https://dev-dash.janitri.in)

## 📂 Project Structure
```
JanitriLoginAutomation/
│
├── pom.xml                     # Maven config file with dependencies
├── testng.xml                  # TestNG suite config
│
└── src/
    ├── main/
    │   └── java/
    │       ├── base/
    │       │   └── BaseTest.java
    │       └── pages/
    │           └── LoginPage.java
    │
    └── test/
        └── java/
            └── tests/
                └── LoginPageTest.java
```

## 🧪 Automated Test Scenarios
- Verify login button disabled when fields are empty
- Validate password is masked by default
- Test password visibility toggle
- Attempt invalid login and verify error message
- Check presence of input fields and toggle button

## ✅ Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven (for dependency management)
- Page Object Model (POM) design pattern

## 🚀 How to Run
1. Install Maven and ChromeDriver
2. Clone or download this repo
3. Navigate to the project directory
4. Run the tests using:
   ```bash
   mvn test
   ```

## 📌 Notes
- No credentials are used – only UI behavior for invalid/blank inputs is tested.
- Make sure ChromeDriver path is set correctly in `BaseTest.java`

---

Created as part of a Junior Software Tester Assignment