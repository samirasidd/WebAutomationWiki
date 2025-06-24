# Wikipedia Web Automation Practice

A Selenium WebDriver test automation framework for Wikipedia, demonstrating core automation techniques and best practices.

## 🚀 Key Features

- **Cross-Browser Testing** (Chrome/Firefox/Edge support via WebDriverManager)
- **Page Object Model** implementation for maintainable tests
- **Modular Test Suites** (sanity.xml, regression.xml)
- **Automated Test Reporting** with Allure
- **CI/CD Ready** (Maven project structure)

## ✅ Test Coverage

### Home Page Tests
- ✔️ Verify page title
- ✔️ Check header links 

### Login Page Tests
- ✔️ Test invalid login scenarios (empty fields, wrong credentials)  
- ✔️ Verify error message display logic  
- ✔️ Test successful login flow (with valid credentials)  

## 🛠 Technical Stack
- **Java** + **Selenium WebDriver** (v4.x)  
- **TestNG** for test orchestration  
- **Maven** for dependency management  
- **Allure Reports** for test visualization  
- **WebDriverManager** for automatic driver setup  

## 📊 Test Execution
Run specific test suites:
```bash
mvn test -DSuiteFile="sanity.xml"
mvn test -DSuiteFile="regression.xml"
