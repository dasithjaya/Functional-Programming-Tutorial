import scala.math._
object q1 extends App {
	def func(a: Int) : Double = {
		var ans = Pi*a*a;
		return ans;
	}

	var b = func(5);
	println(s"Area = ${b}");
}