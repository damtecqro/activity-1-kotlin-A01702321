package com.test.kotlinactivity1
package com.test.kotlinactivity1.assert

//Problema 49
/*
* Algoritmo
*
* if bits = 1
*   then res = 0 1
* if bits = 2
*   then res = 00 01 10 11
* if bits = 3
*   then res = 000 001 010 011 100 101 110 111
*
* diferencia entre 1, 2 y 3:
*   1: 2 elementos con 1 digitos
*
*   2: 4 elementos con 2 digitos
*
*   3: 8 elementos con 3 digitos
*
* los elementos son 2^(# de bits) y los digitos son los numeros de bits
*
* al res de 1 bit se duplica el res, a un res se agrega un 0 antes de todos y al otro res se agrega un 1 antes de todos.
*/

fun p49(bits: Int): List<String> =
        if (bits == 0) listOf("")
        else {
            val gray = p49(bits - 1)
            gray.map { "0" + it } + gray.map { "1" + it }
        }

assertThat(p49(bits = 1), equalTo(listOf("0", "1")))
assertThat(p49(bits = 2), equalTo(listOf("00", "01", "10", "11")))
assertThat(p49(bits = 3), equalTo(listOf("000", "001", "010", "011", "100", "101", "110", "111")))
assertThat(p49(bits = 4), equalTo(listOf("0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111")))
assertThat(p49(bits = 5), equalTo(listOf("00000", "00001", "00010", "00011", "00100", "00101", "00110", "00111", "01000", "01001", "01010", "01011", "01100", "01101", "01110", "01111", "10000", "10001", "10010", "10011", "10100", "10101", "10110", "10111", "11000", "11001", "11010", "11011", "11100", "11101", "11110", "11111")))
