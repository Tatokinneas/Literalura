# Literalura
En este emocionante desafío de programación, te invitamos a construir tu propio catálogo de libros: el LiterAlura. Aprenderás a realizar solicitudes a una API de libros, a manipular datos JSON, guardarlos en una base de datos y, finalmente, a filtrar y mostrar los libros y autores de interés.

## Características

- **Consulta de libros por su titulo**: Soporta conversiones entre USD, CLP, BRL, COP y MXN.
- **Interfaz de usuario intuitiva**: Menú claro y fácil de navegar.
- **Uso de Persistencia de datos con PostgreSQL**: Se ha configurado el uso de JPA para que la informacion consultada se guarde en una BD de PostgreSQL.

## Uso

### Prerrequisitos

- Java Development Kit (JDK) 17 o superior
- Conexión a Internet para acceder a la API de GutenDex-API.

### Instalación

1. **Clonar el repositorio**:
   ```sh
   git clone https://github.com/tatokinneas/literalura.git
   ```

2. **Navegar al directorio del proyecto:**
   ```sh
   cd literalura
   ```
3. **Compilar el proyecto:**
   ```sh
   javac LiteraluraAplication.java
   ```
4. **Ejecutar el proyecto:**
   ```sh
   java Literalura
   ```
### Ejemplo de Uso
Al ejecutar la aplicación, verás un menú como el siguiente:

   ```sh 
  -------------------
    Elija la opcion indicada:
        1.- Buscar libro por titulo
        2.- Listar libros registrados
        3.- Listar autores registrados
        4.- Listar autores vivos en determinado año
        5.- Listar libros idioma
        0.- Salir
  ------------------
  ```

1. **Selecciona la opción deseada:** Ingresa la información que se muestra en la pantalla de la terminal.

2. **Ingresa el titulo del libro:** Después de seleccionar la opción, se te pedirá que ingreses una palabra que sea parte del titulo del libro.

3. **Obtén el resultado:** La aplicación mostrará el resultado de la consulta en la BD de Gutendex y lo indexará en una base de datos propia.

### Ejemplo
Si seleccionas 1 para consultar un libro:
```sh
Escribe el nombre del libro:
Mar
Buscando libro por titulo...

Libro Encontrado
---------- LIBROS -------
 Titulo: Middlemarch
 Autor: Eliot, George
 Nacio en: 1819
 Murio en: 1880
 Idioma: [en]
 Descargas: 54135.0
------------------------- 
```
Si selecionnas 2 para consultar los libros que ya has buscado:
```sh
Estos son los libros registrados en nuestra base de datos: 

---------- LIBROS -------
 Titulo: My Life — Volume 1
 Autor: Wagner, Richard
 Nacio en: 1813
 Murio en: 1883
 Idioma: [en]
 Descargas: 41674.0
-------------------------
---------- LIBROS -------
 Titulo: Don Quijote
 Autor: Cervantes Saavedra, Miguel de
 Nacio en: 1547
 Murio en: 1616
 Idioma: [es, en]
 Descargas: 16728.0
-------------------------
---------- LIBROS -------
 Titulo: Middlemarch
 Autor: Eliot, George
 Nacio en: 1819
 Murio en: 1880
 Idioma: [en]
 Descargas: 54135.0
-------------------------
```
# Autor
Octavio Isaías Benitez Morales

**GitHub:** @tatokinneas
**Email:** tatokinneas@gmail.com

