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


  @horasTrabajadas
  Scenario: Registrar una tarea con fecha y hora en el título
    When hago clic en el campo de titulo de la nueva tarea
    And completo el título de la tarea con la fecha y hora actual
    And hago clic en el modo timer
    # aseguro que este en modo timer
    And inicio el seguimiento del tiempo haciendo clic en el botón Start
    And detengo el seguimiento del tiempo haciendo clic en el botón Stop
    Then se crea la tarea satisfactoriamente


  @cancelandoRegistroDeHoras
  Scenario: Cancelar el registro una tarea con fecha y hora en el título
    When hago clic en el campo de titulo de la nueva tarea
    And completo el título de la tarea con la fecha y hora actual
    And hago clic en el modo timer
    And inicio el seguimiento del tiempo haciendo clic en el botón Start
    And despliego las opciones de tarea
    And descarto el seguimiento del tiempo con en el botón Discard
    And confirmo la cancelacion del descarte
    Then el titulo y el contador se reinician


#    xpath tiempo en cero
#  //span[@class='cl-form-control cl-input-time-picker-sum ng-star-inserted']
