package com.example.pracrice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    var A: String = ""
    var B: String = ""

    fun reshi(view: View)
    {
        val btn =view as Button
        val edittxt1:EditText=findViewById(R.id.textView6)
        val edittxt2:EditText=findViewById(R.id.textView7)
        val otvet:TextView=findViewById(R.id.textView8)

        if (edittxt1.text.toString()=="")
        {
            Toast.makeText(this,"Введите число!", Toast.LENGTH_SHORT).show()
            edittxt1.requestFocus()
        }

        else if (edittxt2.text.toString()=="")
        {
            Toast.makeText(this,"Введите число!", Toast.LENGTH_SHORT).show()
            edittxt2.requestFocus()
        }
        else when (btn.id){
            R.id.button3 -> {
                A = edittxt1.text.toString()
                B = edittxt2.text.toString()
                btnGipotez(A,B)
            }
            R.id.button4 -> {
                A = edittxt1.text.toString()
                B = edittxt2.text.toString()
                var C:String = sqrt(A.toDouble().pow(2.0) + B.toDouble().pow(2.0)).toString()
                otvet.text ="Ответ:"+ (A.toDouble() + B.toDouble() + C.toDouble()).toString()
            }
            R.id.button5 -> {
                A = edittxt1.text.toString()
                B = edittxt2.text.toString()
                Square(A,B)
            }
        }
    }
    fun btnGipotez(A:String, B:String){
        val tv: TextView = findViewById(R.id.textView8)
        tv.text ="Ответ:"+ sqrt(A.toDouble().pow(2.0) + B.toDouble().pow(2.0)).toString()
    }

    fun Square(A: String, B: String){
        val tv: TextView = findViewById(R.id.textView8)
        tv.text = "Ответ:"+((A.toDouble() * B.toDouble()) / 2).toString()
    }

    }

