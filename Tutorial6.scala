object caeser_cipher extends App{

    val Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
    def encrpyt (c:Char,key:Int,a:String):Char={
        a((a.indexOf(c.toUpper)+key)%a.size)
    }
  
    def decrypt(c:Char,key:Int,a:String):Char={
        val shiftval=(a.indexOf(c.toUpper)-key)%a.size
        if(shiftval<0){
          a(a.size+(shiftval))
        }
        else{
          a(shiftval)
        }
    }
   
    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
    val result=ciphe(encrpyt ,"DASITH",3,Alphabet)
    println(cipher(decrypt,result,2,Alphabet))
    println(result)

}
