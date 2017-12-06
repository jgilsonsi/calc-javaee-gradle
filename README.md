# calc-javaee-gradle
This is a simple project REST API using JavaEE and Gradle. 

## REST interface details:

### Sum:

* URL: \<context-root\>/rest/calc/sum
* Method: GET
* Params:
  * `first` (query param)
  * `second` (query param)
* Response: JSON ( `{ "first": 1, "second": 2, "result": 3 }` ).
* Status code: 200


### Subtract:

* URL: \<context-root\>/rest/calc/subtract
* Method: POST
* Params:
  * `first` (form param)
  * `second` (form param)
* Response: JSON ( `{ "first": 1, "second": 2, "result": -1 }` ).
* Status code: 200


### Add client:

* URL: \<context-root\>/rest/client
* Method: POST
* Params:
  * `name` (form param)
  * `email` (form param)
* Response: empty
* Status code: 204


### Read clients:

* URL: \<context-root\>/rest/client
* Method: GET
* Params: empty
* Response: JSON ( `{ "1, jgilson, jgilsonsi@gmail.com" }` )
* Status code: 200
