@TPFinal
Feature: Crear una tarea con fecha y hora en el Tracker

  @horasTrabajadas
  Scenario: Registrar una tarea con fecha y hora en el título
    Given se muestra la pagina del Tracker
    When hago clic en el campo de título
    And completo el título de la tarea con fecha y hora
#  con el formato DD/MM/YYYY HH:MM
    And inicio el seguimiento del tiempo
    And detengo el seguimiento del tiempo
    Then se crea una tarea con el título y la fecha y hora especificados




//titulo
  //input[@name='autocomplete-input']



  //start
  //button[contains(@class, 'cl-btn-primary') and contains(@class, 'cl-btn-sm')]


    //stop
  //button[contains(@class, 'cl-btn-danger') and contains(@class, 'cl-btn-sm')]








