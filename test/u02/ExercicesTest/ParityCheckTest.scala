package u02.ExercicesTest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Exercises.ParityCheck.{parity, parity1}

class ParityCheckTest {

  @Test def testCheckParityWithVal(){
    assertEquals("even", parity(2))
    assertEquals("odd", parity(9))
  }

  @Test def testCheckParityWithDef(){
    assertEquals("even", parity1(2))
    assertEquals("odd", parity1(9))
  }
}
