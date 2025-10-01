# Coffee Cart Automation

Selenium automation framework for testing the [Coffee Cart Application](https://coffee-cart.app/).

## Features

- Page Object Model design pattern
- Cross-browser testing (Chrome, Firefox, Edge)
- Parallel test execution with TestNG
- Data-driven testing with CSV support
- Screenshot capture on test failures
- TestNG reporting

## Prerequisites

- Java 11+
- Maven 3.6+
- Chrome/Firefox/Edge browsers

## Setup

1. Clone the repository
   ```bash
   git clone https://github.com/geekyharshal/CoffeeCartAutomation.git
   cd CoffeeCartAutomation
   ```

2. Install dependencies
   ```bash
   mvn clean install
   ```

3. Run tests
   ```bash
   mvn test
   ```

## Configuration

Edit `resources/config.properties`:
```properties
browser=chrome
url=https://coffee-cart.app
implicit.wait=10
explicit.wait=20
```

## Test Data

Update `src/test/resources/testdata.csv` with test data for coffee items and customer information.

## Project Structure

```
src/main/java/com/coffeecart/
├── data/TestDataProvider.java
├── managers/DriverManager.java
├── pages/
│   ├── BasePage.java
│   ├── MenuPage.java
│   ├── CartPage.java
│   └── CheckoutPage.java
└── utils/
    ├── ConfigReader.java
    └── ExcelReader.java

src/test/java/com/coffeecart/
├── tests/
│   ├── MenuTests.java
│   ├── CartTests.java
│   └── CheckoutTests.java
├── listeners/TestListener.java
└── suites/TestNGRunner.java
```

## Running Tests

```bash
# All tests
mvn test

# Specific browser
mvn test -Dbrowser=chrome

# Single test class
mvn test -Dtest=MenuTests

# Programmatic execution
java -cp target/classes:target/test-classes com.coffeecart.suites.TestNGRunner
```

## Reports

- TestNG Reports: `target/surefire-reports/index.html`
- Screenshots: `output/screenshots/`
- Logs: `output/logs/`

## Browser Support

- Chrome (default)
- Firefox
- Edge