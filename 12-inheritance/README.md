# **Day 12: Inheritance**

## 🏁 **Objective | *Objetivo***

Today, we’re delving into Inheritance. Check out the attached tutorial for learning materials and an instructional video.

*Hoy profundizaremos en la Herencia. Consulta el tutorial adjunto para materiales de aprendizaje y un video instructivo.*

## 📃 **Task | *Tarea***

You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

*Se te proporcionan dos clases, `Person` y `Student`, donde `Person` es la clase base y `Student` es la clase derivada. En el editor se te proporciona el código completo de la clase `Person` y la declaración de la clase `Student`. Observa que `Student` hereda todas las propiedades de `Person`.*

Complete the Student class by writing the following:  
*Completa la clase `Student` escribiendo lo siguiente:*

* A Student class constructor, which has 4 parameters:  
*Un constructor para la clase `Student`, que tiene 4 parámetros:*

  1. A string, `firstName`.
  2. A string, `lastName`.
  3. An integer, `idNumber`.
  4. An integer array (or vector) of test scores, `scores`.

* A `char calculate()` method that calculates a Student object’s average and returns the grade character representative of their calculated average:  
*Un método `calculate()` que calcule el promedio de las calificaciones del estudiante y devuelva el carácter correspondiente según su promedio:*

### **Grading Scale | *Escala de Calificación***

| Letter | Average (a)  |
| ------ | ------------ |
| O      | 90 ≤ a ≤ 100 |
| E      | 80 ≤ a < 90  |
| A      | 70 ≤ a < 80  |
| P      | 55 ≤ a < 70  |
| D      | 40 ≤ a < 55  |
| T      | a < 40       |

## 📥 **Input Format | *Formato de Entrada***

1. The locked stub code in the editor reads the input and calls the Student class constructor with the necessary arguments. It also calls the `calculate` method which takes no arguments.

    *El código de plantilla bloqueado en el editor lee la entrada y llama al constructor de la clase Student con los argumentos necesarios. También llama al método `calculate`, que no recibe argumentos.*

1. The first line contains `firstName`, `lastName`, and `idNumber`, separated by a space. The second line contains the number of test scores. The third line of space-separated integers describes `scores`.

    *La primera línea contiene `firstName`, `lastName` e `idNumber`, separados por un espacio. La segunda línea contiene la cantidad de calificaciones. La tercera línea contiene los valores de `scores`, separados por espacios.*

## 📏 **Constraints | *Restricciones***

* 1 ≤ length of `firstName`, length of `lastName` ≤ 10

* length of `idNumber` ≡ 7

* 0 ≤ `score` ≤ 100

## 📤 **Output Format | *Formato de Salida***
Output is handled by the locked stub code. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

*La salida es manejada por el código stub bloqueado. La salida será correcta si el constructor de la clase Student y el método calculate() están implementados correctamente.*

## 🔡 **Sample Input | *Ejemplo de Entrada*** 

```bash
Heraldo Memelli 8135627
2
100 80
```

## 🖨️ **Sample Output | *Ejemplo de Salida***

```bash
Name: Memelli, Heraldo
ID: 8135627
Grade: 0
```

## 🗣️ **Explanation | *Explicación***

This student had `2` scores to average: `100` and `8`0. The student's average grade is `(100 + 80) / 2 = 90`. An average grade of `90` corresponds to the letter grade **`O`**, so the calculated method should return the character `O`.

*Este estudiante tenía `2` calificaciones para promediar: `100` y `80`. El promedio del estudiante es `(100 + 80) / 2 = 90`. Un promedio de `90` corresponde a la calificación en letra **`O`**, por lo que el método calculado debe devolver el carácter `O`.*

***Solution***  
[***Main.java***](./src/Main.java) 👈  
[***Person.java***](./src/Person.java) 👈  
[***Student.java***](./src/Student.java) 👈  

| [🔝](#day-12-inheritance) | [🏠](../README.md) |
| --- | --- |