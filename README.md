
# Refactorization Quiz: Applying the SDLC Process

## Overview

This quiz is designed to test your ability to refactor code using **professional best practices**. Working in **pairs**, you will refactor provided code by improving its readability, efficiency, and scalability. You will also apply the **Software Development Life Cycle (SDLC)**, using structured phases to enhance the code. Each group will fork the repository, refactor the code, and submit a pull request with their improvements.

---

## Objectives

- Apply concepts from **Unit 1: Data Storage and Control Flow**:
  - Writing variables and constants
  - Arithmetic operators
  - Input/output system
  - Conditional operators
  - Control structures
  - Avoiding magic numbers
  - Lists of data with arrays
  - Basic SDLC principles

---

## SDLC Approach

You must follow the **SDLC process** to refactor the code:

1. **Phase 1: Requirements Analysis** – Understand the original code, identify its weaknesses, and define improvement requirements.
2. **Phase 2: Design** – Plan how to improve the code structure, renaming variables, optimizing logic, and making it more efficient.
3. **Phase 3: Implementation** – Refactor the code following your design plan, ensuring better readability and efficiency.
4. **Phase 4: Testing** – Test the refactored code with multiple inputs to ensure correctness and improvements.
5. **Phase 5: Documentation & Maintenance** – Write clear comments, and submit your final version, ensuring the code is easy to maintain.

---

## Instructions

1. **Repository Forking**:
   - Fork the repository to create a copy in your GitHub account.
   - Clone the repository to your local machine.

2. **Analyze the Code**:
   - Carefully read the provided code.
   - Identify magic numbers, unclear variable names, or inefficient logic.

3. **Refactor the Code**:
   - Improve the variable names, replace magic numbers with constants, and optimize the control structures.
   - Make sure to add comments explaining the logic and changes you made.
   - Apply **arrays** where repetition of variables exists.

4. **Test the Refactored Code**:
   - Run the program with different inputs to validate that the refactored code functions as expected.
   - Ensure the program handles errors gracefully (e.g., invalid input, edge cases).

5. **Submit Your Work**:
   - Once you complete the refactorization, push your changes to your forked repository.
   - Create a pull request (PR) to the original repository, explaining the improvements you made and how you followed the **SDLC** approach.

//Store
1. introducción
Este documento proporciona una explicación detallada del algoritmo utilizado en el programa Store, que calcula el rendimiento de ventas en una tienda. El código refactorizado maneja precios y cantidades de productos de manera dinámica, reemplazando valores mágicos con constantes y utilizando estructuras de datos apropiadas para mejorar la legibilidad y mantenibilidad del código.

Objetivo
El objetivo principal del programa es calcular el total de ventas basado en los precios y cantidades de productos, y determinar si el rendimiento de ventas es bueno o bajo en comparación con un umbral definido.

Enfoque de Diseño
Uso de Constantes
Razón para usar constantes:

Legibilidad: Las constantes proporcionan nombres descriptivos para los valores utilizados en el código, evitando el uso de números mágicos que pueden ser difíciles de interpretar.
Mantenibilidad: Al definir valores como constantes, es más fácil modificar estos valores en un solo lugar si es necesario.
Constantes Definidas:

PRICE_PRODUCT_1, PRICE_PRODUCT_2, PRICE_PRODUCT_3: Representan los precios de los productos.
QUANTITY_PRODUCT_1, QUANTITY_PRODUCT_2, QUANTITY_PRODUCT_3: Representan las cantidades correspondientes de cada producto.
SALES_THRESHOLD: Define el umbral para clasificar el rendimiento de ventas como bueno o bajo.
Uso de Arrays
Razón para usar arrays:

Flexibilidad: Utilizar arrays para almacenar precios y cantidades permite gestionar un número variable de productos sin cambiar el código. Si se agregan más productos, solo se necesita actualizar las arrays y los tamaños de las mismas.
Reducción de Repetición: El uso de arrays elimina la necesidad de escribir código repetitivo para cada producto, facilitando la modificación y mantenimiento del código.
Arrays Definidos:

prices[]: Array que almacena los precios de los productos.
quantities[]: Array que almacena las cantidades de los productos.
Validación de Datos
Razón para validar la longitud de los arrays:

Consistencia: La validación asegura que el array de precios y el array de cantidades tengan la misma longitud, evitando errores lógicos en el cálculo de ventas.
Cálculo del Total de Ventas
Razón para utilizar un bucle for:

Iteración Dinámica: El bucle for permite iterar sobre cada producto de manera eficiente para calcular el total de ventas, multiplicando el precio por la cantidad para cada producto y acumulando el resultado.
Evaluación del Rendimiento de Ventas
Razón para utilizar una sentencia if:

Decisión Condicional: La sentencia if compara el total de ventas con el umbral definido para determinar el rendimiento de ventas y proporcionar un mensaje adecuado.

// Tax calculation
2. Introducción
Este documento describe el código refactorizado para calcular los impuestos sobre productos. El código ha sido mejorado para eliminar valores mágicos mediante el uso de constantes y arrays, lo que facilita la modificación y extensión del programa.

Objetivo
El objetivo del programa es calcular el total de impuestos sobre varios productos utilizando tasas de impuestos específicas para cada uno. El programa luego determina si el total de impuestos excede un umbral definido y muestra el resultado adecuado.

Enfoque de Diseño
Uso de Constantes
Razón para usar constantes:

Legibilidad: Las constantes permiten que el código sea más fácil de leer y entender al reemplazar números mágicos con nombres descriptivos.
Mantenibilidad: Definir tasas de impuestos y umbrales como constantes permite realizar cambios en un solo lugar sin necesidad de modificar múltiples ubicaciones en el código.
Constantes Definidas:

TAX_RATE_PRODUCT_1: La tasa de impuesto para el primer producto, establecida en 15% (0.15).
TAX_RATE_PRODUCT_2: La tasa de impuesto para el segundo producto, establecida en 10% (0.10).
HIGH_TAX_THRESHOLD: El umbral de impuestos para considerar un total de impuestos como alto, establecido en 50.0.
Uso de Arrays
Razón para usar arrays:

Flexibilidad: Los arrays permiten manejar dinámicamente cualquier número de productos y tasas de impuestos, lo que hace que el código sea más adaptable y menos dependiente de valores fijos.
Reducción de Código Repetitivo: Utilizar arrays para almacenar precios y tasas elimina la necesidad de escribir código redundante para cada producto, facilitando la extensión del programa a más productos.
Arrays Definidos:

productPrices[]: Array que almacena los precios de los productos.
taxRates[]: Array que almacena las tasas de impuestos correspondientes a cada producto.
Validación de Datos
Razón para validar la longitud de los arrays:

Consistencia: La validación asegura que el número de precios y tasas de impuestos coincidan, evitando errores lógicos y garantizando que cada producto tenga una tasa de impuesto correspondiente.
Cálculo del Total de Impuestos
Razón para usar un bucle for:

Iteración Dinámica: El bucle for permite calcular el impuesto total al iterar sobre los arrays de precios y tasas, multiplicando el precio de cada producto por su tasa de impuesto y sumando el resultado para obtener el total de impuestos.
Evaluación del Total de Impuestos
Razón para utilizar una sentencia if:

Decisión Condicional: La sentencia if compara el total de impuestos con el umbral definido para determinar si el total de impuestos es alto o bajo. Dependiendo del resultado, el programa imprime un mensaje adecuado.

// Age Validation
3. *Introducción
Este documento proporciona una explicación detallada del algoritmo utilizado en el programa AgeValidation, que determina si un usuario tiene acceso basado en su edad. El código refactorizado mejora la legibilidad y mantenibilidad al reemplazar valores mágicos con constantes, consolidar la lógica de control de flujo y permitir la entrada dinámica del usuario.

Objetivo
El objetivo principal del programa es verificar si la edad del usuario cumple con el límite mínimo requerido para otorgar acceso. El programa ahora acepta la edad del usuario como entrada dinámica y proporciona una respuesta adecuada basada en esa entrada.

Enfoque de Diseño
Uso de Constantes
Razón para usar constantes:

Legibilidad: Definir un límite de edad con un nombre descriptivo mejora la comprensión del código y evita el uso de números mágicos, que pueden ser difíciles de interpretar.
Mantenibilidad: Las constantes permiten realizar ajustes en el límite de edad en un solo lugar sin necesidad de cambiar el código en varios lugares.
Constante Definida:

AGE_LIMIT: Define el límite de edad necesario para otorgar acceso. En este caso, el límite está establecido en 18 años.
Control de Flujo
Razón para usar if-else:

Eficiencia: La estructura if-else elimina la necesidad de comprobar dos veces la edad del usuario. Solo se realiza una verificación, lo que mejora la eficiencia y la claridad del código.
Implementación de Entrada del Usuario
Razón para utilizar Scanner para entrada del usuario:

Dinamismo: Utilizar Scanner permite que el programa acepte entradas dinámicas del usuario en lugar de usar valores fijos. Esto hace que el programa sea más flexible y adaptativo a diferentes escenarios.*