Feature: Validar la carga de documentos en diferentes formatos soportados

  Scenario: Cargar y verificar documentos en formato DOCX y XLSX
    Given que el usuario está en la página de carga de documentos
    When el usuario selecciona un documento en formato DOCX
    Then el sistema acepta y procesa el formato DOCX
    When el usuario selecciona un documento en formato XLSX
    Then el sistema acepta y procesa el formato XLSX
    And se verifica la correcta integración y apertura de los documentos
    Then cada documento se muestra conforme a su formato