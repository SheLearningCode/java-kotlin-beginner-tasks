import com.sun.nio.sctp.IllegalReceiveException

class Bank {
    var account_balance = 0.0
    val MAX_DEPOSIT = 1000

    fun withdraw(amount: Double) {
        if (amount > MAX_DEPOSIT) {
            throw Exception("You can't withdraw that amount")
        } else if (amount > account_balance) {
            throw Exception("You don't have that money")
        } else {
            account_balance -= amount
        }
    }

    fun deposit(amount: Double) {
        account_balance += amount
    }

    override fun toString(): String {
        return "Bank(account_balance=$account_balance)"
    }
}

fun main() {
    var myaccount = Bank()
    myaccount.deposit(100.0)

    myaccount.toString()

    /*myaccount.withdraw(150.0)

    myaccount.toString()*/

    myaccount.withdraw(1500.0)

    myaccount.toString()
}
