object q4 extends App {
    def func(a: Int) : Double = {
        var b_price = 24.95 - (24.95 * 0.4);
        var shipping_cost: Double = 0;
        if(a <= 50)
        {
            shipping_cost = 3 * a;
        }
        else
        {
            shipping_cost = 150 + (a - 50) * 0.75;
        }
        return (b_price * a) + shipping_cost;
    }

    var Cost = func(60);
    println(s"Total wholesale cost = ${Cost}");
}