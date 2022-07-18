import scala.math._

object q3 extends App {
    def volume(r : Int) : Double = {
        return (4 * Pi * r * r * r)/3;
    }

    var ans = volume(5);
    println(s"Volume of sphere = ${ans}");
}