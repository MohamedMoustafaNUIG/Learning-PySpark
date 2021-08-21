package Inheritance

trait Shape {
  def color: String;
}
abstract class Polygon {
  def area : Double;
}

object Polygon{
  def main(args: Array[String]): Unit ={
    var rect = new Rectangle(55.2, 28.0);
    var tri = new Triangle(55.2, 28.0);

    printArea(tri);
    println(tri.color);
  }

  def printArea(p: Polygon): Unit ={
    println(p.area);
  }
}
