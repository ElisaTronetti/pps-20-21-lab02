package u02.Exercises

object ShapeSumType {
  sealed trait Shape
  case class Rectangle(l1: Double, l2: Double) extends Shape
  case class Circle(r: Double) extends Shape
  case class Square(l1: Double) extends Shape

  var pi: Double = 3.14

  def perimeter(shape: Shape): Double = shape match {
    case Rectangle(l1, l2) => (l1+l2)*2
    case Circle(r) => (2*pi)*r
    case Square(l1) => l1*4
  }

  def area(shape: Shape): Double = shape match {
    case Rectangle(l1,l2) => l1*l2
    case Circle(r) => (r*r)*pi
    case Square(l1) => l1*l1
  }
}
