package com.calculadora.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.calculadora.calculadora.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*supportActionBar!!.hide()
        *esta dando erro ao compilar com essa funcao
        * - FATAL EXCEPTION: main Process: com.example.calculadora_kotlin, PID: 32652  */

        //Eventos de clique
        binding.numeroZero.setOnClickListener { AcrescentarUmaExpressao("0", limpar_dados = true) }
        binding.numeroUm.setOnClickListener { AcrescentarUmaExpressao("1", limpar_dados = true) }
        binding.numeroDois.setOnClickListener { AcrescentarUmaExpressao("2", limpar_dados = true) }
        binding.numeroTres.setOnClickListener { AcrescentarUmaExpressao("3", limpar_dados = true) }
        binding.numeroQuatro.setOnClickListener { AcrescentarUmaExpressao("4", limpar_dados = true) }
        binding.numeroCinco.setOnClickListener { AcrescentarUmaExpressao("5", limpar_dados = true) }
        binding.numeroSeis.setOnClickListener { AcrescentarUmaExpressao("6", limpar_dados = true) }
        binding.numeroSete.setOnClickListener { AcrescentarUmaExpressao("7", limpar_dados = true) }
        binding.numeroOito.setOnClickListener { AcrescentarUmaExpressao("8", limpar_dados = true) }
        binding.numeroNove.setOnClickListener { AcrescentarUmaExpressao("9",limpar_dados = true) }
        binding.ponto.setOnClickListener { AcrescentarUmaExpressao(".",limpar_dados = true) }

        //operadores
        binding.adicao.setOnClickListener { AcrescentarUmaExpressao("+", false) }
        binding.subtracao.setOnClickListener { AcrescentarUmaExpressao("-", false) }
        binding.multiplicacao.setOnClickListener { AcrescentarUmaExpressao("*", false) }
        binding.divisao.setOnClickListener { AcrescentarUmaExpressao("/", false) }

        binding.limpar.setOnClickListener {
            binding.expressao.text = ""
            binding.txtResultado.text = ""
        }

        binding.backspace.setOnClickListener {
            val string = binding.expressao.text.toString()

            if(string.isNotBlank()){
                binding.expressao.text = string.substring(0, string.length-1)
            }
            binding.txtResultado.text = ""

        }

        binding.igual.setOnClickListener {

            try {
                val expressao = ExpressionBuilder(binding.expressao.text.toString()).build()

                val resultado = expressao.evaluate()
                val longResult = resultado.toLong()

                if(resultado == longResult.toDouble())
                    binding.txtResultado.text = longResult.toString()
                else
                    binding.txtResultado.text = resultado.toString()


            }catch ( e: Exception){

            }
        }

    }


    fun AcrescentarUmaExpressao(string: String, limpar_dados: Boolean){

        if(binding.txtResultado.text.isNotEmpty()){
            binding.expressao.text = ""
        }
        if(limpar_dados){
            binding.txtResultado.text = ""
            binding.expressao.append(string)
        }else{
            binding.expressao.append(binding.txtResultado.text)
            binding.expressao.append(string)
            binding.txtResultado.text = ""
        }


    }
}