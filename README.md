## Goal
The goal of the project is to build custom test framework which tests open API page:
https://jsonplaceholder.typicode.com/


## How to run tests
### 1. Gradle Commands
1. Clean tests reports from previous run/s 
`gradle clean`

2. Build project without test execution
`gradle build -x test`

3. Execute tests by running regression
`gradle test --tests "org.example.suites.RegressionSuite"`

### 2. Using Suite file
or by running any `suite` file.

### 3. Running tests by tags
It is also possible to run tests by tag:
`gradle test -Dtags=full` however all tests will be executed (all regression and all suites) which means test duplication

### 4. Using GitHub Actions
1. Go to GitHub Actions

2. Go to action: `GitHub Action Test Run - Report in gh-pages`

3. Set the environment (`dev` env is created to see all reports failed, on `qa` each test pass)

4. Run workflow

5. Switch to branch `gh-pages`, pull changes

6. Verify report


## How to generate Allure report
Once tests are executed:

Generate report
`allure serve build/allure-results`

or use gradle allure plugin:
`gradle allureServe`

or use:
`gradle allureReport`

Report will be generated and you can open it by opening: `./build/reports/allure-report/allureReport/index.html`

#### Note 
remember to use `gradle clean` to not duplicate results in allure report