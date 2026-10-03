# Números Primos

## Descripción

Aplicación de consola desarrollada en Java que permite ingresar un número límite y obtener todos los números primos existentes desde `2` hasta ese límite.

El proyecto implementa la lógica para determinar si cada número es primo y devuelve los resultados mediante una colección `List<Integer>`.

---

## Objetivo

Practicar y reforzar conceptos fundamentales de Java mediante un proyecto práctico, aplicando:

- Clases y objetos
- Métodos
- Parámetros
- Condicionales
- Ciclos `for`
- Operadores aritméticos
- Variables booleanas
- Colecciones `List`
- `ArrayList`
- Entrada de datos mediante `Scanner`
- Separación de responsabilidades
- Optimización básica de algoritmos

---

## Funcionalidades

La aplicación permite:

1. Solicitar al usuario un número límite.
2. Evaluar todos los números desde `2` hasta el límite indicado.
3. Determinar cuáles son números primos.
4. Almacenar los números primos encontrados en una lista.
5. Mostrar el resultado en consola.
6. Validar entradas que no producen números primos.

### Ejemplo

Entrada:

```text
Digita un número límite
20
```

Salida:

```text
Los números primos son: [2, 3, 5, 7, 11, 13, 17, 19]
```

---

## Validaciones

La aplicación contempla límites menores a `2`.

Por ejemplo:

```text
Digita un número límite
1
```

Resultado:

```text
Invalido
```

También:

```text
Digita un número límite
0
```

Resultado:

```text
Invalido
```

---

## Estructura del proyecto

```text
NumerosPrimos/
│
├── src/
│   ├── Main.java
│   └── NumerosPrimos.java
│
├── .gitignore
└── README.md
```

### Main.java

Responsable de:

- Crear el objeto `NumerosPrimos`.
- Solicitar el número al usuario.
- Recibir el resultado.
- Mostrar la información en consola.

### NumerosPrimos.java

Contiene la lógica principal para identificar los números primos.

El método principal es:

```java
public List<Integer> generarPrimos(int n)
```

Recibe un número límite y devuelve una lista con los números primos encontrados.

---

## Lógica del algoritmo

La aplicación recorre todos los números desde `2` hasta el límite:

```java
for (int i = 2; i <= n; i++)
```

Para cada número se asume inicialmente que es primo:

```java
boolean esPrimo = true;
```

Después se buscan posibles divisores desde `2` hasta la raíz cuadrada del número:

```java
for (int j = 2; j <= Math.sqrt(i); j++)
```

Si se encuentra un divisor:

```java
if (i % j == 0) {
    esPrimo = false;
    break;
}
```

El número deja de considerarse primo y se utiliza `break` para detener la búsqueda de divisores innecesaria.

Finalmente, si continúa siendo primo, se agrega a la lista:

```java
if (esPrimo) {
    list.add(i);
}
```

---

## Optimización

El algoritmo utiliza:

```java
Math.sqrt(i)
```

para limitar la búsqueda de divisores.

No es necesario comprobar todos los números hasta `i - 1`, ya que si un número tiene un divisor mayor que su raíz cuadrada, necesariamente tendrá otro divisor menor que ella.

Además, se utiliza:

```java
break;
```

para detener inmediatamente la búsqueda cuando se encuentra un divisor.

Esto evita operaciones innecesarias.

---

## Ejemplos de ejecución

### Límite 3

```text
Entrada:
3

Salida:
Los números primos son: [2, 3]
```

### Límite 5

```text
Entrada:
5

Salida:
Los números primos son: [2, 3, 5]
```

### Límite 50

```text
Entrada:
50

Salida:
Los números primos son: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]
```

### Límite 100

```text
Entrada:
100

Salida:
Los números primos son: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
```

---

## Conceptos Java aplicados

Durante el desarrollo del proyecto se practicaron los siguientes conceptos:

- Clases
- Objetos
- Métodos
- Parámetros
- Tipo de retorno
- Variables locales
- `boolean`
- Operadores `%`
- Estructuras `if`
- Ciclos `for`
- `Math.sqrt()`
- `break`
- `List`
- `ArrayList`
- `Scanner`
- Importación de clases
- Separación de responsabilidades

---

## Tecnologías

- **Java 21**
- **Eclipse Temurin JDK 21**
- **IntelliJ IDEA**
- **Git**
- **GitHub**

---

## Pruebas realizadas

Durante el desarrollo se realizaron pruebas con diferentes límites:

| Límite | Resultado |
|---:|---|
| 0 | Invalido |
| 1 | Invalido |
| 3 | `[2, 3]` |
| 5 | `[2, 3, 5]` |
| 6 | `[2, 3, 5]` |
| 20 | `[2, 3, 5, 7, 11, 13, 17, 19]` |
| 50 | 15 números primos |
| 100 | 25 números primos |

Todas las pruebas realizadas produjeron los resultados esperados.

---

## Propósito del proyecto

Este proyecto forma parte de una serie de aplicaciones prácticas desarrolladas para fortalecer las bases de programación en Java antes de avanzar hacia tecnologías y conceptos de Backend como:

- Programación Orientada a Objetos
- Encapsulamiento
- Colecciones
- Manejo de excepciones
- APIs
- Bases de datos
- Spring / Quarkus
- Desarrollo de aplicaciones Backend

---

## Estado del proyecto

**Completado y probado.**

## Autor

**Carolina Neri Garduño**

Proyecto desarrollado como parte de mi proceso de aprendizaje y preparación profesional en **Java Backend**.