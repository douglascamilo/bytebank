class Account {
    var owner = ""
    var number = 0
    var balance = 0.0

    fun payIn(value: Double) {
        balance += value
    }

    fun withdraw(value: Double): Boolean {
        if (balance < value) {
            return false
        }

        balance -= value
        return true
    }

    fun transfer(value: Double, destination: Account): Boolean {
        if (!this.withdraw(value)) {
            return false
        }

        destination.payIn(value)
        return true
    }

    override fun toString(): String {
        return "Account(owner='$owner', number=$number, balance=$balance)"
    }
}