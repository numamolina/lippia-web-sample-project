@landingPage @login1
Feature: Iniciar sesión en Clockify
  Como usuario de Clockify quiero poder iniciar sesión correctamente,
  para acceder a mi cuenta y utilizar las funcionalidades

  @LoginLink @login1
  Scenario: Homepage de Clockify
    Given estoy en la landing page de Clockify
    When hago clic en el link Log in
    Then el sistema muestra el formulario de login



    And hago clic en Login manually

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

