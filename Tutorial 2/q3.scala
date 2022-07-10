object q3 extends App {
	var a = 2;
	var b = 3;
	var c = 4;
	var d = 5;
	var k = 4.3f;
	var g = 4.0f;

	//println( - -b * a + c *d - -);
	//println(a++);
	println (-2 * ( g - k ) +c);
	//println (c=c++);
	//println (c=++c*a++);

	//We can not use increment operator (++) or decrement operator (--) in scala.
	//But we can modify that variable same as variable that after increment and decrement
	
	b = b - 1;
	d = d - 1;
	println(b * a + c *d);

	a = a + 1;
	println(a);

	c = c + 1;
	println (c);

	c = c + 1;
	a = a + 1;
	println (c * a);
}