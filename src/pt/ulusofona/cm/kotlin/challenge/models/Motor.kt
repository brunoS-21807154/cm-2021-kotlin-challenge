package pt.ulusofona.cm.kotlin.challenge.models

class Motor(val _cavalos: Int, val _cilindrada: Int) {

    val cavalos get() = _cavalos
    val cilindrada get() = _cilindrada
    var ligado: Boolean = false

    override fun toString(): String = "Motor | $_cavalos | $_cilindrada"

}
