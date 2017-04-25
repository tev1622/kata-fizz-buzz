/**
  * Created by tevyn on 05/10/16.
  */

import java.lang.NullPointerException

import KataFizzBuzz._
import org.scalatest._


class KataFizzBuzzSpec extends FlatSpec with Matchers {

  "Given a number in a list which is not a multiple of 3 or 5" should "return a the number" in {
    val list = List(7)
    FizzBuzz(list).equals(7)
  }

  "When searching for an integer that is a multiple of 3" should "return a string called Fizz" in {
      multipleOfThree(3) shouldBe print("Fizz")
    }
  "When searching for an integer that is a multiple of 3" should "return the number called" in {
      multipleOfThree(4) shouldBe print(4)
    }
  "When searching for an integer that is a multiple of 5" should "return a string called Buzz" in {
      multipleOfFive(5) shouldBe print("Buzz")
    }
  "When searching for an integer that is a multiple of 5" should "return the number called" in {
      multipleOfFive(8) shouldBe print(8)
    }
}