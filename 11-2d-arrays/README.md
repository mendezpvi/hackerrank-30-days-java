# **Day 11: 2D Arrays**

## 🧠 Objective | *Objetivo*

Today, we are building on our knowledge of arrays by adding another dimension. Check out the [Tutorial](https://www.hackerrank.com/challenges/30-2d-arrays/tutorial) tab for learning materials and an instructional video.

*Hoy ampliaremos nuestro conocimiento sobre arrays añadiendo otra dimensión. Consulta la pestaña [Tutorial](https://www.hackerrank.com/challenges/30-2d-arrays/tutorial) para ver materiales de aprendizaje y un video instructivo.*

## 📝 Context | *Contexto*

1. Given a 6 × 6 2D Array, **A**:

   *Dado un array 2D de tamaño 6 × 6, **A**:*

    ```bash
    1 1 1 0 0 0  
    0 1 0 0 0 0  
    1 1 1 0 0 0  
    0 0 0 0 0 0  
    0 0 0 0 0 0  
    0 0 0 0 0 0  
    ```

1. We define an hourglass in **A** to be a subset of values with indices falling in this pattern in **A**'s graphical representation:

    *Definimos un "hourglass" (reloj de arena) en **A** como un subconjunto de valores cuyos índices caen en este patrón dentro de la representación gráfica de **A**:*

    ```bash
    a b c  
      d  
    e f g
    ```

1. There are **16 hourglasses** in **A**, and an hourglass sum is the sum of an hourglass' values.

    *Hay **16 relojes de arena** en **A**, y la suma del reloj de arena es la suma de los valores que lo componen.*

## 🧩 Task | *Tarea*

Calculate the hourglass sum for every hourglass in **A**, then print the maximum hourglass sum.

*Calcula la suma de cada reloj de arena en **A**, y luego imprime la suma máxima encontrada.*

## 🔢 Example | *Ejemplo*

In the array shown above, the maximum hourglass sum is **7** for the hourglass in the top left corner.

*En el array mostrado arriba, la suma máxima de un reloj de arena es **7**, correspondiente al reloj de arena en la esquina superior izquierda.*

## 📥 Input Format | *Formato de Entrada*

There are 6 lines of input, where each line contains 6 space-separated integers that describe the 2D Array **A**.

*Hay 6 líneas de entrada, donde cada línea contiene 6 enteros separados por espacios que describen el array 2D **A**.*

## 📏 Constraints | *Restricciones*

* −9 ≤ A[i][j] ≤ 9
* 0 ≤ i, j ≤ 5

## 📤 Output Format | *Formato de Salida*

Print the maximum hourglass sum in **A**.

*Imprime la suma máxima de reloj de arena en **A**.*

## 🔢 Sample Input | *Entrada de Ejemplo*

```bash
1 1 1 0 0 0  
0 1 0 0 0 0  
1 1 1 0 0 0  
0 0 2 4 4 0  
0 0 0 2 0 0  
0 0 1 2 4 0
```

## 🖨️ Sample Output | *Salida de Ejemplo*

```bash
19
```

## 🗣️ Explanation | *Explicación*

1. **A** contains the following hourglasses:

    ***A** contiene los siguientes relojes de arena:*

    ```bash
    1 1 1   1 1 0   1 0 0   0 0 0  
      1       0       0       0  
    1 1 1   1 1 0   1 0 0   0 0 0  

    0 1 0   1 0 0   0 0 0   0 0 0  
      1       1       0       0  
    0 0 2   0 2 4   2 4 4   4 4 0  

    1 1 1   1 1 0   1 0 0   0 0 0  
      0       2       4       4  
    0 0 0   0 0 2   0 2 0   2 0 0  

    0 0 2   0 2 4   2 4 4   4 4 0  
      0       0       2       0  
    0 0 1   0 1 2   1 2 4   2 4 0  
    ```

1. The hourglass with the maximum sum **(19)** is:

    *El reloj de arena con la suma máxima **(19)** es:*

    ```bash
    2 4 4  
      2  
    1 2 4
    ```

***Solution***  
[***Main.java***](./src/Main.java) 👈

| [🔝](#day-11-2d-arrays) | [🏠](../README.md) |
| --- | --- |