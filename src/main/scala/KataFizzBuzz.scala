/**
  * Created by tevyn on 05/10/16.
  */
object KataFizzBuzz {
  implicit val fizz = "Fizz"
  implicit val buzz = "Buzz"

  def FizzBuzz(numberList: List[Int]): Any = {
    if (numberList.nonEmpty)
    multipleOfThree(numberList.head) match {
      case i: String => FizzBuzz(numberList.tail)
      case _ => FizzBuzz(numberList.tail)
    }
  }

  def multipleOfThree(number: Int): Any = number % 3 match {
    case i if i.equals(0) => print(fizz)
    case _ => multipleOfFive(number)
  }

  def multipleOfFive(number: Int): Any = number % 5 match {
    case n if n.equals(0) => print(buzz)
    case _ => print(number)
  }

val h = List(0, 1, 1, 2, 3, 5)

  def fib(n:Int):Int = {
    def st(n: Int, prev: Int, cur: Int): Int = n match {
      case 0 => prev
      case _ => st(n - 1, cur, prev + cur)
    }
    st(n, 0, 1)
  }

    def main(args: Array[String]): Unit = {
    println(fib(5))

      val args = 1 to 10
      args.foreach(println)

  }
}