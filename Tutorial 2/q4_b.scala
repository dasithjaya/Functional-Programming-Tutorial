import scala.io.StdIn.readInt;

object q4 extends App {
	//TP = Ticket Price
	//AC = Attendence Count
def Profit(TP: Int, AC: Int) : Int = TP*AC;


def Attendence_change(TP: Int) : Int = {
	if(TP > 15){
		return ((TP - 15) / 5) * (-20);
	} else if(TP < 15) {
		return ((15 - TP) / 5) * 20;
	} else{
		return 0;
	}
}

def Full_Profit(TP: Int, AC: Int) : Int = {
	var val1 = AC + Attendence_change(TP);
	return Profit(TP, val1) - (500 + 3*val1);
}

println("Input ticket price:");
var TP = readInt();
print("Profit : " + Full_Profit(TP, 120));
}