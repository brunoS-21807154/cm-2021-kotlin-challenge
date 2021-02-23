package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.awt.List
import java.util.*

class Pessoa(private val _nome: String, private val _dataDeNascimento: Date) : Movimentavel {

        private var _veiculos: MutableCollection<Veiculo> = mutableListOf()
        private var _carta: Carta? = null
        private var _posicao: Posicao = Posicao()

    val nome get() = _nome
    val dataDeNascimento get() = _dataDeNascimento
    val posicao get() = _posicao


    fun comprarVeiculo(veiculo: Veiculo) {}

    fun pesquisarVeiculo(identificador: String): Veiculo {

        for (_veiculo in _veiculos){
            if (_veiculo._identificador == identificador){
                return _veiculo
            }
        }

        throw VeiculoNaoEncontradoException()
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa) {

    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {

    }

    fun temCarta(): Boolean {

        if(_carta != null){
            return true
        }

        return false
    }

    fun tirarCarta() {
        //se a pessoa for maior de idade
        _carta = Carta()

        //se não
        throw MenorDeIdadeException()

    }

    override fun moverPara(x: Int, y: Int){

    }

    override fun toString(): String = "Pessoa | $_nome | data de nascimento | Posicao | x:${posicao.x} | y:${posicao.y}"

}
