object q3 extends App {
    def toUpper(txt: String) : String = {
        txt.toUpperCase();
    }

    def toLower(txt: String): String = {
        txt.toLowerCase();
    }

    def formatNames(name: String)(change_id: Int*)(function: String => String): String = {
        if(change_id.isEmpty) {
            return function(name)
        }

        var tmp = "";
        var i = 0;
        var len = name.length();
        val range = 0 until len;
        for(i <- range) {
            if(change_id.contains(i)) {
                tmp = tmp + function(name.charAt(i).toString)
            } else {
                tmp = tmp + name.charAt(i).toString
            }
        }
        tmp
    }

    println(formatNames("Benny")()(toUpper));
    println(formatNames("Niroshan")(0,1)(toUpper));
    println(formatNames("Saman")()(toLower));
    println(formatNames("Kumara")(5)(toUpper));
}