package u02.Exercises

object NegPredicate {

  val neg: (String => Boolean) => (String => Boolean) = {
    f => s => !f(s)
  }

  def neg1[A](f: A => Boolean): A => Boolean = {
    !f(_)
  }

}
