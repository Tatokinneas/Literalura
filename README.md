# Literalura
En este emocionante desafío de programación, te invitamos a construir tu propio catálogo de libros: el LiterAlura. Aprenderás a realizar solicitudes a una API de libros, a manipular datos JSON, guardarlos en una base de datos y, finalmente, a filtrar y mostrar los libros y autores de interés.

## Características

- **Consulta de libros por su titulo**: Soporta conversiones entre USD, CLP, BRL, COP y MXN.
- **Interfaz de usuario intuitiva**: Menú claro y fácil de navegar.
- **Uso de Persistencia de datos con PostgreSQL**: Se ha confi

## Monedas soportadas

- **Dólar estadounidense (USD)**
- **Peso chileno (CLP)**
- **Real brasileño (BRL)**
- **Peso colombiano (COP)**
- **Peso mexicano (MXN)**

## Uso

### Prerrequisitos

- Java Development Kit (JDK) 8 o superior
- Conexión a Internet para acceder a la API de ExchangeRate-API y API-Key para poder usarlo.

### Instalación

1. **Clonar el repositorio**:
   ```sh
   git clone https://github.com/tuusuario/conversor-de-monedas.git
   ```

2. **Navegar al directorio del proyecto:**
   ```sh
   cd conversor-de-monedas
   ```
3. **Compilar el proyecto:**
   ```sh
   javac Main.java
   ```
4. **Ejecutar el proyecto:**
   ```sh
   java Main
   ```
### Ejemplo de Uso
Al ejecutar la aplicación, verás un menú como el siguiente:

   ```sh
  |****************************************| 
  Sea bienvenido/a al Conversor de Monedas 
  Ahora indique cual conversión desea realizar 
  1) Dólar estadounidense =>> Peso chileno 
  2) Peso chileno =>> Dólar estadounidense 
  3) Dólar estadounidense =>> Real brasileño 
  4) Real brasileño =>> Dólar estadounidense 
  5) Dólar estadounidense =>> Peso colombiano 
  6) Peso colombiano =>> Dólar estadounidense 
  7) Dólar estadounidense =>> Peso mexicano 
  8) Peso mexicano =>> Dólar estadounidense 
  9) Salir 
   Elija una opción válida:
  |***************************************|
   Elige la cantidad que deseas convertir: 
  ```

1. **Selecciona la opción deseada:** Ingresa el número de la conversión que deseas realizar.

2. **Ingresa la cantidad:** Después de seleccionar la opción, se te pedirá que ingreses la cantidad que deseas convertir.

3. **Obtén el resultado:** La aplicación mostrará el resultado de la conversión utilizando la tasa de cambio actual.

### Ejemplo
Si seleccionas 1 para convertir de USD a CLP e ingresas 100, el programa te mostrará algo como:
```sh
El resultado de convertir 100 USD a CLP es: 90031.67 CLP
```

# Autor
Octavio Isaías Benitez Morales

**GitHub:** @tatokinneas
**Email:** tatokinneas@gmail.com

