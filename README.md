# ☕ Coffee Cart Automation Framework

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()
[![Java](https://img.shields.io/badge/Java-11+-orange)]()
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue)]()
[![Selenium](https://img.shields.io/badge/Selenium-4.15.0-green)]()
[![TestNG](https://img.shields.io/badge/TestNG-7.8.0-red)]()


A robust Selenium automation framework using Page Object Model and TestNG for testing the [Coffee Cart Application](https://coffee-cart.app/).

## 🚀 Features

- **Page Object Model** design pattern
- **Cross-browser testing** (Chrome, Firefox, Edge)
- **Parallel test execution** with TestNG
- **Data-driven testing** with CSV support
- **Screenshot capture** on test failures
- **Comprehensive reporting** (TestNG, Extent Reports)
- **Thread-safe WebDriver** management
- **Robust element handling** with fallback strategies

## 📋 Prerequisites

- **Java 11+**
- **Maven 3.6+**
- **Chrome/Firefox/Edge** browsers

## 🛠️ Quick Start

1. **Clone Repository**
   ```bash
   git clone https://github.com/your-username/CoffeeCartAutomation.git
   cd CoffeeCartAutomation
   ```

2. **Install Dependencies**
   ```bash
   mvn clean install
   ```

3. **Run Tests**
   ```bash
   # All tests
   mvn test
   
   # Specific browser
   mvn test -Dbrowser=chrome
   
   # Programmatic execution
   java -cp target/classes:target/test-classes com.coffeecart.suites.TestNGRunner
   ```

## ⚙️ Configuration

Edit `resources/config.properties`:
```properties
browser=chrome
url=https://coffee-cart.app
implicit.wait=10
explicit.wait=20
```

## 📊 Test Data

Update `src/test/resources/testdata.csv` with:
- **Coffee Items**: Menu test data (ItemName, Quantity, Price)
- **Customer Data**: Checkout information
- **Validation Data**: Email and form validation tests

## 📁 Project Structure

```
src/main/java/com/coffeecart/
├── data/
│   └── TestDataProvider.java      # Centralized test data management
├── managers/
│   └── DriverManager.java         # Thread-safe WebDriver management
├── pages/
│   ├── BasePage.java              # Base page with common methods
│   ├── MenuPage.java              # Coffee menu interactions
│   ├── CartPage.java              # Shopping cart operations
│   └── CheckoutPage.java          # Checkout process handling
└── utils/
    ├── ConfigReader.java          # Configuration file reader
    └── ExcelReader.java           # CSV data reader

src/test/java/com/coffeecart/
├── tests/
│   ├── MenuTests.java             # Menu functionality tests
│   ├── CartTests.java             # Cart operations tests
│   └── CheckoutTests.java         # Checkout process tests
├── listeners/
│   └── TestListener.java          # TestNG event listeners
└── suites/
    └── TestNGRunner.java          # Programmatic test runner
```

## 📈 Reports & Output

- **TestNG Reports**: `target/surefire-reports/index.html`
- **Screenshots**: `output/screenshots/` (captured on failures)
- **Extent Reports**: `test-output/ExtentReport.html`
- **Logs**: `output/logs/`

## 🎯 Test Execution Options

| Method | Command | Use Case |
|--------|---------|----------|
| **Maven** | `mvn test` | CI/CD pipelines, command line |
| **TestNG XML** | `mvn test -DsuiteXmlFile=resources/testng.xml` | Custom test configurations |
| **Programmatic** | `java com.coffeecart.suites.TestNGRunner` | IDE execution, debugging |
| **Single Test** | `mvn test -Dtest=MenuTests` | Individual test class |
| **Specific Method** | `mvn test -Dtest=MenuTests#testAddEspresso` | Single test method |

## 🌐 Browser Support

| Browser | Status | Notes |
|---------|--------|-------|
| **Chrome** | ✅ Default | Auto-managed via WebDriverManager |
| **Firefox** | ✅ Supported | Auto-managed via WebDriverManager |
| **Edge** | ✅ Supported | Requires network access for driver |

## 🧪 Test Categories

- **Menu Tests**: Item display, adding to cart, menu navigation
- **Cart Tests**: Add/remove items, quantity updates, total calculations
- **Checkout Tests**: Form validation, order submission, success verification
- **Cross-browser Tests**: Parallel execution across multiple browsers

## 🔧 Advanced Features

- **Robust Element Handling**: JavaScript click fallbacks for stubborn elements
- **Smart Waits**: Dynamic waiting strategies for better reliability
- **Parallel Execution**: Multi-threaded test execution for faster feedback
- **Data-Driven Testing**: CSV-based test data management
- **Screenshot on Failure**: Automatic capture for debugging
- **Thread-Safe Design**: Concurrent test execution without conflicts

## 🐛 Issues & Support

If you encounter any issues or have questions:
1. Check existing [GitHub Issues](https://github.com/your-username/CoffeeCartAutomation/issues)
2. Create a new issue with detailed information
3. Include browser version, OS, and error logs

## 📊 Test Results

- **Total Tests**: 32
- **Success Rate**: 100% ✅
- **Browsers Tested**: Chrome, Firefox
- **Last Updated**: October 2025

