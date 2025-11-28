# 📘 Proyecto: Gestión de Empleados Salmontt Versión 2

## 📝 Descripción general del sistema
Este proyecto es la segunda versión del sistema de gestión de empleados para la empresa Salmontt de Puerto Montt, desarrollado como evaluación sumativa número 2 de la asignatura Desarrollo Orientado a Objetos I. Esta versión incorpora la lectura y procesamiento de datos de empleados desde un archivo Excel utilizando la librería Apache POI, permitiendo gestionar información laboral y personal (nombre, RUT validado, dirección, cargo, salario, etc.) con estructura modular y buenas prácticas de programación en Java (herencia, composición, polimorfismo y validación). El proyecto está construido y gestionado con Maven, facilitando la administración de dependencias y el despliegue del sistema.

La solución implementa buenas prácticas de diseño orientado a objetos, utilizando herencia, composición, polimorfismo y validación de datos en Java. Además, la estructura modular del proyecto permite separar claramente las responsabilidades de cada componente, facilitando la mantenibilidad y la reutilización del código.

Este desarrollo aborda un caso realista y contextualizado de gestión de personas, enfrentando desafíos típicos en empresas como la importación de información, validaciones personalizadas (por ejemplo, del RUT chileno) y la generación de consultas por criterios. Así, el proyecto evidencia una propuesta estructurada y adaptable a nuevos requerimientos, cumpliendo con estándares de calidad y promoviendo la creación de código limpio, reusable y extensible.

---

## 🧱 Estructura general del proyecto

```
📦 SalmonttApp_S5/
┣ 📂 .idea/
┣ 📂 src/main
┃ ┣ 📂 java/cl/salmontt
┃ ┃ ┣ 📂 model/			#Clases que representan los datos y entidades (Empleado, Rut, Persona, Dirección)
┃ ┃ ┣ 📂 services/		#Servicios y Lógica general de la gestión de empleados
┃ ┃ ┣ 📂 ui/			#Punto de entrada, interfaz y Ejecución principal (Main.java)
┃ ┃ ┣ 📂 util/			#utilitarios, validaciones y excepciones personalizadas
┃ ┣ 📂 resources/
┃ ┃ ┣ 📊 Empleados.xlsx		#Archivo Excel con los datos de empleados
┣ 📂 target/
┃ ┃ ┣ 📦 salmonera-1.0-SNAPSHOT-jar-with-dependencies.jar	# Archivo ejecutable generado por Maven
┃ 📜 README.md
┗ 📜 pom.xml			#Configuración Maven y dependencias

```
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
git clone https://github.com/matisuarezm/SalmonttApp_S5.git
```
- Abre el proyecto en IntelliJ IDEA.
- Abre la clase `Main.java` del paquete `ui`
- Puedes ejecutar el proyecto.

	> Nota: La clase Main.java ya trae algunos ejemplos que se mostraran por consola.

---

## 📚 Caso Planteado



---

## 👤 Autor del proyecto
- **Nombre completo:** Matias Suarez M.
- **Sección:** 003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Carrera 100% Online
