object q4_a extends App {
	def sal(a: Int, b: Int) : Double = {
		var full_sal = 250*a + 85*b;
		var home_sal = full_sal - full_sal*0.12;
		return home_sal;
	} 

	var ans = sal(45, 8);
	println(ans);
}