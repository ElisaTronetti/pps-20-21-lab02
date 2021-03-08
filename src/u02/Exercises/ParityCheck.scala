package u02.Exercises

object ParityCheck {

  val parity: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  def parity1(n: Int): String = n match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

}
