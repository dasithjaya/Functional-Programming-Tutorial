object q2 extends App {
    def convert(t: Int) : Double = {
        return (t * 1.8) + 32;
    }

    var ans = convert(35);
    println(s"Temprature in Fahrenheit = ${ans}");
}