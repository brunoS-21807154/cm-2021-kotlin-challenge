package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta(_identificador: String) : Veiculo(_identificador), Movimentavel {

    override fun moverPara(x: Int, y: Int){

    }

    override fun toString(): String = "Bicicleta | $_identificador | data de aquisicao | Posicao | x:${posicao.x} | y:${posicao.y}"
}
