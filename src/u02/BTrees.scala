package u02

object BTrees extends App {

  // A custom and generic binary tree of elements of type A
  sealed trait Tree[A]
  object Tree {
    case class Leaf[A](value: A) extends Tree[A]
    case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

    //br is the function that is going to handle the branch
    //le is the function that is going to handle the leaf
    def transform[A,B](t: Tree[A], br: (B,B)=>B, le: A=>B): B = t match {
      case Branch(l,r) => br(transform(l,br,le), transform(r,br,le))
      case Leaf(e) => le(e)
    }

    def size[A](t: Tree[A]): Int =
      transform[A,Int](t, _+_, _=> 1)

    def find[A](t: Tree[A], elem: A): Boolean =
      transform[A,Boolean](t, _||_, _==elem)

    def count[A](t: Tree[A], elem: A): Int =
      transform[A,Int](t, _+_,{
        case a if a == elem => 1
        case _ => 0
      })
  }

  import Tree._
  val tree = Branch(Branch(Leaf(1),Leaf(2)),Leaf(1))
  println(tree, size(tree)) // ..,3
  println( find(tree, 1)) // true
  println( find(tree, 4)) // false
  println( count(tree, 1)) // 2
}
