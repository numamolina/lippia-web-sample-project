Feature: As a potential client i need to search in google to find a web site
#Alumno: Numa Roy, Molina Pauluk

  @Tp3
  Scenario Outline: The client search by different keywords
    Given The client is on google page
    When The client search for word <keyword>
    Then The client verify that results are shown properly

    Examples:
      | keyword         |
      | Crowdar Academy |
      | Calidad         |
      | Software        |
      | Testing         |