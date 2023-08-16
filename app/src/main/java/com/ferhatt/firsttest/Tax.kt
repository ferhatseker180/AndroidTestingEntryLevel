package com.ferhatt.firsttest

class Tax {

    // TDD -> Test Driven Development

    fun calculate(grossIncome : Double, taxRate : Double) : Double{
        return grossIncome * taxRate
    }

    fun calculateIncome(grossIncome: Double,taxRate: Double) : Double {
        return grossIncome - (grossIncome * taxRate)
    }
}