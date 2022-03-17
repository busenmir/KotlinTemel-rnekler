package com.busedemir.kotlinornekleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("------**FAKTÖRİYEL**---------")
        val num = 5
        var factorial = 1
        for (i in 1..num) {
            factorial = factorial * i
            println("$factorial")
        }

        println("------**FİBONACCİ**---------")
            val n = 10
            var t1 = 0
            var t2 = 1
            println("First $n terms: ")
            for (i in 1..n) {
                println("$t1 + ")
                val sum = t1 + t2
                t1 = t2
                t2 = sum
            }

        println("---------**PALİNDROM SAYI**-------")
        var num1 = 121
        var tersSayi = 0
        var gerceksayi = num1
        var kalan : Int

        while (num1 != 0) {
            kalan = num1 % 10
            tersSayi = tersSayi * 10 + kalan
            num1 /= 10
        }
        if (gerceksayi == tersSayi){
            println("palindrom sayıdır")
        }else{
            println("palindrom sayı değil")
        }

        println("---------***AsalSayi***--------")
        val num2 = 7
        var flag = false
        for (i in 2..num2/2 ) {
            if (num2 % i == 0) {
                flag = true
                break
            }
        }
        if (!flag)
            println("$num2 asal sayıdır")
        else
            println("$num2 asal sayı değildir")
    }
}