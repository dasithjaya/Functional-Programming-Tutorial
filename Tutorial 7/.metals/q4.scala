object q4 extends App {

    var accountList:List[Account] = List()

    def accCreate(name:String, accId: Int):Unit = {
        val acc = new Account(name, accId)
        accountList = accountList ::: acc :: Nil
    }

    val find = (a:Int, b:List[Account]) => b.filter(account => account.accId.equals(a))
    val overdraft = (b:List[Account]) => b.filter(account => account.balance < 0.0)
    val totalBalance = (b:List[Account]) => b.foldLeft(0.0)((x, y) => x + y.balance)
    val interest = (b:List[Account]) => b.map(account => if(account.balance > 0) account.balance*0.05 else account.balance*0.1)


    /*              Driver Code                */
    
    //create accounts
    accCreate("Daham",4561)
    accCreate("Amali",2778)
    println("_____________________________________________\n")
    println("\n------------ Bank account details ------------\n")
    println(accountList)
    println("_____________________________________________\n")
    //deposit money
    println("\n------------ Deposit Money ------------\n")
    find(4561, accountList)(0).deposit(1000)
    println(find(4561, accountList)(0))
    println("_____________________________________________\n")

    //transfer money
    println("\n------------ Transfer Money ------------\n")
    find(4561, accountList)(0).transfer(2778, 100.0)
    println(find(2778, accountList)(0))
    println(find(4561, accountList)(0))
    println("_____________________________________________\n")

    //list of negative balances
    println("\n------------ Nagative Balance ------------\n")
    println(overdraft(accountList))
    println("_____________________________________________\n")

    //sum of all account balances
    println("\n------------ All account balance ------------\n")
    println(totalBalance(accountList))
    println("_____________________________________________\n")

    //final balances of all accounts after apply the interest
    println("\n------------ Total balance with interrest ------------\n")
    println(interest(accountList))
    println("_____________________________________________\n")
}

class Account(name:String, val accId: Int, var balance: Double = 0.0){

    def withdrow(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(account:Int, amount:Double) : Unit = {
        val transferAcc = q4.find(account, q4.accountList)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "[Name:"+name+"\tAcc num:"+accId +"\tBalance:"+ balance+"]"
}