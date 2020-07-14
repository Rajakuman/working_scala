package com.poly.inheritance

abstract class Polygon {
 def area : Double =0.0;
} 

trait Shape{
  def color : String ;
}

object Polygon{
  def main(args: Array[String]): Unit = {
//    var poly = new Polygon;
    var rect = new Retangle(20.2,32.3);
    var tri = new Triangle(20.2,32.3);
    printArea(rect)
    println(rect.color)
    printArea(tri)
    println(tri.color)
  }
  
  def printArea(p:Polygon){
    println(p.area)
  }
}