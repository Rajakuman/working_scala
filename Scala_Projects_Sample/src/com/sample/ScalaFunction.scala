package com.sample

object ScalaFunction {
  val mymap: Map[Int,String]= Map(801->"Min",802->"Max",803->"May",804->"June",805->"July");
  val mymap2: Map[Int,String]= Map(901->"Min",902->"Max",903->"May",904->"June",905->"July");
  def main(args: Array[String]): Unit = {
     testTuple();
  }
  
  def testTuple(){
      val myTuple1 = (1,2, true,"True");
      val myTuple2 = new Tuple10(11,12,13,14,15,16,71,18,19,110)
      val myTuple3 = new Tuple3(1,"hello",(2,3))
      val myTuple4 = new Tuple3(1,2, true);
      
      println("=============================================")
      println("All Tuple details")
      println("myTuple1:"+myTuple1)
      println("myTuple2:"+myTuple2)
      println("myTuple3:"+myTuple3)
      println("myTuple4:"+myTuple4)
      println("=============================================")
      println("Tuple one details")
      println("myTuple1._1:"+myTuple1._1)
      println("myTuple1._2:"+myTuple1._2)
      println("myTuple1._3:"+myTuple1._3)
      println("myTuple1._4:"+myTuple1._4)
      println("=============================================")
      println("Tuple two using foreach details")
    myTuple2.productIterator.foreach {
        i=>println(i)
      }
      println("=============================================")
      println(1 -> "Tom" -> true);
      println("=============================================")
      println("Tuple three ")
      println("myTuple3 	\t:"+myTuple3)
      println("myTuple3._3	\t:"+myTuple3._3)
      println("myTuple3._3._1	\t:"+myTuple3._3._1)
      println("myTuple3._3._2	\t:"+myTuple3._3._2)
      
      println("=============================================")
      println("=============================================")
      
  }
  
  def testMap(){
    println(mymap);
    println(mymap(802));
    println(mymap.keys);
    println(mymap.values);
    println(mymap.isEmpty);
    
      println("-------------------------------------------------")
    mymap.keys.foreach {key=>
      println("key    ==>"+key);
      println("values ==>"+mymap(key));
      println("-------------------------------------------------")
    }
      println(mymap.contains(805));
      println(mymap ++ mymap2);
      println(mymap.size+"   "+ mymap2.size);
      var myMap = Map(1->"Sid", 2->"Praveen", 3->"Sandy")
      myMap += (4 -> "Sylvia")
     println(myMap)
     }
  
}