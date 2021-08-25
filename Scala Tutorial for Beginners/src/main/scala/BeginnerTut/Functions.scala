package BeginnerTut

import java.util.Date

object Functions {
  object Math {
    def addition_func(x: Int, y: Int): Int = {
      return x + y;
    };

    def subtract_func(x: Int, y: Int): Int = {
      x - y
    };

    def multiply_func(x: Int, y: Int): Int = x * y;

    def divide_func(x: Int = 10, y: Int = 15) = x / y;

    def **(x: Int = 1) = x * x;
  }

  object Func {
    def print(x: Int, y: Int): Unit = {
      println(x + y);
    }

    var add = (x: Int, y: Int) => x + y;
    var addD = (x: Double, y: Double) => x + y;
    var addDThree = (x: Double, y: Double, z: Double) => x + y + z;

    def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y);

    def math_three(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z);

    def int_to_string(option: Option[Int]): Option[String] =
      option match{
        case Some(n) => Some((n).toString);
        case None => Some("Sorry didn't work");
      }
  }

  //Partially Applied Functions
  object PAF {
    //example 1
    val paf = Func.math_three(0, _: Double, _: Double, (x, y) => x + y);
    val f = paf(100, 200);

    //example 2
    def log(date: Date, message: String): Unit = {
      println(date + "\t" + message);
    }

    val date = new Date();
    val new_log = log(date, _: String);
  }

  //Closures
  object Closures {
    var number = 10;
    val add = (x: Int) => x + number;
    //impure closure=external variable is mutable; pure closure=external variable is immutable
  }

  //Currying: process of converting multi-input function into single input function
  object Currying {
    def add(x: Int, y: Int) = x + y;

    def add2(x: Int) = (y: Int) => x + y;

    def add3(x: Int)(y: Int) = x + y;
  }

  def main(args: Array[String]): Unit ={
    /*
    println(Math.multiply_func(1,2));
    println(Math square 2);
    println(Math.square());
    println(Math.divide_func(60));
    Func.print(100, 200);
    println(Math ** 10);
    println(Func.add(200,200));
    */

    /*
    println(Func.math(200.20, 300.30, Func.addD));
    println(Func.math(200, 300, (x,y)=>x*y));
    println(Func.math(200, 300, (x,y)=>x min y));
    println(Func.math_three(200, 300, 400, _ max _) );
    println(Func.math_three(20, 30, _: Double, (x,y)=>x+y));
    */

    val op1: Option[Int] = Some(20);
    val op2: Option[Int] = None;

    println(Func.int_to_string(op1));
    println(Func.int_to_string(op2));

    //println(PAF.f)
    //println(PAF.new_log("Error: Meltdown"));

    //println(Closures.add(20));

    /*
    println(Currying.add2(20)(10));
    var sum40 = Currying.add2(40);
    println(sum40(20));
    var sum50 = Currying.add3(50)_;
    println(sum50(20));
    */
  }
}
