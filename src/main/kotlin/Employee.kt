open class Employee(
    val name: String,
    val cpf: String,
    val salary: Double
) {

    open fun bonus(): Double {
        return salary * 0.1
    }

    override fun toString(): String {
        return "${this.javaClass.simpleName}(name='$name', cpf='$cpf', salary=$salary)"
    }
}
