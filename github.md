# GITHUB
 
La guía para seguir los diferentes apartados está <a href="https://www.youtube.com/watch?v=3GymExBkKjE">aquí</a>.

## CREACIÓN DE UNA CUENTA EN GITHUB

En primer lugar, create una nueva cuenta en **GitHub**, que es la red social por excelencia de los programadores. Si ya la tienes creada del primer trimestre no pasa nada, porque para realizar los ejercicios propuestos necesitarás dos cuentas.

## CAMBIO DE LA FOTO DE PERFIL

Para empezar a dar forma a tu profile cambia tu foto de perfil, ya bien por una foto tuya o un avatar.

## CREACIÓN DE BIO

Redacta una descripción, en la que como mínimo debe aparecer "Estudiante del ciclo "x" en el CIPFP de Cheste", además de incorporar algún emoji. Por último, añade una location.

Encuentra una lista de emojis aquí <a href="https://gist.github.com/rxaviers/7360908">aquí</a>.

## CREACIÓN DE LA PÁGINA INICIAL

Este repositorio, que debe llamarse igual que tu nombre de usuario, será el primero que verán al visitar tu perfil. Dentro de este repositorio debe encontrarse el readme.md que servirá de presentación personal.

Estas páginas iniciales pueden contener aspectos como:

1. Habilidades y tecnologías
2. Proyetos personales
3. Experencia Laboral
4. Educación
5. Datos de contacto
6. Hobbies e intereses
7. Editores de código o entornos de desarrollo que dominas
8. Estadísticas en GitHub

Podéis redactar este readme.md desde **GitHub** o clonando vuestro repositorio en local, pero lo haremos desde el navegador porque todavía no sabemos como clonar el repositorio.

Este documento lo tenéis que redactar en **Markdown**, que es un lenguaje de marcas que permite agregar formato a un texto plano y después convertirlo fácilmente a HTML. Se trata del lenguaje por excelencia utilizado hoy en día para redactar la documentación en proyectos de software.

![Resumen de la sintaxis de Markdown](https://github.com/furriol/pruebas_unitarias/blob/main/assets/img/resumen_markdown.PNG)

En el siguiente enlace encontrarás diferentes plantillas para redactar una página inicial de tu cuenta de GitHub.

<a href="https://github.com/kautukkundan/Awesome-Profile-README-templates">Plantillas</a>

**¿Qué tengo que incorporar de manera obligatoria en mi perfil para completar la tarea?**

1. Una breve descripción personal y proyección.
2. Lenguajes y herramientas que se manejan (con imágenes)
3. GitHub Stats
5. Educación: formación pasada y actual, cursos, certificaciones, ...
6. Apartado de últimos proyectos, en los que se muestren las "cards" del repositorio. Si no tenéis lo inventáis creando un nuevo repositorio.
7. Emojis
8. Información de contacto
9. Elementos extra que os gusten de las plantillas
10. Listas, negrita, cursiva, enlaces, imágenes y encabezados de Markdown

## AUTENTICACIÓN SSH

Una vez completado el readme.md de tu página incial vamos a proceder a autenticar nuestro PC dentro de GitHub. Necesitamos vincular nuestro ordenador con la cuenta de GitHub para así poder hacer cambios en nuestro repositorio remoto desde la consola de **Git Bash**.

Para ello vamos a emplear la autenticación SSH, que se trata de un proceso en el que se verifica el acceso a un sistema remoto. 

Tenemos otra opción que sería emplear un user name y una password, pero podemos correr riesgos si la conexión no es segura o la contraseña no es suficientemente robusta, por ello esta autenticación resuelve estos problemas.

El usuario crea dos claves, una pública y otra privada. La clave pública se establece en el servidor remoto (Git Hub). Cuando intentamos conectarnos a un servidor remoto,  nuestro ordenador envía la clave pública al servidor y si coincide con la que hay en el servidor, este emplea la clave pública para cifrar un mensaje que es enviado a nuestro ordenador y que solo puede descifrarse con la clave privada. Si se descifra este mensaje se permite la conexión.

Git Hub contiene diferentes guías en castellano para completar este proceso:

<a href="https://docs.github.com/es/authentication/connecting-to-github-with-ssh"><b>Guía</b></a>

**Completa la autenticación SSH para poder continuar**

## TRABAJO BÁSICO CON GIT & GIT HUB

A la hora de trabajar con proyectos tenemos dos opciones. En primer lugar, tener un proyecto en local y querer subirlo a Git Hub. En segundo lugar, podemos haber creado un repositorio remoto y querer clonarlo en nuestro ordenador.

En el primero de los casos tenemos que vincular un repositorio remoto a uno local (que ya teníamos creado previamente). La explicación está aquí <a href="https://youtu.be/3GymExBkKjE?t=10953"><b>aquí</b></a>.

En el segundo, podemos crear un remositorio remoto y clonarlo en nuestro ordenador a través de **SSH** con un enlace que tiene la siguiente forma:

***git@github.com:user_name/repository_name.git***

Prueba los dos métodos que se han mencionado anteriormente. Para el primer caso, utiliza el repositorio que empleamos en la primera parte de la unidad (GIT) y para el segundo puedes crear únicamente un repositorio con un readme.md.

## SUBIR CAMBIOS AL REPOSITORIO REMOTO Y VICEVERSA

Vamos a utilizar el repositorio que habíamos creado en la sesión anterior. Hasta ahora tenemos la última versión tanto en remoto como en local, porque no hemos hecho ningún commit ni desde GitHub ni desde Git. Pues bien, ahora vamos a hacer un cambio en local y vamos a actualizar el repositorio remoto. Los pasos son los siguientes:

```
git add <nombre_fichero>
git commit -m "mensaje del commit"
git push
```
Sin embargo también podemos hacer cambios desde el propio GitHub y traer esos cambios a local. Es decir, es como si hacemos cambios desde el ordenador de clase, los subimos al repositorio remoto y después desde casa rescatamos los cambios que habíamos hecho en clase.

Haz un cambio en el readme.md del repositorio desde GitHub y haz commit de esos cambios. Después, desde Git Bash ejecutamos el siguiente comando:

```
git pull
```

Fíjate como se han traído los cambios que habíamos hecho desde el repositorio remoto.

## DIFERENTES VERSIONES EN LOCAL Y REMOTO

El apartado anterior supone un caso perfecto en el que únicamente yo estoy editando el repositorio, pero ¿qué pasa si cuando llego a casa después de clase me pongo a editar el repositorio sin hacer antes un **git pull**?

Pues bien, cuando quiera subir los cambios al repositorio remoto me rechazrá el push y mostrará el mensaje de que tengo cambios en remoto que no tenía en local, por lo tanto no puedo hacer el **git push**. Primero tenemos que traer esos cambios a local.

Para ello empleamos **git pull**, y si hay algún conflicto nos pedirá que lo solucionemos y después hagamos un merge de las dos versiones. La forma más sencilla de solucionar los conflictos es utilizar **VSCode**.

Como tarea de este apartado se propone que, partiendo desde la misma versión del repositorio, hagas un commit desde remoto en la primera línea del readme.md del proyecto. Después haz otro cambio en la primera línea del readme.md. Intenta llevar los cambios al repositorio remoto y verás como nos es posible. Soluciona el conflicto y quédate con los cambios que prefieras.  La explicación está aquí <a href="https://youtu.be/3GymExBkKjE?t=11422"><b>aquí</b></a>.

También es interesante mencionar otro comando de GIT:

```
git fetch
```

Con este comando se trae SOLO a local el historial de cambios. Lo puedes comprobar haciendo:

```
git log --oneline --all
```

## CONTRIBUCIONES ENTRE DIFERENTES USUARIOS

Imaginemos que el profesor crea un repositorio remoto con el código de un proyecto en Java, el cual quiere que vayais mejorando individualmente. Lo que podrías hacer como alumno sería hacer un **git clone** de ese proyecto (que debe ser público) en tu ordenador. De esta forma, tendríamos una copia de ese repositorio en local.

Te propongo que desde tu cuenta antigua de GitHub, crees un repositorio con únicamente un README. Después, desde tu nueva cuenta, la cual tienes vinculada a tu ordenador, clona el repositorio a local. Ahora haz un cambio en el README y prueba a subir ese commit al repositorio remoto. Verás como no tenemos permiso para poder hacer cambios en el repositorio, **PORQUE NO SOMOS COLABORADORES**.

**¿Qué podemos hacer para solucionar esto?**

Necesitamos hacer un FORK del proyecto, es decir, una copia del proyecto en nuestra cuenta, en la que iremos haciendo cambios y después solicitaremos al propietario que revise nuestros cambios para ver si se pueden introducir al proyecto. Esta petición se llama **PULL REQUEST**.

La explicación está aquí <a href="https://youtu.be/3GymExBkKjE?t=12095"><b>aquí</b></a> y es muy necesario que se vea hasta la parte de solución de conflictos en las pull request.


## TAREA PULL REQUEST

Añade al readme del siguiente repositorio tu nombre y apellidos.

https://github.com/furriol2/nombres_daw

Si lo has hecho correctamente me llegará una pull request que aceptaré y podrás ver que tu nombre aparecerá en el repositorio.

**¿Pero que pasa con los cambios que hagan los demás compañeros?**

Esos cambios los podrás ver si sincronizas los cambios en el fork que hayas hecho. Te recomiendo que antes de hacer cambios actualices el repositorio para evitar que surjan conflictos. En el tutorial se explica como podemos sincronizarlo.


## TAREA DE FLUJO COLABORATIVO

Teníamos un repositorio público creado en una cuenta antigua de GitHub, y además habíamos creado otra cuenta nueva y la habíamos vinculado a nuestro ordenador a través de la autenticación SSH.

Ahora tienes que hacer un fork del repositorio desde tu cuenta nueva. Cuando lo hayas hecho vamos a clonar ese fork en local para poder hacer cambios.

En primer lugar, haz un cambio desde local en el archivo README y después haz una **pull request** para que desde tu cuenta antigua puedas aceptar esos cambios y que se incorporen al repositorio original y no solo en el fork. Es decir, se va a hacer un merge para introducir esos cambios.

En segundo lugar, vamos a generar un conflicto. Vamos a cambiar desde GitHub la línea 1 del original del proyecto y desde la otra cuenta (desde el fork) también vamos a modificar esa misma línea. A continuación, repetimos la misma operación y tratamos de incorporar los cambios del fork al repositorio original. Vemos como va a surgir un conflicto al tratar de aceptar la pull request, solucionalo y posteriormente haz un merge. Verás como ahora tienes la misma versión en el fork y en repositorio original.





