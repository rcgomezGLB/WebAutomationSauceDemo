# POM Practice

## Overview

This project automates the [Sauce Demo](https://www.saucedemo.com/) web application using Selenium, Java, and TestNG. The framework is designed following the Page Object Model (POM) principles to ensure maintainability and reusability of code.

## Project Structure

The project is structured as follows:

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── rcgomez
│   │   │           ├── pages
│   │   │           └── util
│   │   └── resources
│   └── test
│       └── java
│           ├── base
│           └── com
│               └── rcgomez
│                   └── tests
```

## Requirements

- Java 8 or higher
- Maven
- TestNG
- Selenium WebDriver

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/rcgomezGLB/WebAutomationSauceDemo
   cd WebAutomationSauceDemo
   ```

2. **Install dependencies**:
   Ensure you have Maven installed, then run:
   ```bash
   mvn clean install
   ```

3. **Run Tests**:
   You can run the tests using the following command:
   ```bash
   mvn test
   ```

## Test Scenarios

The following scenarios are implemented as separate tests:

1. **Purchase a Product**:
    - Select a random product from the inventory.
    - Add the product to the shopping cart.
    - Enter personal data (first name, last name, postal code).
    - Verify successful navigation to the "Thank you for your purchase" page.

2. **Removing Elements from the Shopping Cart**:
    - Add three different products to the shopping cart.
    - Navigate to the cart page and remove all items.
    - Verify that the shopping cart is empty.

3. **Logout**:
    - Perform a logout operation.
    - Verify that the user is redirected to the login page.

## Implementation Guidelines

- **Page Object Model**: Ensure that the POM is correctly implemented, reusing elements and defining base pages for common methods and elements.
- **Page Factory**: Utilize the Page Factory pattern for initializing page objects.
- **Annotations**: Use `@Before` annotations to manage preconditions and any other required annotations as needed.