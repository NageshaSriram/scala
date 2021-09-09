package org.learnscala.application

object HelloWorld extends App {
  println("Hello world, I am coming soon to conquere you..!!")
  println("It's secode commit..!")
  val x = 1
  print(x)
  if(x==1){
    println("Hello da")
  } else if(x==2){
    println("Bye da")
  } else {
    println("Nothing da")
  }

  val msg = if(x==2) "I am the wonderfull" else "I am the hero"
  println(msg)

  val res = x match {
    case 1 => "Go"
    case 2 => "Come"
    case _ => "Nothing"
  }
  println(res)

  def findType(x: Any):String = x match {
    case i: Int => "Int"
    case s: String => "String"
    case _ => "Unknown"
  }
  val typeVal = findType(10)
  println(typeVal)

  def testException(i: Int): String = {
    try {
      val x = 10 / i;
      return " The value is correct";
    } catch {
      case e: Exception => "Exception"
    }
  }

  println(testException(1))

  for(i <- 0 to 10 by 2) print(i+ " ")
println()
  val sum = for(i <- 1 to 10) yield i + 1
  println(sum)

  val fruits = List("Apple", "Banana", "Orange", "cow")
  for(fruit <- fruits if fruit.length > 4) println(fruit)

  var loopVal = 10
  while(loopVal > 0) {
    println(loopVal)
    loopVal = loopVal - 1
  }
  var doVal = 0
  println(doVal)
  doVal = doVal + 1
  while (doVal < 10) {
    println(doVal)
    doVal = doVal + 1
  }
}
