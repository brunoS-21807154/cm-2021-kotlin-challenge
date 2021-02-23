package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro(_identificador: String, val _motor: Motor) : Veiculo(_identificador), Movimentavel, Ligavel {

    val motor get() = _motor

    override fun ligar() {
        _motor.ligado = true
    }

    override fun desligar() {
        _motor.ligado = false
    }

    override fun estaLigado(): Boolean {

        return _motor.ligado
    }

    override fun moverPara(x: Int, y: Int){

    }

    override fun toString(): String =
        "Carro | $_identificador | data de aquisicao | Posicao | x:${posicao.x} | y:${posicao.y}"
}
