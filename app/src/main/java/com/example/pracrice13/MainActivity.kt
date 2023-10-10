package com.example.pracrice13

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtv:EditText = findViewById(R.id.EDtextView)
        edtv.requestFocus()
    }



    @SuppressLint("SetTextI18n")
    fun Click(view: View)
    {
        val edTXT1:EditText=findViewById(R.id.EDtextView)
        val edTXT2:EditText=findViewById(R.id.EDtextView2)
        val tv:TextView=findViewById(R.id.textView5)
        if (edTXT1.text.toString()=="")
        {
            Toast.makeText(this,"Введите курс обмена!",Toast.LENGTH_SHORT).show()
            edTXT1.requestFocus()
        }
        else if (edTXT2.text.toString()=="")
        {
            Toast.makeText(this,"Введите сумму для обмена!",Toast.LENGTH_SHORT).show()
            edTXT2.requestFocus()
        }
        else
        {
            var res:String="Результат:"
            val txt1:String=edTXT1.text.toString()
            val txt2:String=edTXT2.text.toString()
            var num1:Int=txt1.toInt()
            var num2:Int=txt2.toInt()
            tv.setText ((num1*num2).toString())
        }

    }

    fun Next(view: View)
    {
        val intent:Intent= Intent(this@MainActivity,MainActivity2::class.java)
        startActivity(intent)
    }
}