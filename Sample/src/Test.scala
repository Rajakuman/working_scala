

object Test {
  object MyOp{
        def -+(m:Int):Int = {
        m+1;
     }
      def +-(m:Int):Int = {
         m+1
        return m
     }
      


//      def incrBy1(m:Int):Int = {
//        -+m
//        return m
//     }
      
      def ++(m:Int):Int = {
     	m+1
     	}
}
//  def myAdd(a:Int = 20, b:Int, c:Int = 40):Int = a+b+c
def myAdd(a:Int, b:Int=20, c:Int = 40):Int = a+b+c

  def main(args: Array[String]) {
//    println(MyOp.++(15));
    print(myAdd(30))
    
//    println(Math.+(15,25));
//    println(Math **12);
//    println(add(10,20));
//    println(square(25));
//    println(sub(50,20));
//    println(mul(8,54));
//    println(div(25,8));
  }

  def fun(){
        var x = 20;
    var res = "";
    if (x == 20) {
      res = "x == 20";
    } else {
      res = "x != 20";
    }
    println(res);
    x = 21;
    
//    var myList  =  for {i <- myList; i < 6} yield {
//			 i * 2
//    }
    
    
    var res2 = if (x == 20) "X ==20 " else "X != 20";
    println(res2);
  
  for (i <- 0 until 10; j <- 5 to 10; if (i+j)%2 == 0){
     println("i is "+ i + " and j is "+j)
   }
  }
  def add(x: Int,y: Int): Int = {
    return x+y;
  }

  def sub(x: Int,y: Int): Int = {
    x-y;
  }
  def square(x: Int): Int = x * x;
  def mul(x: Int,y: Int): Int = x*y;

  def div(x: Int,y: Int): Int =  x/y;
  
  object Math{
  def +(x: Int,y: Int): Int = {
    return x+y;
  }
  def **(x: Int): Int = x*x;
  def add(a:Int, b:Int):Int = {
	return a+b;
  }
  }
  
}