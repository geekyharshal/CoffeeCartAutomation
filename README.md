# Coffee Cart Automation Framework

Selenium automation framework using Page Object Model and TestNG for [Coffee Cart Application](https://coffee-cart.app/).

## Prerequisites

- Java 8+
- Maven 3.6+
- Chrome/Firefox/Edge browsers

## Quick Start

1. **Clone and Setup**
   ```bash
   git clone <repository-url>
   cd CoffeeCartAutomation
   mvn clean install
   ```

2. **Run Tests**
   ```bash
   # All tests with TestNG XML
   mvn test
   
   # Specific browser
   mvn test -Dbrowser=chrome
   
   # Programmatic execution
   java -cp target/classes:target/test-classes com.coffeecart.suites.TestNGRunner
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

Update `resources/testdata.xlsx` with:
- **CoffeeItems**: Menu test data
- **CheckoutData**: Customer information
- **InvalidEmails**: Email validation tests
- **PromoCodes**: Discount code tests
## Project Structure

```
src/main/java/com/coffeecart/
├── data/TestDataProvider.java      # Centralized test data
├── managers/DriverManager.java     # WebDriver management
├── pages/                          # Page Object Model classes
└── utils/                          # Helper utilities

src/test/java/com/coffeecart/
├── tests/                          # Test classes
├── listeners/TestListener.java     # TestNG listeners
└── suites/TestNGRunner.java       # Programmatic runner
```

## Reports

- **TestNG Reports**: `target/surefire-reports/index.html`
- **Screenshots**: `output/screenshots/`
- **Extent Reports**: `test-output/ExtentReport.html`

## Test Execution Options

| Method | Command | Use Case |
|--------|---------|----------|
| Maven | `mvn test` | CI/CD pipelines |
| TestNG XML | `mvn test -DsuiteXmlFile=resources/testng.xml` | Custom configurations |
| Programmatic | `java com.coffeecart.suites.TestNGRunner` | IDE execution |

## Browser Support

- Chrome (default)
- Firefox
- Edge (requires network access for driver download)

## Features

- Page Object Model design pattern
- Data-driven testing with Excel
- Cross-browser parallel execution
- Screenshot capture on failures
- Comprehensive test reporting
- Thread-safe WebDriver management