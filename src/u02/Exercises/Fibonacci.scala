package u02.Exercises

object Fibonacci {

  //basic version
  def fib(n: Int) : Int = n match {
    case 0 | 1 => n
    case n if n<0 =>
      println("A negative number is not accepted")
      n
    case _ => fib(n-1) + fib(n-2)
  }

  //tail recursion version
  def fib1(n: Int) : Int = {
    @annotation.tailrec
    def _fib(n:Int, acc1: Int, acc2: Int): Int = n match{
      case 0 => acc1
      case 1 => acc2
      case n if n<0 =>
        println("A negative number is not accepted")
        n
      case _ => _fib(n-1, acc2, acc1+acc2)
    }
    _fib(n, 0, 1)
  }
}
