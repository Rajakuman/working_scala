package com.sample

class Employee(var Name:String, var Age:Int){	
    	println("Variables set through Primary Constructor")	
    	def this(){
	    this(null,0)
            println("Variables set through Zero-Argument Auxiliary Constructor")
   	}	
}

object Employee {
def main(args: Array[String]): Unit = {
//  var e1 = new Employee("Student",25);
  var e2 = new Employee;
//println(e1.Name)
//println(e1.Age)
  e2.Name="Raja"
  e2.Age=20
println(e2.Name)
println(e2.Age)

//        var myStud = new Student
//            myStud.age = 20
//            myStud.name = "Raj"
//            println(myStud.age)
//            println(myStud.name) 
println("=====================================")
var myStud = new Student
var myStud1 = new Student("Raj",10)
  var myStud2 = new Student
  var myStud3 = new Student("Shyam")
  println(myStud1.name)
   println(myStud2.name)
    println(myStud3.name)
    println("=====================================")
}  

}

class Student(var name:String = "no name",  var age:Int = 0);
class Student1(var name:String = "no name",  var age:Int = 0){
  def this (name:String){
    this(name,0)
  }
};