
package com.sample

object SampleTestClass {
  def math(x:Double,y:Double,f:(Double,Double)=>Double): Double =f(x,y);
  def math(x:Double,y:Double,z:Double,f:(Double,Double)=>Double): Double =f(f(x,y),z);
def main(args: Array[String]){
  val result=math(70,20,_+_);
  println(result);
  val result1=math(70,20,25,_*_);
  println(result1);
    println(myMath(5,10,myAdd))
    println(myMath(5,10,mySub))
    println(myMath(5,10,myMul))    

}


  def myAdd(x:Int, y:Int) = x+y
  def mySub(x:Int, y:Int) = x-y
  def myMul(x:Int, y:Int) = x*y

  def myMath(x:Int, y:Int, f:(Int, Int) => Int) = f(x,y) 
  
 
}