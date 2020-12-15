class Manager(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary) {

    override val bonus: Double get() = salary * 0.2
}