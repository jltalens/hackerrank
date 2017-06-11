object Solution {
  def birthdayCakeCandles(in: Array[Int]): Int =  {
    def innerCake(in: List[Int], max: Int, state: Int): Int = in match {
      case Nil                => state
      case x::xs if x == max  => innerCake(xs, max, state + 1)
      case x::xs              => innerCake(xs, max, state)
    }
    val inL = in.toList
    innerCake(inL, inL.max, 0)
  }
  
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var ar = new Array[Int](n)
    for(arr_i <- 0 to n-1) {
      ar(arr_i) = sc.nextInt();
    }
    val result = birthdayCakeCandles(ar)
    println(result)
  }
}

