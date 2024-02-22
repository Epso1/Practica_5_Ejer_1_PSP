# Practica_5_Ejer_1

## Descripción

Esta aplicación de consola en Java permite al usuario introducir URLs de manera indefinida. Cada URL introducida se añade a un listado. Este listado es observado por la clase `Downloader` que sigue el patrón Observer. Cada vez que se añade una nueva URL al listado, se muestra por pantalla el mensaje: “Se ha iniciado la descarga del archivo URL”, donde la URL es la introducida por el usuario.

## Requisitos del sistema

- Java 11 o superior
- IntelliJ IDEA

## Instalación

Para instalar la aplicación en IntelliJ IDEA, siga estos pasos:

1. Clone el repositorio en su máquina local usando `git clone`.
2. Abra IntelliJ IDEA.
3. En la pantalla de inicio de IntelliJ IDEA, haga clic en `Open`.
4. Navegue hasta el directorio del proyecto y haga clic en `OK`.
5. IntelliJ IDEA abrirá y cargará el proyecto.

## Uso

Para ejecutar la aplicación en IntelliJ IDEA, siga estos pasos:

1. En el panel de `Project`, navegue hasta la clase `Main` (`src/main/java/com/example/practica_5_ejer_1/Main.java`).
2. Haga clic con el botón derecho en el archivo `Main.java` y seleccione `Run 'Main.main()'`.
3. Una vez iniciada la aplicación, se le pedirá que introduzca una URL en la consola de IntelliJ IDEA. Puede introducir tantas URLs como desee.
4. Para salir de la aplicación, introduzca '0' en la consola.

Por favor, tenga en cuenta que esta aplicación no descarga realmente los archivos de las URLs introducidas. Simplemente simula el proceso de descarga mostrando un mensaje en la consola.