# Solucion Desafio 1 Andres Cid Benitez

Este proyecto expone un API REST que entrega la siguiente información:

*id*: identificador
*fechaCreacion*: Fecha de inicio de la secuencia
*fechaFin*: Fecha de fin de la secuencia
*fechas*: Lista de fechas que están en el rango de la fecha que se encuentra en “fechaCreacion” hasta la fecha “fechaFin”
*fechasFaltantes*: Lista de fechas que faltan en el rango de fechas del campo “fechas”

Ejemplo.
```json
{
    "id": 6,
    "fechaCreacion": "1969-03-01",
    "fechaFin": "1970-01-01",
    "fechas": [
      "1969-03-01",
      "1969-05-01",
      "1969-09-01",
      "1970-01-01"],
    "fechasFaltantes": [
      "1969-04-01",
      "1969-06-01",
      "1969-07-01",
      "1969-08-01",
      "1969-10-01",
      "1969-11-01",
      "1969-12-01"]
}
```
*Nota*:
El formato de las fechas es yyyy-MM-dd


# Detalle de los sistemas

Java 8
Spring-Boot 2.1.4.RELEASE
Maven 3.6.1


# Compilar y ejecutar el proyecto
*Nota*:
Para que el ws del proyecto retorne el JSON esperado, es necesario que se esté ejecutando en paralelo, 
el proyecto "Generador Datos Desafio", en caso contrario se retornará un mensaje de error.

Para copilar el proyecto se requiere Java y Maven instalado.
Ingresar al directorio *desafio_1* ejecutar el siguiente comando *maven*

```bash
mvn package
```

Luego de compilar el proyecto ingresar al directorio *target* ejecutar el siguiente comando *java*

```bash
java -jar .\desafio_1-0.0.1-SNAPSHOT.jar
```
*Nota*:
Debe estar disponible el puerto *8090* en el PC donde se ejecute esta API


Para consumir el servicio se debe invocar la siguiente URL

```bash
curl -X GET --header 'Accept: application/json' 'http://127.0.0.1:8090/periodos/resultado'
```
