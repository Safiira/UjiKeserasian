package com.example.hafidh16670060.ujikeserasian

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener { randomMatch() }
    }


    fun randomMatch() {
        val randomPerempuan = Random().nextInt(4) + 1
        val randomLaki = Random().nextInt(4) + 1
        val drawableResPerempuan = when (randomPerempuan) {
            1 -> R.drawable.p8
            2 -> R.drawable.p2
            3 -> R.drawable.p3
            4 -> R.drawable.p4
            5 -> R.drawable.p5
            6 -> R.drawable.p6
            else -> R.drawable.p7
        }
        val drawableResLaki = when (randomLaki) {
            1 -> R.drawable.l1
            2 -> R.drawable.l2
            3 -> R.drawable.l3
            4 -> R.drawable.l4
            5 -> R.drawable.l5
            6 -> R.drawable.l6
            7 -> R.drawable.l7
            8 -> R.drawable.l8
            9 -> R.drawable.l9
            10 -> R.drawable.l10
            11 -> R.drawable.l11
            12 -> R.drawable.l12
            13 -> R.drawable.l13
            14 -> R.drawable.l14
            15 -> R.drawable.l15
            16 -> R.drawable.l16
            else -> R.drawable.l17

        }

        ivDadu1.setImageResource(drawableResPerempuan)
        ivDadu2.setImageResource(drawableResLaki)
    }
}