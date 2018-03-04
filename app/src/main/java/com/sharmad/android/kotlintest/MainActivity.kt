package com.sharmad.android.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class   MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val food= arrayListOf("Italian","Indian","Chinese","Thai","Burger","Pizza","Goan","Mangalorean")

        addFood.setOnClickListener {
            addFood.isFocusableInTouchMode=true

        }
         decide.setOnClickListener {
           val random=Random()
           val randomFood=random.nextInt(food.count())
           selectFoodText.text=food[randomFood]

         }

        addButton.setOnClickListener {

            val newFood=addFood.text.toString()
            if(newFood.isNotEmpty()) {
                food.add(newFood)
                addFood.text.clear()
                println(food)
            }
            else
            {
                addFood.setError("Enter name")
                Toast.makeText(applicationContext, "Enter the name ", Toast.LENGTH_SHORT).show()            }
        }

    }
}


