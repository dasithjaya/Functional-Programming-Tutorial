object q2 extends App {
    def search(x: Int) : Int = {
        if(x < 0) {
            println("Nagative number is given");
        } else if(x == 0) {
            println("Number zero is given");
        } else if(x % 2 == 0) {
            println("Even number is given");
        } else {
            println("Odd number is given");
        }
        return 0;
    }

    println("Enter a number: ");
    var num = scala.io.StdIn.readInt();
    search(num);
}
