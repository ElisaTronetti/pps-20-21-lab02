package u02.Exercises

object OptionalsExtension {

  sealed trait Option[A] // An Optional data type
  object Option {
    case class None[A]() extends Option[A]
    case class Some[A](a: A) extends Option[A]

    def isEmpty[A](opt: Option[A]): Boolean = opt match {
      case None() => true
      case _ => false
    }

    def getOrElse[A, B >: A](opt: Option[A], orElse: B): B = opt match {
      case Some(a) => a
      case _ => orElse
    }

    def flatMap[A,B](opt: Option[A])(f:A => Option[B]): Option[B] = opt match {
      case Some(a) => f(a)
      case _ => None()
    }

    //return the option only if it respects the predicate
    def filter[A](opt: Option[A])(predicate: A => Boolean): Option[A] = opt match {
      case Some(a) if predicate(a) => opt
      case _ => None()
    }

    //return a new optional transformed by the function f
    def map[A,B](opt: Option[A])(f: A => B): Option[B] = opt match {
      case Some(a) => Some(f(a))
      case _ => None()
    }

    //return the combination made by f taking in input two optionals
    def map2[A,B,C](opt1: Option[A], opt2: Option[B])(f: (A, B) => C) : Option[C] = (opt1, opt2)match {
      case (Some(a), Some(b)) => Some(f(a,b))
      case _ => None()
    }

  }

}
