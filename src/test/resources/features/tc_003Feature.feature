Feature: Validar rechazo de documentos que exceden el tamaño permitido

  Scenario: El sistema rechaza un documento que excede el límite de tamaño
    Given que el usuario está en la página de carga de documentos
    When el usuario selecciona un documento que supera el límite de tamaño permitido
    Then el sistema identifica que el archivo es demasiado pesado
    And muestra el mensaje de error 'Archivo excede el tamaño permitido'