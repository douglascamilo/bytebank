class Director(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary) {

    override fun bonus(): Double {
        return salary * 0.25
    }
}