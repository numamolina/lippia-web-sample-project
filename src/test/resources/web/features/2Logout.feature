@Logout
Feature: Como usuario de Clockify, necesito hacer un logout correcto

  Background: El usuario se encuentra logueado en el area de Tracker

  @Logout
  Scenario: Logout correcto
    Given Estoy en el area de Tracker
    When hago clic en el boton "NM"
    And hago clic en el boton Logout
    Then La sesion se cierra correctamente
