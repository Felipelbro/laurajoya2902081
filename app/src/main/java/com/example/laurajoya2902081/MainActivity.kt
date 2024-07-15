###variables
En Kotlin, las variables se declaran utilizando la palabra clave var. Estas pueden cambiar su valor después de la inicialización.

var nombrePersona = "María"
var edadPersona = 25


###constantes
Las constantes se definen con la palabra clave val. Una vez que se les asigna un valor, no se puede modificar.https://github.com/Felipelbro/laurajoya2902081

val PI = 3.14159
val urlSitio = "https://ejemplo.com"


###Manejo de Nulos
En Kotlin, es necesario especificar si una variable puede ser nula usando el operador ? después del tipo de dato.

var direccion: String? = null
var cantidadItems: Int? = null


###Cadenas de Texto
Kotlin admite varias formas de definir cadenas de texto, incluyendo comillas dobles (") para cadenas de texto simples y comillas triples (""") para cadenas de texto de varias líneas.

var saludo = "¡Hola, mundo!"

var parrafoLargo = """
    Este es un ejemplo
    de una cadena de texto
    que abarca múltiples líneas.
"""

###README.md
El archivo README.md es comúnmente utilizado en proyectos de software para proporcionar información sobre el proyecto, su propósito, instalación, uso y más, todo formateado en Markdown.

# Proyecto Ejemplo en Kotlin

Este es un proyecto de ejemplo escrito en Kotlin.

## Instalación

Para instalar este proyecto, sigue estos pasos:

1. Clona el repositorio.
2. Ejecuta `./gradlew build` para compilar el proyecto.

## Uso

Puedes utilizar este proyecto de la siguiente manera:

```bash
$ java -jar mi-proyecto.jar


###Contribución
¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, por favor envía un pull request.

###Licencia
Este proyecto está licenciado bajo la Licencia Apache 2.0. Consulta el archivo LICENSE para más detalles.