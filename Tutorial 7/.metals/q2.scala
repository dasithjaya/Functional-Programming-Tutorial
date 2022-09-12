object q2 extends App {
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
  
    val a = x-y-z
    
    println("Answer = " + a)
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d
    def neg = new Rational(-this.numer, this.denom) //To get the negativr value of the rational number
    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom) //Addition between two rational numbers
    def -(r:Rational) = this.add(r.neg) //-a/b = + (-a/b)

    override def toString(): String = numer + "/" + denom
}