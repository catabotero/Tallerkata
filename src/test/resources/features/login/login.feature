
Feature:  Logueo Exitoso y consulta de dias de vacaciones

  Scenario: Se desea ingresar al aplicativo de Tech and manager con usuario y contraseña correcto

    Given ingreso a la url del aplicativo Tech And Manager
    And selecciono la opcion 'Acceder a Tech an Manager'
    And ingreso el correo electronico 'catalina.botero'
    And selecciono la opcion 'Siguiente'
    And ingreso la contraseña "Colombia20*"
    When selecciono la opcion 'Siguiente en el Logueo'
    Then se abre la ventana de tech and manager


 Scenario: Se desea consultar el numero de dias de vacaciones

    Given selecciono la opcion 'vacaciones'
    When selecciono la opcion 'Historial'
    Then  mostrar el numero de dias disponibles de vacaciones
