package u02.ExercicesTest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OptionalsExtensionTest {

  import u02.Exercises.OptionalsExtension._
  import u02.Exercises.OptionalsExtension.Option._

  @Test def testFilterWithInt(){
    val s1: Option[Int] = Some(1)
    assertEquals(s1, filter[Int](s1)(_>0))
    assertEquals(None(), filter[Int](s1)(_>10))
    assertEquals(None(), filter[Int](None())(_==1))
  }

  @Test def testFilterWithString(){
    val s1: Option[String] = Some("test")
    assertEquals(s1, filter[String](s1)(_=="test"))
    assertEquals(None(), filter[String](s1)(_=="scala"))
    assertEquals(None(), filter[String](None())(_=="scala"))
  }

  @Test def testMap(){
    val s1: Option[Int] = Some(3)
    assertEquals(Some(4), map[Int,Int](s1)(_+1))
    assertEquals(Some(true), map[Int,Boolean](s1)(_==3))
    assertEquals(None(), map[Int,Int](None())(_-1))
  }

  @Test def testMap2(): Unit ={
    val s1: Option[Int] = Some(3)
    val s2: Option[Int] = Some(2)
    assertEquals(Some(5), map2[Int,Int,Int](s1,s2)(_+_))
    assertEquals(Some(true), map2[Int,Int,Boolean](s1,s2)(_==3 & _==2))
    assertEquals(None(), map2[Int,Int,Int](None(),s2)(_-_))
    assertEquals(None(), map2[Int,Int,Int](s1,None())(_-_))
  }

}
