package u02.ExercicesTest

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.Exercises.NegPredicate.{neg, neg1}

class NegPredicateTest {

  val emptyString: String => Boolean = _ == ""
  val emptyInteger: Int => Boolean = _ == 0

  @Test def testValNegString(){
    val notEmpty = neg(emptyString)
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo"))
  }

  @Test def testDefNegString(){
    val notEmpty1 = neg1(emptyString)
    assertFalse(notEmpty1(""))
    assertTrue(notEmpty1("foo"))
  }

  @Test def testDefNegInteger(){
    val notEmpty1 = neg1(emptyInteger)
    assertFalse(notEmpty1(0))
    assertTrue(notEmpty1(1))
  }

}
