@TPFinal
Feature: Modificar una entrada de datos

  Background:
#    Login
    Given estoy en la pagina de inicio de Clockify
    And hago clic en el enlace Inicia la sesion
    And el sistema muestra las opciones de login
    And selecciono Log in manually
    And el sistema muestra el formulario de login
    And ingreso el usuario numamolina19@gmail.com
    And ingreso la contrasena 123455
    And hago clic en el boton LOG IN
    And se muestra la pagina del Tracker
#    Creacion de tarea nueva
    And hago clic en el campo de titulo de la nueva tarea
    And completo el título de la tarea con la fecha y hora actual
    And hago clic en el modo timer
    And inicio el seguimiento del tiempo haciendo clic en el botón Start
    And detengo el seguimiento del tiempo haciendo clic en el botón Stop
    And se crea la tarea satisfactoriamente

  @ModificarTareaRegistrada
  Scenario: Modificar una tarea existente en el tracker
    When modifico el titulo de una tarea creada
    And modifico la hora de inicio de tarea
    And modifico la hora de fin de la tarea
    Then se modifica la tarea satisfactoriamente

