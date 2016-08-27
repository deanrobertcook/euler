object Utils {

  lazy val fibonacci: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibonacci.zip(fibonacci.tail).map { n => n._1 + n._2 }

}
