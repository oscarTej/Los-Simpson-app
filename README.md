# 🍩📺 SimpsonApp – Tu guía personal de Springfield

Bienvenido/a a **SimpsonApp**, una pequeña app Android para explorar el universo de **Los Simpson**:  
podrás ver un **listado de personajes**, consultar un **detalle básico** de cada uno y navegar por un **listado de episodios** con una breve sinopsis. Todo muy amarillo y muy peluchón. 💛

---

## 🎯 Objetivo de la aplicación

- Mostrar un **listado de personajes** de la serie.
- Al pulsar sobre un personaje, visualizar:
  - Nombre
  - Imagen
  - Descripción breve
- Mostrar un **listado de episodios**.
- Al pulsar sobre un episodio, mostrar:
  - Título del episodio
  - Sinopsis corta

---

## ✨ Funcionalidades principales

- 👨‍👩‍👧 **Listado de personajes** con diseño tipo tarjetas.
- 🔍 **Detalle de personaje** al seleccionarlo desde la lista.
- 🎬 **Listado de episodios** navegable.
- 📖 **Detalle de episodio** con sinopsis resumida.
- 🌀 Navegación sencilla entre pantallas (personajes ↔ episodios).
- 🧪 Proyecto preparado para añadir pruebas unitarias e instrumentadas.

---

## 🏗️ Arquitectura (visión general)

El proyecto está organizado siguiendo una estructura **limpia y mantenible**.

### **Capa Core**
- Crearemos el **inyector de dependencias**.
- Gestionaremos **genéricos y tipos base**.
- Centralizaremos el **manejo de errores**.
- Gestión de la **conexión con la API** mediante la URL base del proyecto.

### **Capa data**
- Acceso a API / datos remotos.
- Almacenamiento local con **persistencia temporal** (1 hora).
- Modelos de red y **mapeadores** hacia el dominio.

### **Capa domain**
- **Casos de uso** (use cases).
- **Entidades de dominio**.

### **Capa presentation**
- Vistas (Activity / Fragment / Compose).
- ViewModels / controladores de UI.

---

## 🧰 Tecnologías previstas

- ☕ **Kotlin**
- 🌐 **Retrofit** para llamadas a la API
- 🧩 **Koin** para la inyección de dependencias
- 📋 **RecyclerView** para los listados
- 🖼️ **Coil** para la carga de imágenes

---



