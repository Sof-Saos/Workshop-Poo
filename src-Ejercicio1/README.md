### Simulación de una empresa que alquila y vende embarcaciones
Este proyecto presenta una simulación de una empresa que se especializa en la venta y alquiler de embarcaciones de dos tipos: veleros y yates. La implementación se desarrolló en Java, y se basa en cuatro clases principales: "Capitan" y "Embarcación", que a su vez tienen derivadas las clases "Yate" y "Velero". La simulación se ejecuta a través de la clase principal llamada Main.

#### Descripción de la Implementación
El programa ofrece un menú interactivo en la consola, brindando al usuario la capacidad de realizar diversas acciones relacionadas con las operaciones comerciales de las embarcaciones. Las acciones disponibles son las siguientes:
- Ver embarcaciones disponibles: Muestra una lista de las embarcaciones disponibles para compra o alquiler.
- Alquilar un velero: Permite al usuario alquilar un velero ingresando sus datos y el número del velero deseado.
- Alquilar un yate: Posibilita al usuario alquilar un yate proporcionando sus datos y seleccionando el yate deseado.
- Comprar un yate: Permite al usuario comprar un yate ingresando sus datos y seleccionando el yate deseado.
- Ver datos del vliente y presupuesto: Muestra los datos del cliente, incluyendo su presupuesto actual.
- Agregar dinero al presupuesto: Permite al usuario aumentar su presupuesto al ingresar una cantidad específica.

#### Cómo utilizar el programa
1. Ejecuta el programa principal y sigue las instrucciones del menú para interactuar con las diferentes opciones disponibles.
2. Al realizar una acción de alquiler o compra, ingresa tus datos y selecciona el número correspondiente a la embarcación deseada. (Disclaimer: Actualmente, el programa no reconoce el reordenamiento de los índices internos de las embarcaciones al realizar una compra o alquiler. Por ejemplo, si seleccionas y compras un velero con índice "1", el índice de la siguiente embarcación no se actualizará automáticamente para reflejar el cambio. Este es un aspecto que podría considerarse para futuras mejoras en la implementación). <br>
Debido a esta limitación, es recomendable llevar un seguimiento de las embarcaciones compradas o alquiladas, y referirse a ellas por el índice original en lugar de confiar en el reordenamiento de los índices internos. Esto ayudará a evitar confusiones y garantizar un uso preciso del programa.
3. Si necesitas agregar más dinero a tu presupuesto, selecciona la opción correspondiente e ingresa la cantidad a agregar.

Este programa ofrece una simulación interactiva de cómo operaría una empresa dedicada a la venta y alquiler de embarcaciones. Puedes explorar las diferentes opciones para comprender cómo funcionaría este tipo de comercio en la práctica.
