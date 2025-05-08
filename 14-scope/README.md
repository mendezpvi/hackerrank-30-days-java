# **Day 14: Scope**

+ [Reto](#reto)

## 1. **Scope de las variables locales**

Las **variables locales** son aquellas definidas dentro de un método o bloque de código. Su **scope** es limitado a ese método o bloque donde fueron declaradas. Una vez que el flujo de ejecución sale del bloque o método, la variable ya no es accesible.

#### Ejemplo:

```java
public class ScopeExample {
    public static void main(String[] args) {
        int x = 5;  // Variable local a main

        if (x > 3) {
            int y = 10;  // Variable local al bloque if
            System.out.println("y dentro del if: " + y);  // Funciona
        }

        // System.out.println("y fuera del if: " + y);  // ERROR: No se puede acceder a 'y' fuera del if
        System.out.println("x fuera del if: " + x);  // Funciona
    }
}
```

* **`x`** es accesible en todo el método `main` porque está declarada dentro de ese método.
* **`y`** solo es accesible dentro del bloque `if` donde fue declarada. Si intentas acceder a ella fuera de ese bloque, obtienes un error.

## 2. **Scope de las variables de instancia**

Las **variables de instancia** son declaradas dentro de una clase, pero fuera de cualquier método. Son accesibles por todos los métodos de la clase. Su **scope** es el nivel de la clase.

#### Ejemplo:

```java
public class Person {
    String name;  // Variable de instancia

    public void setName(String newName) {
        name = newName;  // Acceso a 'name' dentro del método
    }

    public void printName() {
        System.out.println(name);  // Acceso a 'name' dentro de otro método
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Juan");
        person.printName();  // Imprime: Juan
    }
}
```

* **`name`** tiene un **scope** a nivel de la clase `Person`, lo que significa que puede ser utilizada en cualquier método dentro de la clase.

## 3. **Scope de las variables estáticas**

Las **variables estáticas** son aquellas que se definen con la palabra clave `static` dentro de una clase. Estas variables son comunes para todas las instancias de la clase. Su **scope** es también a nivel de clase.

#### Ejemplo:

```java
public class Counter {
    static int count = 0;  // Variable estática

    public void increment() {
        count++;  // Acceso a 'count' dentro del método
    }

    public static void printCount() {
        System.out.println(count);  // Acceso a 'count' dentro de un método estático
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment();
        c2.increment();

        Counter.printCount();  // Imprime: 2, ya que 'count' es común a todas las instancias
    }
}
```

* **`count`** es una variable estática, por lo que su **scope** es a nivel de la clase `Counter`. Puede ser accedida sin necesidad de crear una instancia de la clase.

## 4. **Scope de las variables dentro de los métodos**

En Java, cada método tiene su propio **scope** para las variables locales. Esto significa que las variables que se crean dentro de un método solo son accesibles dentro de ese método.

#### Ejemplo:

```java
public class ScopeMethodExample {
    public void method1() {
        int a = 5;
        System.out.println(a);  // Funciona, 'a' es accesible dentro de method1
    }

    public void method2() {
        // System.out.println(a);  // ERROR: 'a' no está definido en method2
    }

    public static void main(String[] args) {
        ScopeMethodExample example = new ScopeMethodExample();
        example.method1();
    }
}
```

* La variable **`a`** solo está disponible dentro de **`method1`**. Intentar acceder a ella en **`method2`** causaría un error, ya que no está en el **scope** de ese método.

## Resumen:

* **Scope local**: Dentro de un bloque o método. Las variables son creadas y accesibles solo dentro de ese bloque/método.
* **Scope de instancia**: Dentro de toda la clase. Las variables de instancia pueden ser usadas por cualquier método de la clase.
* **Scope estático**: Similar al de instancia, pero se comparte entre todas las instancias de la clase.
* **Scope de parámetros**: Los parámetros de un método son accesibles solo dentro de ese método.

---

# **Reto**

## 📝 Objective | *Objetivo*

Today we’re discussing scope. Check out the [Tutorial](https://www.hackerrank.com/challenges/30-scope/tutorial) tab for learning materials and an instructional video!  
*Hoy hablaremos sobre el ámbito (scope). Consulta la pestaña del [Tutorial](https://www.hackerrank.com/challenges/30-scope/tutorial) para ver materiales de aprendizaje y un video instructivo.*

The absolute difference between two integers, *a* and *b*, is written as |a − b|. The maximum absolute difference between two integers in a set of positive integers, *elements*, is the largest absolute difference between any two integers in *elements*.  
*La diferencia absoluta entre dos enteros, *a* y *b*, se escribe como |a − b|. La diferencia absoluta máxima entre dos enteros en un conjunto de enteros positivos, *elements*, es la mayor diferencia absoluta entre cualquier par de enteros dentro de *elements*.*

The `Difference` class is started for you in the editor. It has a private integer array (`elements`) for storing *N* non-negative integers, and a public integer (`maximumDifference`) for storing the maximum absolute difference.  
*La clase `Difference` ya está iniciada en el editor. Tiene un arreglo privado de enteros (`elements`) para almacenar *N* enteros no negativos y un entero público (`maximumDifference`) para almacenar la diferencia absoluta máxima.*

## 🧠 Task | *Tarea*

Complete the `Difference` class by writing the following:  
*Completa la clase `Difference` escribiendo lo siguiente:*

* A class constructor that takes an array of integers as a parameter and saves it to the `__elements` instance variable.  
*Un constructor de clase que reciba un arreglo de enteros como parámetro y lo almacene en la variable de instancia `__elements`.*

* A `computeDifference` method that finds the maximum absolute difference between any 2 numbers in `__elements` and stores it in the `maximumDifference` instance variable.  
*Un método `computeDifference` que encuentre la diferencia absoluta máxima entre cualquier par de números en `__elements` y la almacene en la variable de instancia `maximumDifference`.*

## 📥 Input Format | *Formato de Entrada*

You are not responsible for reading any input from stdin. The locked Solution class in the editor reads in 2 lines of input.  
*No eres responsable de leer ninguna entrada desde stdin. La clase `Solution` que está bloqueada en el editor lee 2 líneas de entrada.*

The first line contains *N*, the size of the elements array.  
*La primera línea contiene *N*, el tamaño del arreglo `elements`.*

The second line has *N* space-separated integers that describe the `__elements` array.  
*La segunda línea contiene *N* enteros separados por espacios que describen el arreglo `__elements`.*

## ✅ Constraints | *Restricciones*

* 1 ≤ *N* ≤ 10
* 1 ≤ `__elements[i]` ≤ 100, where 0 ≤ *i* ≤ *N* − 1

## 📤 Output Format | *Formato de Salida*

You are not responsible for printing any output; the Solution class will print the value of the `maximumDifference` instance variable.  
*No eres responsable de imprimir ninguna salida; la clase `Solution` imprimirá el valor de la variable de instancia `maximumDifference`.*

## 🧪 Sample Input | *Ejemplo de Entrada*

```bash
3
1 2 5
```

## 🧾 Sample Output | *Ejemplo de Salida*

```bash
4
```

## 🧾 Explanation | *Explicación*

The scope of the `__elements` array and `maximumDifference` integer is the entire class instance.  
*El alcance del arreglo `__elements` y del entero `maximumDifference` abarca toda la instancia de la clase.*

The class constructor saves the argument passed to the constructor as the `__elements` instance variable (where the `computeDifference` method can access it).  
*El constructor de la clase guarda el argumento pasado al constructor como la variable de instancia `__elements` (a la cual puede acceder el método `computeDifference`).*

To find the maximum difference, `computeDifference` checks each element in the array and finds the maximum difference between any 2 elements:  
*Para encontrar la diferencia máxima, `computeDifference` revisa cada elemento del arreglo y encuentra la diferencia máxima entre cualquier par de elementos:*

```
|1 − 2| = 1
|1 − 5| = 4
|2 − 5| = 3
```

The maximum of these differences is `4`, so it saves the value `4` as the `maximumDifference` instance variable.  
*La mayor de estas diferencias es `4`, así que guarda el valor `4` en la variable de instancia `maximumDifference`.*

The locked stub code in the editor then prints the value stored as `maximumDifference`, which is `4`.  
*El código base bloqueado en el editor luego imprime el valor almacenado como `maximumDifference`, que es `4`.*

[***Main.java***](./src/Main.java) 👈

| [🔝](#day-14-scope) | [🏠](../README.md) |
| --- | --- |
