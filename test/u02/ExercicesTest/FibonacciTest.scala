package u02.ExercicesTest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Exercises.Fibonacci.{fib, fib1}

class FibonacciTest {

  @Test def testFibonacci() {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(8, fib(6))
    assertEquals(34, fib(9))
  }

  @Test def testNegativeFibonacci() {
    assertEquals(-2, fib(-2))
  }

  @Test def testFibonacciTailRecursion() {
    assertEquals(0, fib1(0))
    assertEquals(1, fib1(1))
    assertEquals(8, fib1(6))
    assertEquals(34, fib1(9))
  }

  @Test def testNegativeFibonacciTailRecursion() {
    assertEquals(-2, fib1(-2))
  }

}
