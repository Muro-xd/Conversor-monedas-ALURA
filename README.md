# Conversor de Monedas

Este proyecto es un programa en Java que permite convertir monedas utilizando una API externa para obtener tasas de cambio actualizadas. Los usuarios pueden interactuar con el programa a través de la consola para convertir una cantidad de una moneda base a otra moneda objetivo.

## Características

- Consumo de una API REST para obtener tasas de cambio actualizadas.
- Interfaz de usuario basada en consola.
- Conversión de una cantidad ingresada entre dos monedas especificadas.
- Manejo de errores cuando se ingresan monedas inválidas o la API no responde correctamente.

## Requisitos

- **Java 17** o superior.
- Conexión a internet.
- Dependencia para procesar JSON: [Gson](https://github.com/google/gson).

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/Muro-xd/Conversor-monedas-ALURA.git
   cd <Conversor-monedas-ALURA>
   ```

2. Asegúrate de tener configurado el entorno de desarrollo en Java.

3. Agrega la biblioteca Gson al proyecto. Si usas un IDE como IntelliJ IDEA o Eclipse, puedes agregar la dependencia de Gson manualmente o a través de un sistema de compilación como Maven o Gradle.

    - Dependencia de Maven:
      ```xml
      <dependency>
          <groupId>com.google.code.gson</groupId>
          <artifactId>gson</artifactId>
          <version>2.8.9</version>
      </dependency>
      ```

## Uso

1. Ejecuta el programa desde tu IDE o terminal.

2. Sigue las instrucciones en pantalla:

    - Ingresa la moneda base (por ejemplo: `USD`).
    - Ingresa la moneda objetivo (por ejemplo: `EUR`).
    - Ingresa la cantidad a convertir.

3. El programa mostrará el resultado de la conversión.

### Ejemplo de Ejecución

```
-- Presiona 1 para Usar conversor de Monedas: 
-- Presiona 0 para salir...
1
Escribe la moneda que quieres convertir (ejemplo: USD): 
USD
Escribe hacia la moneda que quieres convertir (ejemplo: EUR): 
EUR
Ingresa la cantidad de USD que quieres convertir a EUR: 
100
100 USD = 85.0 EUR
```

## Estructura del Proyecto

```
|-- src
    |-- Main.java                // Clase principal con el flujo del programa.
    |-- ConsultaMoneda.java      // Clase que realiza el consumo de la API para obtener la tasa de cambio.
    |-- Moneda.java              // Record que representa los datos de la conversión de moneda.
    |-- Conversiones.java        // Clase auxiliar para realizar cálculos de conversión.
```

## API Utilizada

El programa utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio actuales.

### URL de la API

```
https://v6.exchangerate-api.com/v6/5a19fe696537f14a1a1ae693/pair/{base}/{target}
```

- **base**: Código de la moneda base (por ejemplo, `USD`).
- **target**: Código de la moneda objetivo (por ejemplo, `EUR`).

## Notas

- Asegúrate de que las monedas ingresadas estén en formato ISO 4217 (ejemplo: USD, EUR, JPY).
- Si encuentras algún problema, revisa los mensajes de error en la consola.

## Contribuciones

Si deseas contribuir a este proyecto, crea un fork, realiza los cambios necesarios y envía un pull request.

## Licencia

Este proyecto se distribuye bajo la [MIT License](LICENSE).

---

¡Gracias por usar el conversor de monedas! Si tienes sugerencias o comentarios, no dudes en compartirlos.

