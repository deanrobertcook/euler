import Solutions._
import org.scalatest.FeatureSpec

class SolutionsTest extends FeatureSpec {

  feature("Problem 1") {
    scenario("Sum of multiples of 3 and 5 less than 10 should be 23") {
      assert(problem1(10) == 23)
    }

    scenario("Sum of multiples of 3 and 5 under 20 should be 78") {
      assert(problem1(20) == 78)
    }

    scenario("For 1000? The answer is 233168") {
      assert(problem1(1000) == 233168)
    }
  }

  feature("Problem 2") {
    scenario("Erste 10 Term") {
      assert(problem2(100) == 44)
    }

    scenario("Unter einen Fibonacci-Folge von Wert 4000000") {
      assert(problem2(4000000) == 4613732)
    }
  }



}
