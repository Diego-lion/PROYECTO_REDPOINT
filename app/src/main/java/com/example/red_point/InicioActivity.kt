package com.example.red_point
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InicioActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.buttoncomienza)
        button.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        val txtRegistro = findViewById<TextView>(R.id.Registrate)
        txtRegistro.setOnClickListener {
            val intent = Intent(this, ResgisterActivity::class.java)
            startActivity(intent)
        }

    }
}