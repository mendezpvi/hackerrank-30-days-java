# **Day 6: Let's Review**

## 🎯 Objective | *Objetivo*
Today we will expand our knowledge of strings, combining it with what we have already learned about loops.  
*Hoy ampliaremos nuestro conocimiento sobre cadenas, combinándolo con lo que ya hemos aprendido sobre bucles.*

## 📝 Task | *Tarea*
Given a string, $ S $, of length $ N $ that is indexed from $ 0 $ to $ N - 1 $, print its even-indexed and odd-indexed characters as $ 2 $ space-separated strings on a single line.  
*Dada una cadena $ S $ de longitud $ N $ indexada desde 0 hasta $ N - 1 $, imprime sus caracteres en índices pares e impares como 2 cadenas separadas por un espacio en una sola línea.*

**Note:** $ 0 $ is considered to be an even index.  
*Nota: $ 0 $ se considera un índice par.*

## 🧩 Example | *Ejemplo*
$ s = \text{adbecf} $  
Print: `abc def`

## 📥 Input Format | *Formato de Entrada*
+ The first line contains an integer, $ T $ (the number of test cases).  
*La primera línea contiene un entero $ T $ (el número de casos de prueba).*

+ Each line $ i $ of the $ T $ subsequent lines contains a string, $ S $.  
*Cada línea $ i $ de las $ T $ líneas siguientes contiene una cadena $ S $.*

## 📏 Constraints | *Restricciones*
- $ 1 \leq T \leq 10 $  
- $ 2 \leq \text{length of } S \leq 10000 $  
- *Longitud de $ S $ entre 2 y 10000.*

## 📤 Output Format | *Formato de Salida*
+ For each String $ S_j $ (where $ 0 \leq j \leq T - 1 $), print $ S_j $’s even-indexed characters, followed by a space, followed by $ S_j $’s odd-indexed characters.  
*Para cada cadena $ S_j $ (donde $ 0 \leq j \leq T - 1 $), imprime los caracteres de índices pares de $ S_j $, seguidos de un espacio y luego los caracteres de índices impares.*

## 📥 Sample Input | *Ejemplo de Entrada*
```bash
2
Hacker
Rank
```

## 📤 Sample Output | *Ejemplo de Salida*
```bash
Hce akr
Rn ak
``` 

**Note:**   
The problem requires separating characters based on their indices (even or odd) and printing them as two strings.  
*Nota: El problema requiere separar los caracteres según sus índices (pares o impares) e imprimirlos como dos cadenas.*

## 🧠 Explanation | *Explicación*

### Test Case 0: $ S = \text{"Hacker"} $  
+ **Even indices (Índices pares):** 0, 2, 4 → Characters (Caracteres):  
  + $ S[0] = \text{"H"} $,
  + $ S[2] = \text{"c"} $, 
  + $ S[4] = \text{"e"} $  
+ **Odd indices (Índices impares):** 1, 3, 5 → Characters (Caracteres): 
  + $ S[1] = \text{"a"} $, 
  + $ S[3] = \text{"k"} $, 
  + $ S[5] = \text{"r"} $  

**Output (Salida):** `Hce akr`  
We print the even-indexed characters first, followed by the odd-indexed ones, separated by a space.*  
*Imprimimos primero los caracteres de índices pares, seguidos de los de índices impares, separados por un espacio.*

### Test Case 1: $ S = \text{"Rank"} $  
+ **Even indices (Índices pares):** 0, 2 → Characters (Caracteres): 
  + $ S[0] = \text{"R"} $, 
  + $ S[2] = \text{"n"} $  
+ **Odd indices (Índices impares):** 1, 3 → Characters (Caracteres): 
  + $ S[1] = \text{"a"} $, 
  + $ S[3] = \text{"k"} $  

**Output (Salida):** `Rn ak`  
Same logic applies here: even indices first, then odd indices.  
*La misma lógica aplica aquí: índices pares primero, luego los impares.*  

### 🗝️ Key Points | *Puntos Clave*:  
1. **Indexing starts at 0 (even)**   
*El indexado comienza en 0 (par)*.  
2. **Order matters**  
*El orden importa*: Even → Odd.  
3. **Space-separated output**  
*Salida separada por espacios*.  

This explanation clarifies how the input strings are split and printed based on their indices.  
*Esta explicación aclara cómo se dividen e imprimen las cadenas de entrada según sus índices.*

💡 ***Solution***  
[***Main.java***](./src/Main.java) 👈

| [🔝](#day-6-lets-review) | [🏠](../README.md) |
| --- | --- |