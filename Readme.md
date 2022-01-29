## Mayor utilidad:
Es capaz de construir, reportar y documentar desde una pieza de informacion central
## Fases de Maven:

## Ciclo de vida de la construccion:

## Para que sirven los pluggins:

## Maven y repositorio central Maven:
Maven es una herramienta que puede ser usada para construir y manejar cualquier projecto basado en Java.
El repositorio central de Maven sirve para aquellos que necesiten dependencia por sus propias construcciones o proyectos que quieran que sus lanzamientos esten en el repositorio central    




# CREAR UN PROYECTO CON MAVEN

Ejecutando el conjunto de instrucciones dado:
![](parte1.png)

Por medio del siguiente codigo:

```
mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart -Dpackage=edu.eci.cvds.patterns -DinteractiveMode=false 

```
* Objetivo del comando `package`: Crea un archivo JAR o WAR para convertir el proyecto en formato distribuible

Con el codigo `mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" -Dexec.args="argument1"`
ejecutamos el proyecto maven.

El parametro `-Dexec.args` nos permite configurar los parametros que se envian al ejecutar el projecto maven