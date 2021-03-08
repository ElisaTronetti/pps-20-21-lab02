package u02.Exercises

object Currying {

  //not using currying
  val p1: (Int, Int, Int) => Boolean = {
    (x,y,z) => x <= y && y <= z
  }

  //using currying
  val p2: Int => Int => Int => Boolean = {
    x => y => z => x <= y && y <= z
  }

  //not using currying
  def p3(x:Int, y:Int, z:Int): Boolean = {
    x <= y && y<=z
  }

  //using currying
  def p4(x:Int)(y:Int)(z:Int): Boolean = {
    x <= y && y<=z
  }

}
