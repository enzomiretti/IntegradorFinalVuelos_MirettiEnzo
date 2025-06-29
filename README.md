# ✈️ Proyecto Integrador Final - Sistema de Gestión de Vuelos y Reservas (Spring Boot)

Este proyecto es una aplicación backend desarrollada en **Spring Boot**, que permite gestionar vuelos, reservas y usuarios en un aeropuerto.

---

## 🧩 Descripción General

El sistema está construido siguiendo una **arquitectura en capas**:

✅ **Controlador (Controller):** Exposición de APIs REST.  
✅ **Servicio (Service):** Lógica de negocio.  
✅ **Repositorio (Repository):** Persistencia con Spring Data JPA.  
✅ **Modelo (Model):** Entidades JPA que representan las tablas de la base de datos.

Es una aplicación backend que puede ser consumida por un frontend o clientes HTTP.

---

## 🚀 Tecnologías utilizadas

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Gradle**
- **MySQL** (o H2 en memoria)
- **Spring Web**
- **IntelliJ IDEA**

---

## 📂 Estructura del Proyecto

```
IntegradorFinalVuelos_MirettiEnzo/
├── build.gradle                # Configuración Gradle y dependencias
├── settings.gradle             # Configuración del proyecto
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/example/demo/
    │   │         ├── controller/          # Controladores REST
    │   │         ├── model/               # Entidades JPA
    │   │         ├── repository/          # Repositorios JPA
    │   │         ├── service/             # Lógica de negocio
    │   │         └── IntegradorFinalVuelosMirettiEnzoApplication.java
    │   └── resources/
    │        ├── application.properties    # Configuración de la aplicación
    │        ├── static/                   # Recursos estáticos
    │        └── templates/                # Plantillas (opcional)
    └── test/
```

---

### 🔹 Paquetes principales

✅ **controller/**  
Exponen los endpoints REST que permiten operar sobre el sistema.

✅ **service/**  
Contiene la lógica de negocio y reglas del dominio.

✅ **repository/**  
Interfaces que gestionan la persistencia con Spring Data JPA.

✅ **model/**  
Clases que representan las entidades de la base de datos.

---

## ⚙️ Configuración y Ejecución

### 1️⃣ Requisitos previos

- **Java 11 o superior**
- **Gradle**
- **MySQL** (si usas base de datos externa)

---

### 2️⃣ Configuración de la base de datos

Si usas **MySQL**, crea la base de datos manualmente:

```sql
CREATE DATABASE vuelosdb;
```

Configura tu conexión en `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/vuelosdb?serverTimezone=America/Argentina/Buenos_Aires
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Si prefieres usar **H2 en memoria**, puedes cambiar la configuración:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

---

### 3️⃣ Compilar y ejecutar

Puedes compilar y ejecutar desde IntelliJ IDEA o terminal con Gradle:

```bash
./gradlew bootRun
```

La aplicación quedará disponible en:

```
http://localhost:8080
```

---

## ✨ Funcionalidades principales

- Alta, baja, modificación y consulta de vuelos.
- Registro de reservas.
- Gestión de usuarios.
- Persistencia automática con Spring Data JPA.

---

## 🧩 Arquitectura del proyecto

El proyecto implementa:

✅ **Spring Boot**  
✅ **Controladores REST**  
✅ **Servicios desacoplados**  
✅ **Repositorios con JPA**  
✅ **Base de datos relacional (MySQL o H2)**

---

## 🛠️ Dependencias principales (`build.gradle`)

- `org.springframework.boot:spring-boot-starter-web`
- `org.springframework.boot:spring-boot-starter-data-jpa`
- `mysql:mysql-connector-java`
- `org.springframework.boot:spring-boot-starter-test`

Estas dependencias gestionan la persistencia, la capa web y los tests.

---

## 💡 Notas importantes

- El proyecto puede expandirse fácilmente agregando más endpoints REST.
- Puede integrarse un frontend (por ejemplo Angular, React o Vue.js).
- Si no se configura MySQL, se puede usar H2 en memoria para pruebas.

---

## 📄 Licencia

Este proyecto es de uso académico. Puedes adaptarlo y modificarlo según tus necesidades.

---
