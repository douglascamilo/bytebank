fun logGreetings() {
    val welcomeMessage = "Welcome to Bytebank"
    val totalOfHifens = welcomeMessage.length + 8

    logHifens(totalOfHifens)
    println("\t$welcomeMessage")
    logHifens(totalOfHifens)
    println()
}

private fun logHifens(totalOfHifens: Int) {
    var strHifen = ""

    for (index in 1..totalOfHifens) {
        strHifen += "-"
    }

    println(strHifen)
}