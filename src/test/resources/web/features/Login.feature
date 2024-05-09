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
    Then Ingreso al area de Dashboard




#    When el cliente hace clic en el link log in de la landing page
#  when el cliente hace clic en login manually
#  when el cliente coloca el email "numamolina19@gmail.com"
#  when el cliente coloca su contrasena "123455
#  when el cliente hace clic en el boton log in
#  then el cliente verifica estar en el dashboard

#  @login
#  Scenario: Visualizar el formulario de inicio de sesión
#    When hago clic en el boton 'Iniciar sesión'
#    Then debería ver el formulario de inicio de sesión
#
#@login
#  Scenario: Iniciar sesión exitosamente con credenciales válidas
#    Given que estoy en la página de inicio de sesión
#    When completo el campo de correo electrónico con "<email>" y el campo de contraseña con "<contrasena>"
#    And hago clic en el botón "Iniciar sesión"
#    Then debería ser redirigido a la sección de usuario registrado
#
#
#    Examples:
#      | email                  | contrasena |
#      | numamolina19@gmail.com | 123455     |

