import org.scalatest._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import lifted._

/*
@RunWith(classOf[JUnitRunner])
class ScalaSpec extends FlatSpec with ShouldMatchers {

  "A shallow embedding of la" should "produce values" in {
    val y = 1
    /*val x: Int = liftDebug {
      val x = y
      val z = 1 + x
      val k = z + 1
      k
    }
    println(x)
    x should equal(2)*/
  }

}*/


@RunWith(classOf[JUnitRunner])
class OptiMLSpec1 extends FlatSpec with ShouldMatchers {

  "A shallow embedding of la" should "produce values" in {
    val x = new lifted.OptiML {

      def main() = ???
    }
    x
  }

}

@RunWith(classOf[JUnitRunner])
class OptiMLSpec extends FlatSpec with ShouldMatchers {

  "A shallow embedding of la" should "produce values" in {
    val y = 1
    val x: Int = optiML {
      val x = y
      val z = 1 + x
      val k = z + 1
      k
    }
    println(x)
    x should equal(2)
  }

}