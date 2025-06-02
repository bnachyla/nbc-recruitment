# Introduction
* API documentation in PL/ENG [available here](http://api.nbp.pl/en.html)

### API Description
The National Polish Bank API provides various [data](https://nbp.pl/en/statistic-and-financial-reporting/rates/) about exchange rates, but in this task we will focus only on the small part of its functionality.
You can see all necessary data in:
* [Table A](https://nbp.pl/en/statistic-and-financial-reporting/rates/table-a/) - exchange rates for Polish Zloty (PLN) against foreign currencies

The data can be retrieved in json or XML format using API calls, for instance: `api.nbp.pl/api/exchangerates/rates/A` (for format JSON: header `Accept: application/json` or a parameter `?format=json`,
for format XML: header `Accept: application/xml` or parameter `?format=xml`) :
Sample JSON response:
```json
{
  "table": "A",
  "no": "105/A/NBP/2025",
  "effectiveDate": "2025-06-02",
  "rates": [
    {
      "currency": "bat (Tajlandia)",
      "code": "THB",
      "mid": 0.1146
    },
    {
      "currency": "American Dollar",
      "code": "USD",
      "mid": 3.7282
    },
    {
      "currency": "Australian Dollar",
      "code": "AUD",
      "mid": 2.9574
    },
    {
      "currency": "Canadian Dollar",
      "code": "CAD",
      "mid": 3.0657
    },
    {
      "currency": "afgani (Afganistan)",
      "code": "AFN",
      "mid": 0.049458
    }
  ]
}
```

The full API description you can find [here](https://api.nbp.pl/en.html), but please use NBPRestClient in order to access it.

## What we want you to do

You're provided with the class `CurrencyWallet`. Inside this class you can only find a BigDecimal `budget` (in PLN).
Please implement all the necessary things in the class in order to be able to perform following task:

    * Create endpoint which with given budget tries to buy one unit of each currency from the list of currency codes that is given as in input.
    * Check if you have enough money in your budget to buy all the currencies. If not, try to show it somehow. 
    * Implement endpoint `/balance` which displays how much money you have left in the budget and what currencies you have bought.

If you see any issues in the existing code, please propose the fix.