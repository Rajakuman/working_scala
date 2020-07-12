package com.sample

object PracticeHigherOrderFunctions {
val str1:String ="Hello World"
val x:String ="10"
  val myList : Set[Int] = Set(1,2,3,4,5,6,4,5,1,4,7)
  val myset1 : Set[Int] = Set(10,25,3,94,65,23,33,66,4,4,8,956,1,2)
  val names : Set[String] = Set("Max","Min","Sub","Raj")
val mySet : scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1,2,3,4,5,6,4,5,1,4,7)

def main(args:Array[String]){
  val set1 = Set(1,2,3,4,5,6,7,8)
println(false || set1(0))

//    sampleSets();
    println("------------------------------------------")
//    print(sampleList())
    sampleList();
    
//val sampleList:List[String] = List("Hi", "Bye")
//sampleList(1) = "Hello"

//val sampleList3:List[String] = List("Hi", "Bye")
//val sampleList2 = 1 :: 2 :: 3 :: Nil;
}

def sampleSets(){
  val myArray = new Array[Int](4)
myArray(2) = 3
myArray.foreach(println)
  
  println(myList)
  println(mySet)
  mySet.add(12)
  println(mySet)
  println(mySet ++ myset1)
  println(mySet.&(myset1))
  println(mySet.intersect(myset1))
  
}

  def sampleList(){
//  myList(2)=25
//  println(0::myList)
  println(myList)
  println(names)
  println(1::5::9::Nil)
  println(myList.head)
  println(names.head)
  println(myList.tail)
  println(names.tail)
  println(myList.isEmpty)
//  println(names.reverse.tail)
  println(List.fill(5)((2),(4),(5)))
  myList.foreach(println)
  
  var sum: Int=1
  myList.foreach(sum+=_)
  println(sum)
  
  for(my<-names ){
    println(my)
  }
  for(my<-myList ){
    println(my)
  }
}
def sample(){
  var myArray:Array[Int] = new Array[Int](10)
  var myArray1 = new Array[Int](10)
    myArray(0) = 10
    myArray(1) = 20
    myArray(2) = 30
    myArray(3) = 40
    myArray(4) = 50
    myArray(5) = 60
    myArray(6) = 70
    myArray(7) = 80
    myArray(8) = 90
    
    for (i <- myArray1)
      println(i)
     
      println("=============================================")
      
    for (i <- 0 to (myArray.length-1))
      println(myArray(i))

}
def testSample(){
    
    println("%d, %s, %f",5,"hi",5.28885555 )
    println(str1.length())
    println(str1.concat(" "+ x))
    println(str1+" "+x)
//    println("hi"||false)
println(s"The value of x is "+x)

    
    println(computeArea(6,6, _*_/2))
    println(computeArea(6,6, (x,y)=>x*y/2))
//    println(computeArea(5, (x,y)=>(x*y)/2))
    println(computeArea(b=6, f=(x,y)=>x*y/2))
//    var myMathFunc = decideOperation("Add")
//    println(myMathFunc(5,10))
//    myMathFunc = decideOperation("Sub")
//    println(myMathFunc(5,10))
//    myMathFunc = decideOperation("Mul")
//    println(myMathFunc(5,10))  

}
  
  def myAdd(x:Int, y:Int) = x+y
  def mySub(x:Int, y:Int) = x-y
  def myMul(x:Int, y:Int) = x*y

  def myMath(x:Int, y:Int, f:(Int, Int) => Int) = f(x,y) 
  def decideOperation(z:String):(Int,Int) => Int = {
    if (z.equals("Add"))
      return myAdd
    else if(z.equals("Sub"))  
      return mySub
    else (z.equals("Mul"))  
      return myMul
  }
  
  def computeArea(l:Int=5, b:Int, f:(Int, Int) => Int) = f(l,b)

}