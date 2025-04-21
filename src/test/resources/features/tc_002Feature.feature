Feature: Validar carga de documento con formato no permitido

  Scenario: Intentar cargar un documento en formato .exe o .bat
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona un documento en formato ".exe" o ".bat"
    Then el sistema rechaza el archivo y muestra un mensaje de error
    And el proceso de carga no se inicia