package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

class Posicao(private var _x: Int = 0, private var _y: Int = 0) {

    val x get() = _x
    val y get() = _y

    fun alterarPosicaoPara(x: Int, y: Int){
        _x = x
        _y = y
    }

    override fun toString(): String = "Posicao | x:$_x | y:$_y"
}
