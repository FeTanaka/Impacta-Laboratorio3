package br.com.impacta.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.com.impacta.laboratorio3.databinding.ActivityMainBinding
import br.com.impacta.laboratorio3.databinding.TesteBinding

class MainActivity : AppCompatActivity() {

    var _binding: ActivityMainBinding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        var root = binding.root
        setContentView(root)

        binding.button.setOnClickListener {
            if (binding.editTextNumber.text.toString() == "") {
                binding.textView.text = "Por favor digite sua idade."
            } else {
                var idade = binding.editTextNumber.text.toString().toInt()
                var desconto = if (idade > 50) 30
                else if (idade in 25..50)  15
                else  5

                binding.textView.text = "A quantidade de desconto é ${desconto}%"
            }
        }
    }
}