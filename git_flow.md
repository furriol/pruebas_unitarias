# GIT FLOW

**Git Flow** es un flujo de trabajo de GIT, que es empleado para controlar el desarrollo de software que se basa en la ramificación del proyecto.
El flujo de trabajo se basa en una serie de ramas:
- Develop
- Main
- Feature
- Release
- Hotfix

Se trata de un estándar que siguen los equipos de trabajo de muchas empresas, pero no es la única forma para trabajar en equipo, existen alternativas como Trunk-Based Development.

Antes de continuar sería conveniente visualizar la parte del tutorial donde se explica. Pincha <a href="https://youtu.be/3GymExBkKjE?t=15520">aquí</a> para verlo.

**Siguiendo este flujo de trabajo vamos a conseguir desarrollar un software de manera estructurada y con la seguridad de tener controlado el código que desarrolla cada componente del equipo**

## RAMAS EN GITFLOW

- **Develop**: Aquí se irán incorporando todas las mejoras (features) que el equipo vaya implementando. Todo lo que hay aquí ha pasado las pruebas.
- **Main**: Es la rama que contiene las diferentes versiones del software y que mandaremos a producción.
- **Feature**: Se crearán tantas como mejoras existan. Los diferentes equipos o personas que se vayan encargando de estas mejoras trabajarán sobre estas ramas.
- **Release**: Es la rama intermedia que creamos para pasar de la rama **develop** a la rama **main**. Cuando esta rama se cierra, crea un tag en **main** y se cierra sobre está y la rama **develop**.
- **Hotfix**: Se emplea para solucionar errores que han surgido después de haber subido el proyecto a producción. Cuando hacemos cambios en esta rama y se cierra, lleva los cambios a **main** y a **develop**.

## ¿CÓMO TRABAJAR CON GIT FLOW?

Para trabajar con estas ramas existen una serie de comandos específicos, pero para ello, después de crear nuestro repositorio, debemos de iniciar git flow.

```
git flow init
```

Ahora vamos a ponernos en situación y vamos a pensar que tenemos un equipo de 4 personas para desarrollar un proyecto en Java.

Lo primero sería que una persona creará el proyecto en su máquina. Una vez creado tendría que crear un repositorio LOCAL para ese proyecto y después iniciar git flow.

Cómo es lógico, cada uno de los miembros del equipo va a trabajar en su ordenador, por lo tanto precisaremos de un repositorio remoto en el que poner en común todo el código.

Ahora, un miembro del equipo creará el repositorio remoto, vacío, para vincularlo con el local.

Tanto dentro del repositorio remoto como local debéis contar con dos ramas: master y develop. Además de hacer colaboradores al resto del grupo y proteger la rama master para que nadie pueda hacer merge con está sin hacer un pull request.

Cuando estos pasos estén completos, cada miembro del equipo tendrá que clonar el repositorio y crear una rama **feature** nueva para cada parte que vaya a desarrollar.
¿Cómo inicio esa nueva rama?

```
git flow feature start feature_name
```

Que en realidad hace:
```
git checkout develop
git checkout -b feature_branch
```

¿Cómo finalizo la rama cuando doy por finalizada la tarea?

```
git flow feature finish feature_name
```
O lo que es lo mismo:

```
git checkout develop
git merge feature_branch
```

Cuando ya se hayan desplegado las suficientes mejoras o ha llegado una fecha determinada, vamos a crear de manera temporal la rama **release** para subir a producción el proyecto. Aquí en esta rama se harán las últimas pruebas, y cuando se cierre se establecerá el número de la versión en un tag. Esta rama hará merge con **master** y con **develop**.

Para hacer una release no hace falta que estén todas las features terminadas.

Por último, cuando cerremos la release tendremos que hacer un push con el tag que hayamos elegido para la versión, por ejemplo **v0.1**.

**¿Cómo subimos a producción las mejoras que hemos ido añadiendo?**

Tenemos que abrir una rama **release**:

```
git flow release start version
```

Ejecutamos las pruebas unitarias y comprobamos que funcionan correctamente. Después cerramos la rama con:

```
git flow release finish 'version'
```

Después comprueba que en GitHub se han llevado todos los cambios pertenecientes al cambio de versión.

## PROYECTO PROPUESTO

Divididos en grupos de 3, vamos a realizar un proyecto en el que vamos a emplear el flujo de trabajo "git flow". Se debe crear una aplicación de funcionalidades en Java, que contará con una pantalla principal y 3 funcionalidades, que podrán ser:

- **ordenaArray**: Un usuario introduce un array de números y se muestran por pantalla ordenados de manera ascedendente y su longitud. No permite introducir valores no numéricos y si ocurre debe lanzar un excepción NegativoExcepction.
- **paresImpares**Un usuario introduce una array de 10 números. Se muestran por pantalla separados por pares o impares, además de mostrar el número más alto o más bajo. No permite introducir valores no numéricos y si ocurre debe lanzar un excepción NegativoExcepction.
- **mediana**: Un usuario introduce una array de números, como mínimo 10. Se calcula y se muestra la mediana. No permite introducir valores no numéricos y si ocurre debe lanzar un excepción NegativoExcepction.

Todas estas funcionalidades deben tener su interfaz gráfica y su clase en la que se realicen las operaciones.

El primer integrante del proyecto que acabe debe realizar la interfaz gráfica principal, con tres botones que permitan acceder a las demás ventanas.

En todas los casos se deben guardar los resultados y poder verse en la interfaz gráfica aunque se vuelva a introducir otro array.

Una vez creadas las clases, vamos a realizar las **pruebas unitarias** para poder posteriormente probar el proyecto en la rama **release**. Para cada clase debe haber al menos 3 casos de prueba.

Cuando se hayan pasado todas las pruebas unitarias en cada una de las fucionalidades se cerrarán y se incorporan a la rama **develop**, pero vamos a hacerlo en el siguiente orden:

1. ordenaArray
2. paresImpares
3. mediana

Lo que queremos es tener 3 versiones de nuestra aplicación:

- v0.1: con ordenaArray
- v0.2: con ordenaArray y paresImpares
- v0.3: con ordenaArray, paresImpares y mediana

Para terminar, tenemos que subir a producción la aplicación que hemos creado a través de la rama **release**. Se quedarán en la rama **master** los 3 tags con las versiones.
