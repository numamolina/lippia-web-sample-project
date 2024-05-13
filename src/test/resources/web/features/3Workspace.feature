@Workspace
Feature: Como usuario registrado de Clockify necesito crear un nuevo espacio de trabajo

  Background: El usuario registrado y logueado se encuentra en el area de Tracker

  @ingresoWorkspaces @Workspace
  Scenario Outline: El usuario administra los workspaces a traves de un menu
    Given Estoy en el area de Tracker
    And Hago clic en el menu de Workspaces
    And Hago clic en Manage Workspaces
    Then ingreso a los Workspaces disponibles

  @creacionDeWorkspace @Workspace
  Scenario: Crear un nuevo Workspace desde la administración de Workspaces
    Given ingreso a los Workspaces disponibles
    And Hago clic en Create New Workspace
    And Completo el campo del modal con el nombre "nuevo"
    Then El espacio se crea y se activa por defecto

