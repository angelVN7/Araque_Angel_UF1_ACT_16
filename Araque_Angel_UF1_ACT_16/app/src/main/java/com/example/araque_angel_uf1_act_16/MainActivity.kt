package com.example.araque_angel_uf1_act_16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vertBut: Button = findViewById(R.id.vert)
        var vermBut: Button = findViewById(R.id.vermell)
        var blauBut: Button = findViewById(R.id.blau)


        vertBut.setOnClickListener{
            val myIntent = Intent(this, MainActivity2::class.java)
            startActivity(myIntent)
        }
        vermBut.setOnClickListener{
            val myIntent = Intent(this, MainActivity3::class.java)
            startActivity(myIntent)
        }
        blauBut.setOnClickListener{
            val myIntent = Intent(this, MainActivity4::class.java)
            startActivity(myIntent)
        }
    }

}