package BeginnerTut

import java.util.Date

object Basics {
  def conditionals(): Unit = {
    val x = 20;
    var res = "";

    if (x == 20) {
      res = "X is 20";
    } else {
      res = "X is not 20";
    }
    println(res)

    val res2 = if (x == 20) "x == 20" else "x != 20";
    println(res2);

    val y = 30;
    if (x == 20 && y == 30) {
      println("x == 20 and y == 30");
    }
  }

  def loops(): Unit = {
    var x = 0;
    while (x <= 10) {
      println("x=" + x);
      x += 1;
    }

    var y = 0;
    do {
      println("y=" + y);
      y += 1;
    } while (y <= 10);

    for (i <- 1 to 5) {
      println("Hello " + i)
    }

    for (i <- 1.to(5)) {
      println("Hello " + i)
    }

    for (i <- 1.until(5)) {
      println("Hello " + i)
    }

    for (i <- 1 to 5; j <- 1 to 5) {
      println("i: " + i + " j: " + j)
    }

    val lst = List(1, 2, 3, 4, 5, 6);

    for (i <- lst; if i % 2 == 0) {
      println(i)
    }

    val results = for {i <- lst; if i % 2 == 0} yield {
      i * i;
    }

    println(results)
  }

  def match_expressions(): Unit = {
    val age = 18;
    age match {
      case 20 => println("Age is " + age);
      case 30 => println("Age is " + age);
      case _ => println("Default case");
    }

    val result = age match {
      case 20 | 20 => age;
      case _ => 1;
    }

    println(result);
  }

  object Strings {
    val name: String = "Mohamed";
    val age: Int = 22;
    val details: String = name + " is " + age + " years old";
  }

  def main(args: Array[String]): Unit = {
    //conditionals();

    //loops();

    match_expressions();

    //println(Strings.details);
    //println("%s is %d years old".format(Strings.name, Strings.age));
  }
}
