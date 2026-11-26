# U3-ejercicio28

# Gestión de Productos en Tienda y Categorías Fiscales

## Objetivo principal

Implementar una jerarquía de clases en Java para representar productos comerciales y calcular sus precios finales mediante reglas fiscales específicas.

## Descripción

Se desarrolla una clase base `Producto` que contiene los atributos comunes código, descripción y costo base.

A partir de esta clase se crean las subclases `ProductoAlimenticio` y `Electrodomestico`, que incorporan características particulares y sobrescriben el método `calcularPrecioFinal()` para aplicar diferentes fórmulas impositivas.

El sistema permite mostrar fichas de productos con sus datos generales, características específicas y precios finales calculados.

## Conceptos aplicados

- Herencia
- Encapsulamiento
- Constructores y uso de `super`

  ![U3 ejercicio28](U3%20ejercicio28.png)
- Sobrescritura de métodos (`@Override`)
- Polimorfismo
- Cálculo de porcentajes
