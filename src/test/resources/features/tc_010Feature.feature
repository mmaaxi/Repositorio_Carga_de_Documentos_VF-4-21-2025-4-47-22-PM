Feature: Validar generación de log y auditoría de la carga

  Scenario: Realizar y auditar la carga de un documento con éxito
    Given El usuario está en la página de carga de documentos
    When El usuario carga un documento exitosamente
    Then El sistema registra la operación en el log de auditoría
    When El usuario consulta el log de auditoría post-carga
    Then Se visualizan detalles como fecha, usuario y estado de la operación