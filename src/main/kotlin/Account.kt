class Account {
    var owner = ""
    var number = 0
    var balance = 0.0

    override fun toString(): String {
        return "Account(owner='$owner', number=$number, balance=$balance)"
    }
}