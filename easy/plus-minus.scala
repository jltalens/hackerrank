object Solution {
  def plusminus(in: Array[Int]) : (Double, Double, Double) = {
    def plusminus_(in: List[Int], sol: (Double, Double, Double)): (Double, Double, Double) = in match {
      case Nil => sol
      case x :: xs if x > 0 => plusminus_(xs, (sol._1 + 1, sol._2, sol._3))
      case x :: xs if x == 0 => plusminus_(xs, (sol._1, sol._2, sol._3 + 1))
      case x :: xs => plusminus_(xs, (sol._1, sol._2 + 1, sol._3))
    }
    val (pos, neg, zer) = plusminus_(in.toList, (0.0, 0.0, 0.0))
    (pos / in.length, neg / in.length, zer / in.length)
  }
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var a = new Array[Int](n)
    for (a_i <- 0 to n -1) {
        a(a_i) = sc.nextInt();
    }
    val (positives, negatives, zeroes) = plusminus(a)
    println(positives)
    println(negatives)
    println(zeroes)
  }
}

