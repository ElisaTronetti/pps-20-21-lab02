package u02.ExercicesTest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Exercises.ShapeSumType.{Circle, Rectangle, Square, area, perimeter}

class ShapeSumTypeTest {

  @Test def testRectanglePerimeter(){
    assertEquals(10, perimeter(Rectangle(2,3)))
    assertEquals(4, perimeter(Rectangle(1,1)))
  }

  @Test def testCirclePerimeter(){
    assertEquals(12.56, perimeter(Circle(2)))
    assertEquals(25.12, perimeter(Circle(4)))
  }

  @Test def testSquarePerimeter(){
    assertEquals(8, perimeter(Square(2)))
    assertEquals(12, perimeter(Square(3)))
  }

  @Test def testRectangleArea(){
    assertEquals(6, area(Rectangle(2,3)))
    assertEquals(1, area(Rectangle(1,1)))
  }

  @Test def testCircleArea(){
    assertEquals(12.56, area(Circle(2)))
    assertEquals(50.24, area(Circle(4)))
  }

  @Test def testSquareArea(){
    assertEquals(4, area(Square(2)))
    assertEquals(9, area(Square(3)))
  }
}
