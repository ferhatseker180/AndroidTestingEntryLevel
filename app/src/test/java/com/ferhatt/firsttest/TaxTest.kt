package com.ferhatt.firsttest

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax : Tax

    @Before
    fun setup(){
        // onCreate metodunun işlevini görür, global değişkenlerimizi burada tanımlarız.
        tax = Tax()
    }

    @After
    fun tearDown(){
        // İşlem bittikten sonra yapılacak olanları belirtiriz.
    }

    @Test
    fun `calculate Tax Test`(){
        val netTax = tax.calculate(100.0,0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest(){

        val netIncome = tax.calculateIncome(100.0,0.1)
        assertThat(netIncome).isEqualTo(90)
    }

}