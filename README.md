Proyecto Delivery

Descripción
Aplicación en Java que simula el registro de un cliente, su compra y el cálculo del costo de delivery en base al monto de la compra y la distancia recorrida.

Requerimientos Funcionales
1. El sistema debe registrar los datos del vehículo repartidor (marca, modelo, cilindrada, combustible y pasajeros).
2. El sistema debe registrar los datos del cliente (nombre y edad).
3. El sistema debe registrar el monto de la compra y los kilómetros de distancia.
4. El sistema debe calcular el costo del delivery según el monto de la compra:
   - Si la compra es menor a $25.000 → `costo = km * 300`.
   - Si la compra está entre $25.000 y $49.999 → `costo = km * 150`.
   - Si la compra es mayor o igual a $50.000 → `delivery gratis`.
5. El sistema debe mostrar un resumen final con todos los datos ingresados y el total a pagar.

Requerimientos No Funcionales
1. El programa debe estar desarrollado en **Java**.
2. El código debe estar documentado con comentarios claros.
3. El sistema debe ser ejecutable en cualquier entorno con **JDK instalado**.
4. La interacción con el usuario se realiza únicamente por consola.
5. El programa debe manejar la entrada de datos de manera sencilla y clara.
