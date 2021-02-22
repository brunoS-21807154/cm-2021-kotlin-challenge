package pt.ulusofona.cm.kotlin.challenge.exceptions

class PessoaSemCartaException(mensagem : String = "Esta pessoa não possui uma carta de condução.") : Exception(mensagem) {
}
