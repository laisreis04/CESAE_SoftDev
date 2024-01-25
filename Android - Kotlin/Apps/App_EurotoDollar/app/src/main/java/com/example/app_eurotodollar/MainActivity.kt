package com.example.app_eurotodollar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app_eurotodollar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Exercício inserir nome

        binding.botaoHello.setOnClickListener {

            var nome: String = binding.textoNome.text.toString();
            var sobrenome: String = binding.textoSobrenome.text.toString();

            if (nome.isEmpty() || sobrenome.isEmpty()) {
                Toast.makeText(applicationContext, "Não foi inserido nome", Toast.LENGTH_SHORT).show()
                binding.textoResultado.text = "Nome não inserido"
            } else {
                binding.textoResultado.text = "Hello $nome $sobrenome"
            }


            //Exercício 1 calculadora

//        binding.botaoConversor.setOnClickListener{
//            //Colocar aqui a função para funcionar a açar de converter
//
//            var euro: Double = binding.textoEuros.text.toString().toDouble()
//            var valorConverter: Double= 1.09
//
//            var dolares: Double = euro * valorConverter
//
//            dolares = String.format("&.2f",dolares).toDouble();
//
//            binding.textoResultado.text = "Valor em Dollars : $dolares $"
//
//
//        }


        }
    }}