fun main() {
    println("--------------")
    println("Welcome to Bytebank")
    println("--------------")

    val bankAccountOwner = "Douglas"
    println("Bank account owner: $bankAccountOwner")

    val bankAccount = 4321
    var bankBalance = 100 + 2.0
    bankBalance += 200

    println("Bank account: $bankAccount")
    println("Bank balance: $bankBalance")

    when {
        bankBalance > 0.0 -> println("Your bank balance is positive")
        bankBalance < 0.0 -> println("Your bank balance is negative")
        else -> println("No bank balance")
    }
}