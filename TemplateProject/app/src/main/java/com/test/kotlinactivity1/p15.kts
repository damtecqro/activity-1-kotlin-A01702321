package com.test.kotlinactivity1
package com.test.kotlinactivity1.assert

// Problema 15

/*
* Algoritmo
*
*
* fun p15 (n, List)
* list res = ''
*
*   for (i=0;i<sizeofList;i++)
*       res = List[i] * n
*   end for
*
* return res
*
*
*
* recibe n y la lista a duplicar elementos
*
* se leen los elementos de la lista 1 por 1
*
* el primer elemento se multiplaca por n y se agrega a una nueva lista
* se repite por todos los elementos y se agregan a la nueva lista hasta leer todos los elementos en la lista
*
*/

fun <T> p15(n: Int, list: List<T>): List<T> =
        list.flatMap { value -> List(n, { value }) }

assertThat(p15(3, "abccd".toList()), equalTo("aaabbbccccccddd".toList()))
assertThat(p15(3, "abba".toList()), equalTo("aaabbbbbbaaa".toList()))
assertThat(p15(2, "xolotl".toList()), equalTo("xxoolloottll".toList()))
assertThat(p15(5, "max".toList()), equalTo("mmmmmaaaaaxxxxx".toList()))