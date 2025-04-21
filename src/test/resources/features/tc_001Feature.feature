Feature: Validación de carga de documento con formato válido

  Scenario: Cargar un documento PDF válido
    Given Estoy en la página de carga de documentos
    When Selecciono un documento en formato PDF válido
    Then El sistema permite la selección de archivos PDF sin error
    When Hago clic en el botón "Cargar Documento"
    Then El sistema inicia el proceso de carga
    When Verifico el mensaje de éxito al completar la carga
    Then Se muestra mensaje: "Carga Exitosa"