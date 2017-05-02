@all
@my
Feature: Petstore Feature


  Scenario: CUSTOM STEP DEFINITION
#
    Given content type is "application/json"

    When the client performs GET request on "/store/inventory"
    Then status code is 200
    When client performs my custom GET request on "/store/inventory"
    Then status code is 200


  Scenario: Add a new pet to the store SPECIFY JSON

    Given content type is "application/json"
    Given request body:
        """
{
  "id":  123,
  "category": {
    "id": 0,
    "name": "sharik"
  },
  "name": "doggie",
  "photoUrls": [
    "string"
  ],
  "tags": [
    {
      "id": 0,
      "name": "string"
    }
  ],
  "status": "available"
}
        """

    When the client performs POST request on "/pet"
    Then status code is 200


  Scenario: Add a new pet to the store VARIABLE SUBSTITUTION STRING
    Given let variable "{(name)}" equal to "name"
    And content type is "application/json"
    And request body from file "json/pet_string_substiturion.json"

    When the client performs POST request on "/pet"
    Then status code is 200

  Scenario: Add a new pet to the store VARIABLE SUBSTITUTION INTEGER
    Given let variable "{(client_id)}" equal to "123"
    And content type is "application/json"
    And request body from file "json/pet_integer_substiturion.json"

    When the client performs POST request on "/pet"
    Then status code is 200

