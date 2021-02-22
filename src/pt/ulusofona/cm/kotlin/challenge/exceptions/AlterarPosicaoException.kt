package pt.ulusofona.cm.kotlin.challenge.exceptions

import java.lang.Exception

class AlterarPosicaoException(mensagem : String = "O veículo já se encontra nesta posição.") : Exception(mensagem) {
}
