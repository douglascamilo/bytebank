fun main() {
    logGreetings()

    val employee = Employee(
        "Douglas",
        "12345678900",
        1000.0
    )

    val manager = Manager(
        "Manager",
        "00123456789",
        4000.0
    )

    val director = Director(
        "Director",
        "00000000191",
        9000.0
    )

    println(employee)
    println("Employee bonus: ${employee.bonus}")

    println()
    println(manager)
    println("Manager bonus: ${manager.bonus}")

    println()
    println(director)
    println("Manager bonus: ${director.bonus}")
}