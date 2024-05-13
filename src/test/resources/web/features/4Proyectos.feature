@Projects
Feature: Como usuario registrado quiero poder crear nuevos proyectos dentro de un Workspace

  Scenario: Crear un nuevo proyecto
    Given Estoy en el area de Tracker
    And Genero un nuevo proyecto haciendo clic en Project
    And Hago clic en Create New Project del menu desplegable
    And El sistema muestra un cuadro de dialogo
    And Ingreso el nombre del proyecto "Project"
    And Hago clic en el boton Create
    Then Se crea el proyecto y se selecciona por defecto