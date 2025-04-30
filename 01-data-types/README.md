# **Day 1: Data Types**

## 🧠 Objective | *Objetivo*

Today, we're discussing data types. Check out the [Tutorial](https://www.hackerrank.com/challenges/30-data-types/tutorial) tab for learning materials and an instructional video!

*Hoy hablaremos sobre los tipos de datos. Revisa la pestaña [Tutorial](https://www.hackerrank.com/challenges/30-data-types/tutorial) para ver materiales de aprendizaje y un video instructivo.*

## ✅ Task | *Tarea*

Complete the code in the editor below. The variables $ i, d, $ and $ s $ are already declared and initialized for you. You must:  
*Completa el código en el editor. Las variables $ i, d $ y $ s $ ya están declaradas e inicializadas. Debes:*

1. Declare **3 variables**: one of type `int`, one of type `double`, and one of type `String`.  
*Declarar **3 variables**: una de tipo `int`, una de tipo `double` y una de tipo `String`.*

2. Read **3 lines** of input from `stdin` (according to the sequence given in the Input Format section below) and initialize your **3 variables**.  
*Leer **3 líneas** desde la entrada estándar `stdin` (según el formato indicado más abajo) e inicializar tus **3 variables**.*

3. Use the `+` operator to perform the following operations:  
*Usa el operador `+` para realizar las siguientes operaciones:*

   1. Print the sum of `i` plus your int variable on a new line.  
   *Imprime la suma de `i` más tu variable `int` en una nueva línea.*

   2. Print the sum of `d` plus your double variable to a scale of one decimal place on a new line.  
   *Imprime la suma de `d` más tu variable `double`, con un decimal, en una nueva línea.*

   3. Concatenate `s` with the string you read as input and print the result on a new line.  
   *Concatena `s` con la cadena ingresada y muestra el resultado en una nueva línea.*

**Note:**  
If you are using a language that doesn't support using $ + $ for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.

*Si estás usando un lenguaje que no soporta el operador $ + $ para concatenar strings (por ejemplo: C), puedes simplemente imprimir una variable seguida inmediatamente de la otra en la misma línea. La cadena proporcionada en tu editor debe imprimirse primero, seguida de la cadena ingresada.*

## 🔢 Input Format | *Formato de Entrada*

- The first line contains an integer that you must sum with $i$.  
*La primera línea contiene un número entero que debes sumar con $i$.*

- The second line contains a double that you must sum with $d$.  
*La segunda línea contiene un número decimal que debes sumar con $d$.*

- The third line contains a string that you must concatenate with $s$.  
*La tercera línea contiene una cadena que debes concatenar con $s$.*

## 📤 Output Format | *Formato de Salida*

Print the sum of both integers on the first line, the sum of both doubles (scaled to 1 decimal place) on the second line, and then the two concatenated strings on the third line.

*Imprime la suma de ambos enteros en la primera línea, la suma de ambos números decimales (con un decimal) en la segunda línea, y luego las dos cadenas concatenadas en la tercera línea.*

## 🧪 Sample Input | *Entrada de ejemplo*

```bash
12
4.0
is the best place to learn and practice coding!
```

## ✅ Sample Output | *Salida esperada*

```bash
16
8.0
HackerRank is the best place to learn and practice coding!
```

## 💡 Explanation | *Explicación*

+ When we sum the integers $4$ and $12$, we get the integer $16$.  
*Cuando sumamos los enteros $4$ y $12$, obtenemos el entero $16$.*

+ When we sum the floating-point numbers $4.0$ and $4.0$, we get $8.0$.  
*Cuando sumamos los números flotantes $4.0$ y $4.0$, obtenemos $8.0$.*

+ When we concatenate `HackerRank` with `is the best place to learn and practice coding!`, we get  
`HackerRank is the best place to learn and practice coding!`.  
*Cuando concatenamos `HackerRank` con `is the best place to learn and practice coding!`, obtenemos `HackerRank is the best place to learn and practice coding!`.*

> **⚠️ You will not pass this challenge if you attempt to assign the Sample Case values to your variables instead of following the instructions above and reading input from stdin.**  
>  
> **⚠️ *No pasarás este reto si asignas directamente los valores del caso de ejemplo a tus variables en lugar de seguir las instrucciones y leer la entrada desde stdin.***

***Solution***  
[***Main.java***](./src/Main.java) 👈

| [🔝](#day-1-data-types) | [🏠](../README.md) |
| --- | --- |