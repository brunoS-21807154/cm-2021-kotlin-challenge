package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

abstract class Veiculo(val _identificador: String) {

    val _posicao: Posicao = Posicao()

    val _dataDeAquisicao: Date = Date()

    val identificador get() = _identificador

    val posicao get() = _posicao

    val dataDeAquisicao get() = _dataDeAquisicao

    fun requerCarta(): Boolean {
        return false
    }
}
