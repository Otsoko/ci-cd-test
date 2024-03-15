package com.jfcoding.cicdtest.data

class Calculator(
    var a: Int = 0,
    var b: Int = 0
) {

    fun sum(): Int {
        return a + b
    }

}