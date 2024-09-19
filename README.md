# Repaso-laboratorios
Patrones de diseño
Informacion adicional necesitada en caso tal
Creacionales
Singleton 
Abstract Factory
Builder
Singleton
Estructurales
Decorador
Facade
De Comportamiento
Iterator
Observer
Strategy
Template Method



Clean code
Es una filosofia utilizada en el desarrollo de software cuyo objetivo es hcaer mas facil la lectura y escritura de codigo. Se basa en la aplicacion de tecnicas sencillas con las que generamos un codigo claro e intuitivo que es mas facil de modificar
Single responsability principle
Una clase debe tener una y solo una razón para cambiar (unica responsabilidad).
Open/closed principle
Abierto para extensión, cerrado para modificacion.
Liskov principle
Los objetos de un programa deberian ser reemplazables por instancias de sus subtipos sin alterar el correcto funcionamiento del programa
Interface segretation principle
Los clientes de un programa dado solo deberian conocer de este aquellos metodos que realmente usan y no aquellos que no necesitan usar.
Dependency inversion principle
Los modulos de alto nivel no deberian depender de los de bajo nivel



Patrones de diseño
Solucion general y repetible a problemas comunes en la construccion de un software



1. Creacionales Como se construye el objeto
2. Estructurales Como se estructuran clases y objetos
3. Comportamiento Como interactuan los objetos entre si


Pruebas de software
El objetivo de las pruebas es buscar bugs
- Muchos de los bugs comunes están relacionados con las 
abstracciones de los paradigmas de programación.
- Permite encontrar errores en etapas tempranas del desarrollo.
- Ventajas
- Ayuda a encontrar algunos defectos de Software.
- Entre más pruebas más confiabilidad en el 
software (?).
- Cuando se modifica el software, ayuda a 
encontrar errores que son introducidos por las 
modificaciones.
- Desventajas
- Cuantas pruebas se pueden hacer a mano? 1 - 
100 - 1000 - 10000?
- Se hacen muy pocas pruebas.
- No es muy agradable hacer pruebas.
- No se prueban todos los escenarios posibles.
- Tipos de pruebas
- Caja blanca y caja negra
- Casos de prueba
Es un conjunto de condiciones o variables 
bajo las cuales se determinará si una 
aplicación, un sistema de software o una 
característica o comportamiento de estos 
resulta o no aceptable
- Casos de prueba
- Input: n
- Valid: 1 <= n <= 10
- Invalid: not (1 <= n <= 10) == (n < 1) or (n > 10)
LAS PRUEBAS EXHAUSTIVAS SON COSTOSAS.
IDEA: PARTIR EL DOMINIO EN CLASES DE 
EQUIVALENCIA
Casos de prueba
- Si un valor/condición de una de partición pasa la prueba, es 
probable que los demás casos de la misma partición pasen. 
- Si un valor/condición de una partición produce un fallo, es 
probable que los demás casos de la misma partición también 
fallen.
Pruebas clase de equivalencia
- Casos de prueba
- Complemento para las clases de equivalencia.
Al examinar las especificaciones para identificar 
clases de equivalencia, se debe tener especial 
consideración con los límites.
- Busca probar los límites entre las particiones 
dadas por las clases de equivalencia
Pruebas Unitarias
- Unidad básica a probar es el método.
- Pruebas aisladas que solo se enfocan en la lógica del método.
- Cada método debe tener pruebas para los diferentes clases de 
equivalencia
# Pruebas Unitarias
- GIVEN. —- Insumos y parámetros necesarios para realizar la prueba.
- WHEN —- Ejecutar el método a probar.
- THEN —- Evaluar los resultados.
Pruebas Unitarias
Nombramiento
1. test[Feature being tested]
testIsNotAnAdultIfAgeLessThan18
2. Feature to be tested
IsNotAnAdultIfAgeLessThan18
3. [MethodName]_[StateUnderTest]_[ExpectedBehavior]
isAdult_AgeLessThan18_False
4. [MethodName]_[ExpectedBehavior]_[StateUnderTest]
isAdult_False_AgeLessThan18
Pruebas Unitarias
Nombramiento
5. Should_[ExpectedBehavior]_When_[StateUnderTest]
Should_ThrowException_When_AgeLessThan18
6. When_[StateUnderTest]_Expect_[ExpectedBehavior]
When_AgeLessThan18_Expect_isAdultAsFalse
7. Given_Preconditions_When_StateUnderTest_Then_ExpectedBehavior
Given_UserIsAuthenticated_When_InvalidAccountNumberIsUsedToWithdraw
Money_Then_TransactionsWillFail
Pruebas Unitarias
JUnit
- Framework de pruebas para Java.
- @Test
- La anotación @Test le dice a JUnit que el método public void method al que está pegada puede 
ser ejecutado como un caso de prueba as a test case.
- Para correr el método, JUnit primero construye una instancia de la clase y después invoca el 
método.
- Cualquier excepción lanzada será reportada por JUnit como una falla (failure). If no exceptions are 
thrown, the test is assumed to have succeeded.
- @Before: Método que prepara el ambiente para cada caso de prueba
- @After: Método que limpia el ambiente de cada caso de prueba
- @BeforeClass: Corre una sola vez antes de todos los caso de prueba de la clase de prueba.
- @AfterClass: Corre una sola vez después d todos los casos de prueba de la clase
Pruebas Unitarias
JUnit
- Cada clase de pruebas debe llamarse de la misma forma que la clase que pretende 
probar eje:
- Clase Calculadora.java. —- CalculadoraTest.java
- Cada método de la clase deberá llevar el nombre del método que valida empezando 
con la palabra test. Ej testSumar()
- La estructura de directorios de las clases de pruebas deben coincidir con la 
estructura de directorios del proyecto.
- Definir el objeto Assertion como estático import static org.junit.jupiter.api.Assertions.*;
- Tener en cuenta los branches dentro del código (Condicionales) para los diferentes 
caminos que puede tomar la ejecución del código.
Pruebas Unitarias
SonarQube
Plataforma de código abierto que permite detectar errores,
vulnerabilidades y malas prácticas en el código
Pruebas Unitarias
SonarQube
- Evalúa el código fuente sin necesidad de ejecutarlo.
- Detecta problemas en tiempo de desarrollo.
- Identifica errores y posibles fallos de seguridad.
- Clasifica los problemas según su gravedad.
- Proporciona métricas sobre la calidad del código.
- Genera informes de deuda técnica y mantenibilidad.
# TDD
Desarrollo guiado por pruebas de 
software, o Test-driven development es 
una práctica de ingeniería de software 
que involucra otras dos prácticas: 
Escribir las pruebas primero y 
Refactorización. Para escribir las 
pruebas generalmente se utilizan las 
pruebas unitarias.
# SCRUM
En Scrum, un marco ágil para el desarrollo de productos, existen tres roles principales que son fundamentales para el éxito del equipo y el proyecto. Estos roles son:

1. Product Owner (Propietario del Producto)
Responsabilidades principales:
Definir y priorizar el Product Backlog (lista de tareas o requisitos).
Asegurar que el equipo de desarrollo trabaje en las funcionalidades que más valor aportan al negocio.
Representar los intereses de los stakeholders (partes interesadas) y del cliente.
Estar disponible para responder preguntas y aclarar dudas sobre los requisitos.
Objetivo: Maximizar el valor del producto que el equipo está desarrollando.
2. Scrum Master
Responsabilidades principales:
Facilitar las reuniones y ceremonias de Scrum (Daily Scrum, Sprint Planning, Sprint Review, Retrospectiva).
Eliminar obstáculos que impidan al equipo de desarrollo avanzar.
Proteger al equipo de interferencias externas y asegurar que el proceso Scrum se siga adecuadamente.
Actuar como coach del equipo en la implementación de Scrum, ayudando a mejorar continuamente.
Objetivo: Asegurar que el equipo de desarrollo trabaje de manera eficiente y en alineación con los principios de Scrum.
3. Development Team (Equipo de Desarrollo)
Responsabilidades principales:
Desarrollar, diseñar, probar y entregar el producto o incrementos en cada sprint.
Autogestionarse y organizarse para cumplir con las tareas dentro del Sprint.
Colaborar estrechamente con el Product Owner y el Scrum Master.
Mantener un enfoque de mejora continua.
Características:
Equipos multidisciplinarios que incluyen desarrolladores, diseñadores, testers, etc.
Tamaño recomendado: entre 3 y 9 personas.
Todos los miembros del equipo son responsables del resultado.
Relación entre los Roles:
El Product Owner establece el qué debe hacerse (prioridades), mientras que el Development Team decide el cómo hacerlo.
El Scrum Master actúa como facilitador para asegurar que ambos roles puedan trabajar sin problemas, siguiendo los principios ágiles de Scrum.
Estos roles trabajan de manera interdependiente para entregar valor al cliente de forma incremental, asegurando la flexibilidad y la capacidad de adaptación del equipo.
IoC (Inversión de Control, por sus siglas en inglés: Inversion of Control) es un principio de diseño en la programación que delega el control del flujo del programa a un marco o componente externo, en lugar de que el propio código maneje todas las decisiones de control. Es decir, en lugar de que el código tome el control directo de la ejecución, ese control es invertido y delegado en un contenedor o framework.

¿Qué implica la Inversión de Control (IoC)?
Normalmente, en un programa, el desarrollador tiene el control sobre el flujo de ejecución, creando instancias de objetos y llamando a sus métodos. Con IoC, el control se invierte; un contenedor IoC se encarga de crear instancias, configurar dependencias y controlar la ejecución.

Formas comunes de IoC:
Dependency Injection (DI) (Inyección de Dependencias):

Es la forma más común de IoC. Aquí, en lugar de que un objeto cree sus dependencias, se le "inyectan" desde el exterior, generalmente por un contenedor IoC.

Tres tipos principales de DI:

- Constructor Injection: Las dependencias se pasan al objeto a través del constructor.
- Setter Injection: Las dependencias se establecen mediante métodos de establecimiento (setters).
- Interface Injection: El objeto debe implementar una interfaz que el contenedor utilizará para inyectar las dependencias.