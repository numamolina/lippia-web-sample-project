@TPFinal
Feature: Crear una tarea con fecha y hora en el Tracker

  Background:
    Given estoy en la pagina de inicio de Clockify
    And hago clic en el enlace Inicia la sesion
    And el sistema muestra las opciones de login
    And selecciono Log in manually
    And el sistema muestra el formulario de login
    And ingreso el usuario numamolina19@gmail.com
    And ingreso la contrasena 123455
    And hago clic en el boton LOG IN
    And se muestra la pagina del Tracker


  @RegistroManualHorasTrabajadas
  Scenario: Registrar una tarea con fecha y hora en el título
    When hago clic en el campo de titulo de la nueva tarea
    And completo el título de la tarea con la fecha y hora actual
# Elijo que este en modo manual de ingreso
    And hago clic en el modo manual
    And modifico la hora de inicio de tarea
    And modifico la hora de fin de la tarea
    And inicio el seguimiento de la tarea haciendo clic en el botón Add
    Then se crea el registro de horas