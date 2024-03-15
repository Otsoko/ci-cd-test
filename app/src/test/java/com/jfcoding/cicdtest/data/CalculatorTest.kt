package com.jfcoding.cicdtest.data

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest{

    private lateinit var calculator: Calculator

    @BeforeEach
    fun beforeEach(){
        calculator = Calculator()
    }

    @Test
    fun `Test two integers`(){
        calculator.a = 2
        calculator.b = 3

        val result = calculator.sum()

        assertEquals(result, 2+3)
    }
}