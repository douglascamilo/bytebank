fun main() {
    logGreetings()

    val employee = Employee(
        "Douglas",
        "12345678900",
        1000.0
    )

    println(employee)
    println("Bonus: ${employee.bonus()}")
}