package com.aldy.projectkalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListener()
    }

    private fun calc(val1:Int,val2:Int): String {
        val result = val1 + val2
        val resultString = result.toString()
        return resultString
    }

    private fun setupListener(){
        btnHitung.setOnClickListener {
            val value1 = edt1.text.toString().toInt()
            val value2 = edt2.text.toString().toInt()

            tvHasil.text = calc(value1 , value2)
        }
    }
}