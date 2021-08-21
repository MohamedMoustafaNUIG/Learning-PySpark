package Inheritance

class Triangle (width: Double, height: Double) extends Polygon with Shape {
  override def area : Double = width * height * 0.5;
  def color : String = "green";
}
