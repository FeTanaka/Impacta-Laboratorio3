package br.com.impacta.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var editText: EditText? = null
    var button: Button? = null
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editTextNumber)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button?.setOnClickListener {
            if (editText?.text.toString() == "") {
                textView?.text = "Por favor digite sua idade."
            } else {
                var idade = editText?.text.toString().toInt()
                var desconto = if (idade > 50) 30
                else if (idade in 25..50)  15
                else  5

                textView?.text = "A quantidade de desconto é ${desconto}%"
            }
        }
    }
}