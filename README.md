# Laboratorio 3

## Integrantes:
 - Camilo Andrés Pichimata Cárdenas
 - Zuly Valentina Vargas Ramirez

## Clases de equivalencia para la clase Registry:

Con base a los resultados se tiene:

- Dead : Cuando el atributo alive es false.
- Underage : Rango de edad en : 0 < edad < 18
- Invalid_Age: Cuando la edad es menor a 0: edad < 0
- Valid : Cuando el atributo alive es true, no ha sido registrado anteriormente y el rango de edad es : 17 < edad
- Duplicated : Cunado ya ha sido registrado como un voto válido anteriormente.

## Clases de equivalencia para la clase CalculadorDescuentos:

1. Los datos ingresados sean menor a 0. Se debe lanzar la excepción.

2. El parámetro tarifa es mayor a 0, los días de antelación son menores a 20 y la edad está entre 18 años y 65. Se debe obtener el valor de la tarifa sin
ninguna alteración.

3. El parámetro tarifa es mayor a 0, los días de antelación menores a 20 y la edad menor a 18 años. Se debe obtener el valor de la tarifa con un descuento del
5%.

4. El parámetro tarifa es mayor a 0, los días de antelación menores a 20 y la edad mayor a 65 años. Se debe obtener el valor de la tarifa con un descuento del
8%.
5. El parámetro tarifa es mayor a 0, los días de antelación mayores a 20 y la edad mayor a 18 y menor a 65 años. Se debe obtener el valor de la tarifa con un 
descuento del 15%.

6. El parámetro tarifa es mayor a 0, los días de antelación mayores a 20 y la edad menor a 18 años. Se debe obtener el valor de la tarifa con un descuento del
20%.

7. El parámetro tarifa es mayor a 0, los días de antelación mayores a 20 y la edad mayor a 65 años. Se debe obtener el valor de la tarifa con un descuento del
23%.
  