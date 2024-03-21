## Goal
The goal of the project is to build custom test framework which tests open API page:
https://jsonplaceholder.typicode.com/


## How to run tests
1. Clean tests 
`gradle clean`

2. Execute tests 
`gradle test`

or by running any `suite` file.

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