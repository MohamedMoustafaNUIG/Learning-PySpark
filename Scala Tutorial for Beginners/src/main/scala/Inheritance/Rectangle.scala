package Inheritance

class Rectangle(width: Double, height: Double) extends Polygon with Shape {
  override def area : Double = width * height;
  def color : String = "red";
}
