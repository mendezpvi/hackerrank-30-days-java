# **Day 8: Dictionariees and Maps**

## 🏁 Objective | *Objetivo*

Today, we're learning about Key-Value pair mappings using a Map or Dictionary data structure.  
*Hoy aprenderemos sobre el mapeo de pares Clave-Valor usando una estructura de datos Map o Dictionary.*

Check out the [Tutorial](https://www.hackerrank.com/challenges/30-dictionaries-and-maps/tutorial) tab for learning materials and an instructional video!  
*Consulta la pestaña de [Tutorial](https://www.hackerrank.com/challenges/30-dictionaries-and-maps/tutorial) para materiales de aprendizaje y un video instructivo.*

## ✅ Task | *Tarea*

Given $n$ names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.  
*Dado $n$ nombres y números de teléfono, arma una agenda telefónica que relacione los nombres con sus respectivos números.*

You will then be given an unknown number of names to query your phone book for.  
*Luego recibirás una cantidad desconocida de nombres para buscar en tu agenda.*

For each $name$ queried, print the associated entry from your phone book on a new line in the form `name=phoneNumber`; if an entry for $name$ is not found, print `Not found` instead.  
*Por cada $name$ consultado, imprime la entrada correspondiente en una nueva línea con el formato `name=phoneNumber`; si no se encuentra una entrada para ese $name$, imprime `Not found`.*

**Note:**   
Your phone book should be a Dictionary/Map/HashMap data structure.  
*Tu agenda telefónica debe ser una estructura de datos Dictionary/Map/HashMap.*

## 📥 Input Format | *Formato de Entrada*

+ The first line contains an integer, $n$, denoting the number of entries in the phone book.  
*La primera línea contiene un número entero $n$, que indica cuántas entradas tiene la agenda telefónica.*

+ Each of the $n$ subsequent lines describes an entry in the form of $2$ space-separated values on a single line.  
*Cada una de las $n$ líneas siguientes describe una entrada con $2$ valores separados por espacio en una sola línea.*

+ The first value is a friend’s name, and the second value is an $8$-digit phone number.  
*El primer valor es el nombre del amigo, y el segundo valor es un número telefónico de $8$ dígitos.*

+ After the $n$ lines of phone book entries, there are an unknown number of lines of queries.  
*Después de las $n$ líneas con entradas, hay un número desconocido de líneas de consulta.*

+ Each line (query) contains a $name$ to look up, and you must continue reading lines until there is no more input.  
*Cada línea contiene un $name$ para buscar, y debes seguir leyendo hasta que no haya más entrada.*

**Note:**  
Names consist of lowercase English alphabetic letters and are first names only.  
*Los nombres contienen solo letras minúsculas del alfabeto inglés y son únicamente primeros nombres.*

## 📏Constraints | *Restricciones*

+ $1 \leq n \leq 10^5$  
+ $1 \leq queries \leq 10^5$  

## 📤 Output Format | *Formato de Salida*

+ On a new line for each query, print `Not found` if the name has no corresponding entry in the phone book;  
*En una nueva línea por cada consulta, imprime `Not found` si el nombre no tiene entrada correspondiente;*

+ otherwise, print the full $name$ and $phoneNumber$ in the format `name=phoneNumber`.  
*de lo contrario, imprime el $name$ y $phoneNumber$ con el formato `name=phoneNumber`.*

## 🔡 Sample Input | *Entrada de Ejemplo*

```bash
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
```

## 🔢 Sample Output | *Salida de Ejemplo*

```bash
sam=99912222
Not found
harry=12299933
```

Perfecto, aquí tienes la transcripción y traducción del contenido de la segunda imagen en formato markdown, lista para incluir en tu README:

## 🧠 Explanation | *Explicación*

+ We add the following $n = 3$ (Key, Value) pairs to our map so it looks like this:  
*Agregamos los siguientes $n = 3$ pares (Clave, Valor) a nuestro mapa, por lo que se ve así:*

  `phoneBook = {(sam, 99912222), (tom, 11122222), (harry, 12299933)}`

+ We then process each query and print `key=value` if the queried $key$ is found in the map; otherwise, we print `Not found`.  
*Luego procesamos cada consulta e imprimimos `key=value` si la $key$ buscada se encuentra en el mapa; de lo contrario, imprimimos `Not found`.*

**Query 0: `sam`**  
Sam is one of the keys in our dictionary, so we print `sam=99912222`.  
*Sam es una de las claves en nuestro diccionario, así que imprimimos `sam=99912222`.*

**Query 1: `edward`**  
Edward is not one of the keys in our dictionary, so we print `Not found`.  
*Edward no es una de las claves en nuestro diccionario, así que imprimimos `Not found`.*

**Query 2: `harry`**  
Harry is one of the keys in our dictionary, so we print `harry=12299933`.  
*Harry es una de las claves en nuestro diccionario, así que imprimimos `harry=12299933`.*

***Solution***  
[***Main.java***](./src/Main.java) 👈

| [🔝](#day-8-dictionariees-and-maps) | [🏠](../README.md) |
| --- | --- |