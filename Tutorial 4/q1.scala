object q1 extends App {
    def count_interest(a: Int) : Double = {
        var amount: Double = 0;
        if(a <= 20000) {
            amount = a * 0.02;
        } else if(a <= 200000) {
            amount = a * 0.04;
        } else if(a <= 2000000) {
            amount = a * 0.035;
        } else {
            amount = a * 0.065;
        }
        return amount;
    }
    println("Enter deposit price: ");
    var num = scala.io.StdIn.readInt();
    var ans = count_interest(num);
    println("Amount of interest = " + f"$ans%1.2f");
}