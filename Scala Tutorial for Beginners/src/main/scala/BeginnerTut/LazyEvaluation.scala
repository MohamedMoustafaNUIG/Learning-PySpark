package BeginnerTut

class Strict{
  val e = {
    println("Strict");
    9
  }
}

class LazyEval{
  lazy val l = {
    println("Lazy");
    9
  }
}

object LazyEvaluation {
  def method1(n: Int): Unit ={
    println("Method1");
    println(n);
  }

  def method2(n: => Int): Unit ={
    println("Method2");
    println(n);
  }

  def main(args: Array[String]): Unit ={
    /*
    val x = new Strict;
    val y = new LazyEval;

    println(x.e);
    println(y.l);
    */

    val add = (a: Int, b: Int) => {
      println("Add");
      a + b;
    }

    method1(add(5,6));
    method2(add(5,6));
  }
}
