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

  val p = new Person("Julia", "Kern")
  println(p.firstName)
  p.lastName = "Manes"
  p.printFullName()
  p.welcome()
  val sumRes = p.sumNum(10, 20)
  println(sumRes)

  var (id, name, age) = p.getUserInfo();
  println("User details:" + id+ " "+ name)

  val adder = new Calculator()
  val addeRes = adder.add(10, 100)
  val subRes = adder.sub(20, 3)
  println(addeRes)
  println(subRes)
  val arr = List.range(1, 10)
  println(arr)
  val arr1 = (1 to 10).toList
  println(arr1)
  val arr2 = (1 to 11 by 2).toList
  println(arr2)
  val letter = ('a' to 'z' by 2).toList
  println(letter)

  val nums = (1 to 10).toList
  nums.foreach(println)

  val strs = List("and", "bhavan", "shraavan", "Thala")
  strs.foreach(println)

  val numsFil = nums.filter(_ > 2)
  println(numsFil)

  val numMap = nums.map(_ * 2)
  println(numMap)

  strs.map(_.capitalize).foreach(println)

  val sumOfNums = nums.foldLeft(0)(_ + _)
  println(sumOfNums)

  val mulOfNums = nums.foldLeft(1)(_ * _)
  println(mulOfNums)

  val userDetailsV1 = new UserDetails(1,"Hello ", 27)
  println(userDetailsV1.name)
}
