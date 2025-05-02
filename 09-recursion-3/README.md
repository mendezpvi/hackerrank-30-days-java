# **Day 9: Recursion 3**

## 🏁 Objective | *Objetivo*

Today, we are learning about an algorithmic concept called recursion.  
*Hoy estamos aprendiendo sobre un concepto algorítmico llamado recursión.*

Check out the [Tutorial](https://www.hackerrank.com/challenges/30-recursion/tutorial) tab for learning materials and an instructional video.  
*Consulta la pestaña [Tutorial](https://www.hackerrank.com/challenges/30-recursion/tutorial) para ver materiales de aprendizaje y un video instructivo.*

## 🧩 Recursive Method for Calculating Factorial | *Método Recursivo para Calcular el Factorial*

$$
factorial(N) =
\begin{cases}
1 & \text{if } N \leq 1 \\
N \times factorial(N - 1) & \text{otherwise}
\end{cases}
$$

## 🧠 Function Description | *Descripción de la Función*

Complete the factorial function in the editor below. Be sure to use recursion.  
*Completa la función factorial en el editor de abajo. Asegúrate de usar recursión.*

**factorial** has the following parameter:  
***factorial** tiene el siguiente parámetro:*

+ `int n`: an integer  

**Returns / Retorna**

+ `int`: the factorial of `n`  

**Note**:  
If you fail to use recursion or fail to name your recursive function `factorial` or `Factorial`, you will get a score of **0**.  
*Si no usas recursión o no nombras tu función recursiva `factorial` o `Factorial`, obtendrás una puntuación de **0**.*

## 📥 Input Format | *Formato de Entrada*

A single integer, `n` (the argument to pass to factorial).  
*Un solo número entero, `n` (el argumento que se pasa a factorial).*

## 📏 Constraints | *Restricciones*

+ `2 ≤ n ≤ 12`  
+ Tu envío debe contener una función recursiva llamada `factorial`.

## 📥 Sample Input | *Entrada de Ejemplo*

```bash
3
```

## 📤 Sample Output | *Salida de Ejemplo*

```bash
6
```

## 🧠 Explanation | *Explicación*

Consider the following steps. After the recursive calls from step 1 to 3, results are accumulated from step 3 to 1.  
*Considera los siguientes pasos. Después de las llamadas recursivas del paso 1 al 3, los resultados se acumulan del paso 3 al 1.*

1. `factorial(3) = 3 × factorial(2) = 3 × 2 = 6`  
2. `factorial(2) = 2 × factorial(1) = 2 × 1 = 2`  
3. `factorial(1) = 1`

***Solution***  
[***Main.java***](./src/Main.java) 👈

| [🔝](#day-9-recusion-3) | [🏠](../README.md) |
| --- | --- |