# **Day 14: Scope**

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

[***Main.java***](./src/Main.java) 👈