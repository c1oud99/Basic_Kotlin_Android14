package eu.tutorials.bankaccountprogram

fun main(){
    val haniBankAccount = BankAccount("Hani", 1338.20)
    val sarahBackAccount = BankAccount("Sarah", 0.0)
    haniBankAccount.deposit(200.0)
    haniBankAccount.withdraw(1200.00)
    haniBankAccount.deposit(3000.00)
    haniBankAccount.deposit(2000.00)
    haniBankAccount.withdraw(3333.15)

    sarahBackAccount.deposit(100.0)
    sarahBackAccount.withdraw(10.0)
    sarahBackAccount.deposit(300.00)

    haniBankAccount.displayTransactionHistory()
    println("${haniBankAccount.accountHolder}'s balance is ${haniBankAccount.acctBalance()}")

    sarahBackAccount.displayTransactionHistory()
    println("${sarahBackAccount.accountHolder}'s balance is ${sarahBackAccount.acctBalance()}")
}