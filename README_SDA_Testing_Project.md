
# 🧪 SDA Final Testing Project – Selenium + BDD (Cucumber)

This repository contains the final project from a software testing course, focused on **automated web testing** using **Selenium WebDriver** and the **BDD approach** with **Cucumber framework** and **Gherkin syntax** in IntelliJ IDEA.

## 🛠️ Technologies Used

- **Java**
- **Selenium WebDriver**
- **Cucumber (BDD framework)**
- **Gherkin** – for writing test scenarios (`.feature` files)
- **JUnit**
- **IntelliJ IDEA**
- **Maven** – for dependency management (`pom.xml`)

## 📁 Project Structure

```
.
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── SdaTutorialPointBdd.java      # Test runner
│   │   │   └── org/example/
│   │   │       ├── Main.java
│   │   │       ├── SdaPractice.java          # Step definitions
│   │   │       └── SdaTest.java
│   │   └── resources
│   │       ├── TutorialPoint.feature         # Gherkin feature file
│   │       └── chromedriver
```

## 📋 Project Description

The testing was divided into **two main parts**:

### 1. 🔸 Form Testing (Selenium only)
- **Website:** [Selenium Automation Practice](https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php)
- Automated testing of a web form: first name, last name, gender, years of experience, date picker, professions, tools, etc.
- **Goal:** to verify that the form accepts input correctly and that the submit button functions properly
- Implemented in Java using Selenium WebDriver (without BDD)

### 2. 🔸 Checkbox Testing with BDD
- **Website:** [Checkbox Practice](https://www.tutorialspoint.com/selenium/practice/check-box.php)
- Test scenarios written in **Gherkin syntax** (located in `TutorialPoint.feature`)
- Step definitions implemented in **Java** using **Cucumber** and **Selenium WebDriver**
- Tested requirements:
  - REQ-C1 – Selecting a single checkbox should check it
  - REQ-C2 – Checking all child checkboxes should also check the parent checkbox
  - REQ-C3 – Checking/unchecking the parent checkbox should (un)check all child checkboxes

## ▶️ How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/Veronika-91/SDA_finalTesting.git
   ```

2. Open the project in IntelliJ IDEA

3. Make sure Java SDK and Maven are installed

4. Run the tests from `SdaTutorialPointBdd.java` as a JUnit test

---

## 📌 Notes

- Tests run in Chrome – ensure the `chromedriver` version matches your Chrome browser.
- The form test and the checkbox test are handled separately, one with plain Selenium, the other using BDD via Cucumber.

### ✅ Sample Test Result

**Form Test Result**
Below is a screenshot from IntelliJ IDEA showing a successful execution of a Form acception of the inputs:

![Form Test Result]

**BDD Test Result**
Below is a screenshot from IntelliJ IDEA showing a successful execution of a BDD scenario using Gherkin syntax and Cucumber framework:

![BDD Test Result] BDD_Gherkin_testResults.png 
