package com.example.linearsetting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.linearsetting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy {

        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.real.setOnClickListener {

            var euro:Double = binding.editValorEuros.text.toString().toDouble();

            var conversorReal = 4.4;

            var real = euro * conversorReal;

            real = String.format("&.2f", real).toDouble();

            binding.textoResultado.text = "R$ {$real} "

        }

        binding.dolar.setOnClickListener {

            var euro:Double = binding.editValorEuros.text.toString().toDouble();

            var conversorDolar = 1.2;

            var dolar = euro * conversorDolar;

            dolar = String.format("&.2f", dolar).toDouble();

            binding.textoResultado.text = "$ {$dolar} "

        }

        binding.peso.setOnClickListener {

            var euro:Double = binding.editValorEuros.text.toString().toDouble();

            var conversorPeso = 31.5;

            var peso = euro * conversorPeso;

            peso = String.format("&.2f", peso).toDouble();

            binding.textoResultado.text = "Pesos {$peso} "

        }

    }
}