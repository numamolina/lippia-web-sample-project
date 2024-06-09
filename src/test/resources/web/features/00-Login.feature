@TPFinal
Feature: Login en el website de Clockify

  @login
  Scenario Outline: Iniciar sesion en Clockify
    Given estoy en la pagina de inicio de Clockify
    When hago clic en el enlace Inicia la sesion
    And el sistema muestra las opciones de login
    And selecciono Log in manually
    And el sistema muestra el formulario de login
    And ingreso el usuario <email>
    And ingreso la contrasena <pass>
    And hago clic en el boton LOG IN
    Then se muestra la pagina del Tracker

    Examples:
      | email                  | pass   |
      | numamolina19@gmail.com | 123455 |


