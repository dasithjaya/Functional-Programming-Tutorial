object q3 extends App {
    var accountList:List[Account] = List()

    def accCreate(name:String, accId: Int):Unit = {
        val acc = new Account(name, accId)
        accountList = accountList ::: acc :: Nil
    }

    val find = (a:Int, b:List[Account]) => b.filter(account => account.accId.equals(a))

    /*              Driver Code                */
    
    accCreate("Nimal",1245)
    accCreate("Supun",3785)
    println("_____________________________________________\n")
    println("\n------------ Bank account details ------------\n")
    println(accountList)
    println("_____________________________________________\n")
    //deposit money
    find(1245, accountList)(0).deposit(1000)
    println("\n------------ Deposit Money ------------\n")
    println(find(1245, accountList)(0))
    println("_____________________________________________\n")

    //transfer money
    find(1245, accountList)(0).transfer(3785, 100.0)
    println("\n------------ Transfer Money ------------\n")
    println(find(3785, accountList)(0))
    println(find(1245, accountList)(0))
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
        val transferAcc = q3.find(account, q3.accountList)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "[Name:"+name+"\tAcc num:"+accId +"\tBalance:"+ balance+"]"
}