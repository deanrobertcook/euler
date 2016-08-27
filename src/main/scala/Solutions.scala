import Utils._

object Solutions {

  def problem1(n: Int): Int = (0 until n).filter(i => i % 3 == 0 || i % 5 == 0).sum

  def problem2(n: Int): Int = {
    val seq = fibonacci.takeWhile(_ <= n)
    seq.map(_.intValue()).filter(i => i % 2 == 0).sum
  }

}
