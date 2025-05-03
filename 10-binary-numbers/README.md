# **Day 10: Binary Numbers**

## 🧠 Objective | *Objetivo*

Today, we're working with binary numbers. Check out the [Tutorial](https://www.hackerrank.com/challenges/30-binary-numbers/tutorial) tab for learning materials and an instructional video!

*Hoy trabajaremos con números binarios. Consulta la pestaña [Tutorial](https://www.hackerrank.com/challenges/30-binary-numbers/tutorial) para acceder a materiales de aprendizaje y un video instructivo.*

## 📌 Task | *Tarea*

Given a base-10 integer, `n`, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in `n`'s binary representation. When working with different bases, it is common to show the base as a subscript.

*Dado un número entero en base 10, `n`, conviértelo a binario (base 2). Luego encuentra e imprime el número entero en base 10 que representa la mayor cantidad de 1's consecutivos en la representación binaria de `n`. Al trabajar con diferentes bases, es común mostrar la base como subíndice.*

## 📖 Example | *Ejemplo*

**n = 125**

The binary representation of 125₁₀ is 1111101₂. In base 10, there are 5 and 1 consecutive ones in two groups. Print the maximum, **5**.

*La representación binaria de 125₁₀ es 1111101₂. En base 10, hay 5 y 1 unos consecutivos en dos grupos. Imprime el máximo, **5**.*

## 🔽 Input Format | *Formato de entrada*

A single integer, `n`.  
*Un solo número entero, `n`.*

## 🔒 Constraints | *Restricciones*

* 1 ≤ n ≤ 10⁶

## 🖨️ Output Format | *Formato de salida*

Print a single base-10 integer that denotes the maximum number of consecutive 1's in the binary representation of `n`.

*Imprime un solo número entero en base 10 que represente la mayor cantidad de 1's consecutivos en la representación binaria de `n`.*

## 🔢 Sample Input 1 | *Entrada de ejemplo 1*

```bash
5
```

## 🧾 Sample Output 1 | *Salida de ejemplo 1*

```bash
1
```

## 🔢 Sample Input 2 | *Entrada de ejemplo 2*

```bash
13
```

## 🧾 Sample Output 2 | *Salida de ejemplo 2*

```bash
2
```

## 💡 Explanation | *Explicación*

+ **Sample Case 1:**  
The binary representation of 5₁₀ is 101₂, so the maximum number of consecutive 1's is **1**.

  *La representación binaria de 5₁₀ es 101₂, por lo tanto, la cantidad máxima de 1's consecutivos es **1**.*

+ **Sample Case 2:**  
The binary representation of 13₁₀ is 1101₂, so the maximum number of consecutive 1's is **2**.

  *La representación binaria de 13₁₀ es 1101₂, por lo tanto, la cantidad máxima de 1's consecutivos es **2**.*

***Solution***  
[***Main.java***](./src/Main.java) 👈

| [🔝](#day-10-binary-numbers) | [🏠](../README.md) |
| --- | --- |