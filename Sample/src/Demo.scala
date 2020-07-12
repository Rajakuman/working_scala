

class Demo {
  def math(x:Double,y:Double,z:Double,f: (Double,Double)=>Double):Double=f(f(x,y),z);
//   ds
  def main(args: Array[String])  {
    val result =math(11,55,15,(x,y)=>x * y);
//    println(result);
//    println(result);
//    println(result);
//  
    }

  def computeArea(l:Int=5, b:Int, f:(Int, Int) => Int) = f(l,b)

}