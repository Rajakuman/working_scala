package com.sample


class User(private var name:String, var age:Int){
  def printName{println("Name:"+name)};
};

object ScalaConst {
def main(args: Array[String]): Unit = {
var user=new User("Raja",25);
user.printName;
//println("user.name:"+user.name)
println("user.age:"+user.age)
}  
}

