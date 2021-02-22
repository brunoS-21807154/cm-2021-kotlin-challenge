package pt.ulusofona.cm.kotlin.challenge.exceptions

import java.lang.Exception

class MenorDeIdadeException(mensagem : String = "Esta pessoa é demasiado nova para tirar a carta.") : Exception(mensagem) {
}
