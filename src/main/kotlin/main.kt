fun main() {
    println("--------------")
    println("Welcome to Bytebank")
    println("--------------")

    val douglasAccount = Account()
    douglasAccount.owner = "Douglas"
    douglasAccount.number = 1001
    douglasAccount.balance = 200.0

    val babiAccount = Account()
    babiAccount.owner = "Babi"
    babiAccount.number = 1002
    babiAccount.balance = 300.0

    println(douglasAccount)
    println(babiAccount)
}

private fun createAllAccounts() {
    for (index in 5 downTo 1) {
        val bankAccountOwner = "Douglas $index"
        println("\nBank account owner: $bankAccountOwner")

        val bankAccount = 1000 + index
        var bankBalance = 100 + 2.0
        bankBalance += 200

        println("Bank account: $bankAccount")
        println("Bank balance: $bankBalance")
    }
}

private fun validateBankBalance(bankBalance: Double) {
    when {
        bankBalance > 0.0 -> println("Your bank balance is positive")
        bankBalance < 0.0 -> println("Your bank balance is negative")
        else -> println("No bank balance")
    }
}