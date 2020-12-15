class BonusCalculator {
    var amount: Double = 0.0; private set

    fun calculate(employee: Employee): BonusCalculator {
        amount += employee.bonus
        return this
    }
}