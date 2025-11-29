# 📘 Proyecto: Herencia Simple en SalmonttApp

## 📝 Descripción general del sistema
Este proyecto es una tarea formativa de aprendizaje y está enfocado en la herencia simple, con una clase padre llamada UnidadesOperativa y de la cual se deben crear dos sub-clases llamadas CentroCultivo y PlantaProceso las que deben heredad los atributos y sobre-escribir metodos de la clase Padre.

---
## 🧱 Estructura general del proyecto

```
📦 SalmonttApp_S5/
┣ 📂 .idea/
┣ 📂 src/main
┃ ┣ 📂 java/cl/salmontt
┃ ┃ ┣ 📂 data/		    #Servicios y Lógica general de la gestión de empleados y unidades operativas
┃ ┃ ┣ 📂 model/			#Clases que representan los datos y entidades (Empleado, Persona, Dirección, PlantaProceso, CentroCultivo)
┃ ┃ ┣ 📂 ui/			#Punto de entrada, interfaz y Ejecución principal (Main.java)
┃ ┃ ┣ 📂 util/			#utilitarios, validaciones y excepciones personalizadas
┃ ┣ 📂 resources/
┃ ┃ ┣ 📊 Empleados.xlsx		#Archivo Excel con los datos de empleados
┃ ┃ ┣ 📊 PlantasYCentrosCultivos.txt	#Archivo Excel con los datos de empleados
┣ 📂 target/
┃ ┃ ┣ 📦 SalmontApp-S6-1.0-SNAPSHOT.jar	    # Archivo ejecutable generado por Maven
┃ 📜 README.md
┗ 📜 pom.xml			#Configuración Maven y dependencias

```
### Nuevas clases incorporadas en la actividad

- `UnidadesOperativas.java`
- `PlantaProceso.java`
- `CentroCultivo.java`
- `GestorUnidades.java`

Todas estas clases respresentan la actividad de la semana 6, aplicando conceptos como atributos heredados, sobreescritura de métodos y composición entre clases.

---
## 🧩 Requisitos

Para trabajar correctamente con los recursos de este repositorio, asegúrate de tener instalado lo siguiente:

- ☕ **Java JDK 18 o superior**  
  - [Descargar Java](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)

- 💻 **IDE recomendado: IntelliJ IDEA Comunity Edition**  
  - [Descargar IntelliJ IDEA (Community Edition)](https://www.jetbrains.com/idea/download/)  

- 🧰 **Git instalado para clonar y versionar el repositorio**  
  - [Descargar Git](https://git-scm.com/downloads)

- 🌐 **Cuenta de GitHub activa** (obligatoria)  
  - [Crear cuenta en GitHub](https://github.com/signup)  
   > Tu cuenta te servirá para clonar repositorios, subir avances, y entregar evaluaciones a través de GitHub. 

---
## ⚙️ Instrucción de Ejecución

### Instrucciones para clonar y ejecutar el proyecto en IDE

- clonar el repositorio de github
```bash
git clone https://github.com/matisuarezm/SalmonttApp_S6.git
```
- Abre el proyecto en IntelliJ IDEA.
- Abre la clase `Main.java` del paquete `ui`
- Puedes ejecutar el proyecto.

	> Nota: La clase Main.java trae un Menú el cual fue modificado para probar las funcionalidades de esta semana.

---

## 👤 Autor del proyecto
- **Nombre completo:** Matias Suarez M.
- **Sección:** 003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Carrera 100% Online


