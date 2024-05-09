Feature: Como usuario de Clockify, necesito hacer un logout correcto

Scenario: Logout de usuario
  Given que estoy en la seccion de usuario registrado de Clockify
  When hago clic en el boton "NM"
  Then aparece un "menu desplegable de Opciones de usuario"

Scenario: Login de usuario
  Given que estoy en menú desplegable de opciones de usuario
  And El formulario de "Log in" esta activo
  When Hago clic en la opción "Log out"
  Then Se completa el logout exitoso

