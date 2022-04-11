# Taller 2
## Proyecto para el desarrollo del taller de diseño y programación: Abstracciones, interfaces y polimorfismo.

### En estos archivos se tienen:
* Un paquete para las interfaces:
  > Una interface con la declaración de dos métodos: uno para cargar el combustible a las naves y otro para encender las naves.
* Un paquete para las clases:
  1. Una abstracta con los atributos generales de las naves espaciales (nombre, país de origen, peso, año de creación, tipo de combustible empleado, cargue de combustible y encendido de la nave y sus métodos get y set), dos métodos abstractos (función, el cual permite conocer el objetivo o función de la nave y abordaje, el cual permite realizar el proceso de abordaje a la nave).
  2. Una clase para las naves lanzadoras que extiende de la clase abstracta e implementa la interface, con sus propios atributos (El peso que la nave es capaz de lanzar al espacio y el empuje, con sus métodos get y set), con la implementación y sobreescritura de los métodos función, recarga de combustible, encendido y abordaje, además de un método propio para el despegue de la nave lanzadora junto a la nave de la misión.
  3. Una clase para las naves no tripuladas que extiende de la clase abstracta e implementa la interface, con sus propios atributos (La capacidad de abordaje y la nave lanzadora que utiliza para el despegue, con sus métodos get y set), con la implementación y sobreescritura de los métodos función, recarga de combustible, encendido y abordaje.
  4. Una clase para las naves tripuladas que extiende de la clase abstracta e implementa la interface, con sus propios atributos (El empuje de la nave y la nave lanzadora que utliza para el despegue, con sus métodos get y set), con la implementación y sobreescritura de los métodos función, recarga de combustible, encendido y abordaje.

Todas las clases contienen un constructor con todos sus atributos y los de la clase de la que extienden.

* Un paquete para la clase principal:

> Esta clase hace que a partir de la interacción con el usuario (a traves de un ciclo hacer - mientras) este pueda crear sus propias misiones al espacio, eligiendo su nave para misión (tripulada o no) y eligiendo su nave lanzadora, para posteriormente con estas realizar el proceso de lanzamiento al espacio realizando los procedimientos de cargue de combustible, encendido, abordaje si es necesario y el lanzamiento, todo esto mientras la información va siendo mostrada al usuario por consola.

## Es posible ejecutar el código a traves de un IDE descargando el proyecto, extrayéndolo del archivo .ZIP, abriéndolo en el IDE y ejecutándolo.
