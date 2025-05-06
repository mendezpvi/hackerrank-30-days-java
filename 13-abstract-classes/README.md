# **Day 13: Abstract Classes**

## 🧠 Objective | *Objetivo*

Today, we will extend what we learned yesterday about [Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html) to [Abstract Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html).  
*Hoy vamos a extender lo que aprendimos ayer sobre la [Herencia](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html) hacia las [Clases Abstractas](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html).*

Because this is a very specific object-oriented concept, submissions are limited to the few languages that use this construct.  
*Debido a que este es un concepto muy específico de la programación orientada a objetos, las soluciones están limitadas a ciertos lenguajes que lo soportan.*

Check out the [Tutorial](https://www.hackerrank.com/challenges/30-abstract-classes/tutorial) tab for learning materials and an instructional video.  
*Puedes revisar la pestaña de [Tutorial](https://www.hackerrank.com/challenges/30-abstract-classes/tutorial) para material educativo y un video explicativo.*

---

## 🛠️ Task / Tarea

Given a `Book` class and a `Solution` class, write a `MyBook` class that does the following:  
*Dada una clase `Book` y una clase `Solution`, escribe una clase `MyBook` que cumpla con lo siguiente:*

* 🔹 Inherits from `Book`  
*Hereda de la clase `Book`*

* 🔹 Has a parameterized constructor taking these 3 parameters:  
*Tiene un constructor que recibe estos 3 parámetros:*

  1. `string title`
  2. `string author`
  3. `int price`

* 🔹 Implements the `Book` class’ abstract `display()` method so it prints these 3 lines:  
*Implementa el método abstracto `display()` de la clase `Book` para que imprima estas 3 líneas:*

  ```
  Title: $title
  Author: $author
  Price: $price
  ```

📌 **Note**: *Como estas clases se escriben en un solo archivo, no debes usar modificadores de acceso como `public` al declarar `MyBook`, o tu código no se ejecutará.*

---

## ⌨️ Input Format | *Formato de Entrada*

You are not responsible for reading any input from stdin.  
*No eres responsable de leer ninguna entrada desde `stdin`.* 

The `Solution` class creates a `Book` object and calls the `MyBook` constructor (passing it the necessary arguments).  
*La clase `Solution` crea un objeto `Book` y llama al constructor de `MyBook` (pasándole los argumentos necesarios).*

It then calls the `display` method on the `Book` object.  
*Luego invoca el método `display` sobre el objeto `Book`.*

---

## 🖨️ Output Format | *Formato de Salida*

The `void display()` method should print and label the respective `title`, `author`, and `price` of the `MyBook` object’s instance (with each value on its own line) like so:  

*El método `void display()` debe imprimir y etiquetar el `title`, `author` y `price` del objeto `MyBook` (cada valor en una línea diferente), de esta forma:*


```bash
Title: $title  
Author: $author  
Price: $price
```

📌 **Note**: *El símbolo `$` se usa para indicar que son nombres de variables, no lo imprimas literalmente.*

---

## 🧾 Sample Input | *Ejemplo de Entrada*

📥 The following input from stdin is handled by the locked stub code in your editor:

📥 *La siguiente entrada desde `stdin` es manejada por el código base en tu editor:*

```bash
The Alchemist  
Paulo Coelho  
248
```

---

## 🖨️ Sample Output | *Ejemplo de Salida*

📤 The following output is printed by your `display()` method:

📤 *La siguiente salida es impresa por tu método `display()`:*

```bash
Title: The Alchemist  
Author: Paulo Coelho  
Price: 248
```

[***Solution***](./src/Main.java) 👈

| [🔝](#day-13-abstract-classes) | [🏠](../README.md) |
| --- | --- |