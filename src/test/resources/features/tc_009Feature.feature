Feature: Validar restricciones en el nombre del archivo

  Scenario: Archivo con caracteres especiales en el nombre
    Given el usuario selecciona un archivo con caracteres especiales en el nombre
    When el sistema valida el nombre del archivo
    Then se muestra un mensaje indicando 'Nombre de archivo no permitido'