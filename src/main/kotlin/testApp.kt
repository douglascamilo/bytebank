fun testApp() {
    val douglasAccount = Account("Douglas", 1001)
    douglasAccount.payIn(200.0)

    val babiAccount = Account("Babi", 1002)
    babiAccount.payIn(300.0)

    println(douglasAccount)
    println(babiAccount)

    println()
    println("Pay in ${douglasAccount.owner}'s Account...")
    douglasAccount.payIn(50.0)

    println("Pay in ${babiAccount.owner}'s Account...")
    babiAccount.payIn(180.0)

    println(douglasAccount)
    println(babiAccount)

    println()
    println("Withdraw ${douglasAccount.owner}'s Account...")
    douglasAccount.withdraw(70.0)

    println("Withdraw ${babiAccount.owner}'s Account...")
    babiAccount.withdraw(120.0)

    println(douglasAccount)
    println(babiAccount)

    println()
    println("Transfer from ${babiAccount.owner} to ${douglasAccount.owner}")
    babiAccount.transfer(90.0, douglasAccount)

    douglasAccount.payIn(-100.0)
    println(douglasAccount)
    println(babiAccount)
}