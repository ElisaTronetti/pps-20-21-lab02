package u02.Exercises

object Fibonacci {

  def fib(n: Int) : Int = n match {
    case 0 | 1 => n
    case n if n<0 =>
      println("A negative number is not accepted")
      n
    case _ => fib(n-1) + fib(n-2)
  }
}
