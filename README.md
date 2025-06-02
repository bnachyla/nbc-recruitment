# Introduction
* API documentation in PL/ENG [available here](http://api.nbp.pl/en.html)

### API Description
The National Polish Bank API provides various of endpoints, but in this task we will focus only on the small part of its functionality.
You can read data from three kind of tables : 
* Table Rates - exchange rates fo US Dollar
* Table B - mean rates of foreign currencies (but different from the one in A)
* Table C - rates of buy/sell operations of foreign currencies (most popular one)

Example answers from this API look as follows :
```json
[
  {
    "table": "Rates",
    "no": "056/A/NBP/2021",
    "effectiveDate": "2021-03-23",
    "rates": [
      {
        "currency": "bat (Tajlandia)",
        "code": "THB",
        "rate": 0.1251
      },
      {
        "currency": "American Dollar",
        "code": "USD",
        "rate": 1.0
      },
      {
        "currency": "Australlian Dollar",
        "code": "AUD",
        "rate": 2.9574
      },
      {
        "currency": "Candaian Dollar",
        "code": "CAD",
        "rate": 3.0657
      },
      {
        "currency": "afgani (Afganistan)",
        "code": "AFN",
        "rate": 0.049458
      }
    ]
  }
]
```
## What we want you to do

`` You're provided with the class `CurrencyWallet`. Inside this class you can only find an BigDecimal `budget` in US dollars. Please implement all the necessary things in the class in order to be able to perform following task
    * Create endpoint which with given budget tries to buy one unit of each currency
    * Check if you have enough money in your budget to buy all the currencies. If not, try to show it somehow. 
    * Implement endpoint `/balance` which displays how much money you have left in the budget and what currencies you have bought.
``
