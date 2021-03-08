package u02.ExercicesTest

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.Exercises.Currying.{p1, p2, p3, p4}

class CurryingTest {

  @Test def testValPredicateWithoutCurrying(){
    assertTrue(p1(1,2,3))
    assertFalse(p1(3,2,1))
  }

  @Test def testValPredicateWithCurrying(){
    val twoValues: Int => Boolean = p2(1)(2)
    assertTrue(twoValues(3))
    assertFalse(twoValues(1))
  }

  @Test def testDefPredicateWithoutCurrying(){
    assertTrue(p3(1,2,3))
    assertFalse(p3(3,2,1))
  }

  @Test def testDefPredicateWithCurrying(){
    val twoValues: Int => Boolean = p4(1)(2)
    assertTrue(twoValues(3))
    assertFalse(twoValues(1))
  }
}
