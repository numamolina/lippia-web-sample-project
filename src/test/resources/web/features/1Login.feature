@landingPage @login1
Feature: Iniciar sesión en Clockify
  Como usuario de Clockify quiero poder iniciar sesión correctamente,
  para acceder a mi cuenta y utilizar las funcionalidades

  @LoginLink @login1
  Scenario: Homepage de Clockify
    Given estoy en la landing page de Clockify
    When hago clic en el link inicia la sesion
    Then el sistema muestra el formulario de login

  @loginManually @login1
  Scenario: El cliente elige ingresar manualmente las credenciales
    Given el sistema muestra el formulario de login
    When  hago clic en Login manually
    Then el sistema muestra el formulario especifico de ingreso manual

  @credencialesManuales @login1
  Scenario: El cliente ingresa credenciales validas
    Given el sistema muestra el formulario especifico de ingreso manual
    When ingreso el usuario "numamolina19@gmail.com"
    And ingreso la contrasena "123455"
    And hago clic en el boton Log in
    Then Ingreso al area de Tracker

