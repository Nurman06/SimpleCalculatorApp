package com.example.tes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        val resultText = findViewById<TextView>(R.id.resultText)

        buttonAdd.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 + num2
                resultText.text = "Hasil: $result"
            } else {
                resultText.text = "Masukkan angka yang valid"
            }
        }

        buttonSubtract.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 - num2
                resultText.text = "Hasil: $result"
            } else {
                resultText.text = "Masukkan angka yang valid"
            }
        }

        buttonMultiply.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                resultText.text = "Hasil: $result"
            } else {
                resultText.text = "Masukkan angka yang valid"
            }
        }

        buttonDivide.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    resultText.text = "Hasil: $result"
                } else {
                    resultText.text = "Tidak bisa membagi dengan 0"
                }
            } else {
                resultText.text = "Masukkan angka yang valid"
            }
        }
    }
}