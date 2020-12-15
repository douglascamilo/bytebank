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