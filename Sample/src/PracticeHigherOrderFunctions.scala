

class PracticeHigherOrderFunctions {
  def math(x:Double,y:Double,z:Double,f: (Double,Double)=>Double):Double=f(f(x,y),z);
  
  def main(args: Array[String])  {
    val result =math(10,20,10,(x,y)=>x * y)
    println(result)
    println(result)
    println(result)
  }
}