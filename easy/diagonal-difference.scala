object Solution {
  def diagonal(in: Array[Array[Int]]) : Int = {
    var first = 0
    var second = 0
    for(i <- 0 to in.length-1) {
      first += in(i)(i)
      second += in(i)(in.length-1-i)
    }
    Math.abs(first - second)
  }
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var a = Array.ofDim[Int](n,n)
    for (a_i <- 0 to n -1) {
      for (a_j <- 0 to n-1) {
        a(a_i)(a_j) = sc.nextInt();
      }
    }
    println(diagonal(a))
  }
}

