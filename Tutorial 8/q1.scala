case class Point(var x: Int, var y: Int) {
    def add(a:Point) = new Point(this.x + a.x, this.y + a.y)

    def move(x:Int, y:Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }

    def distance(a:Point) : Double = {
        var xDist:Int = this.x - a.x
        var yDist:Int = this.y - a.y
        var dist: Int = xDist*xDist + yDist*yDist
        scala.math.sqrt(dist)
    }

    def invert() :Unit = {
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }

    override def toString() = "( " + x + " , " + y + " )"

}

object Point extends App {

    var a = Point(1,2)
    var b = Point(4,10)
    
    println("\n( " + a.x + " , " + a.y + " )" + " + " + "( " + b.x + " , " + b.y + " )" + " = " + a.add(b))

    a.move(x = 2, y = 4)
    println("\nAfter move = " + a)
    
    var c = a.distance(b)
    println("\nDistance =" + c)

    a.invert()
    println("\nAfter invert = " + a)
}