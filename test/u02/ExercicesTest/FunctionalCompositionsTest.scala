package u02.ExercicesTest

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.Exercises.FunctionalCompositions.compose

class FunctionalCompositionsTest {

  @Test def composeFunction(){
    assertEquals(9, compose[Int, Int, Int](_-1, _*2)(5))
    assertTrue(compose[Int,Int,Boolean](_==10,_ *2)(5))
    assertFalse(compose[String, String, Boolean]( _ == "hello, scala" , _ concat ", scala!")("hello"))
  }
}
