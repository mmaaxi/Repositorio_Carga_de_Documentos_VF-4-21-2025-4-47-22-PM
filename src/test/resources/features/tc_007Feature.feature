Feature: Validar seguridad en la carga de documentos

  Scenario: Intentar cargar un documento desde un origen no autorizado
    Given El usuario intenta cargar un documento desde un origen no autorizado
    When El sistema revisa el origen del documento
    Then El sistema bloquea la acción
    And Muestra un mensaje de error de seguridad

  Scenario: Verificar registros de auditoría
    Given Se ha intentado cargar un documento desde un origen no autorizado
    When Se verifica el log de seguridad del sistema
    Then Se genera un registro en el log de seguridad del sistema