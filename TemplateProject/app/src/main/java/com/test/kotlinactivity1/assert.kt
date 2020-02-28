package com.test.kotlinactivity1

fun <T> assertThat(test: T, must: T, number: Int) {
    if (test != must) {
        throw Error("\n-> Error in test #%d:\n\nExpected %s, but got %s".format(
                number, must.toString(), test.toString())
        )
    }

    println("Test #%d: Passed".format(number))
}
