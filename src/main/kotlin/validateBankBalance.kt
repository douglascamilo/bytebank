private fun validateBankBalance(bankBalance: Double) {
    when {
        bankBalance > 0.0 -> println("Your bank balance is positive")
        bankBalance < 0.0 -> println("Your bank balance is negative")
        else -> println("No bank balance")
    }
}