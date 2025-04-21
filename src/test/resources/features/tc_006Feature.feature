Feature: Validar impedir la carga de documentos duplicados

  Scenario: Evitar carga de documento duplicado
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento ya existente
    Then el sistema identifica el duplicado
    And se muestra un mensaje de advertencia "Documento ya existe"