object Solution {
  def miniMaxSum(in: Array[Int]): (Long, Long) = {
    def miniMaxSum_(in: List[Int], max: Long, min: Long) : (Long, Long, Boolean, Boolean) =
      in.foldLeft((0L, 0L, false, false)){ (acc, curr) => curr match {
        case x if x == max && acc._3 == false => (acc._1, acc._2 + x, true, acc._4)
        case x if x == min && acc._4 == false => (acc._1 + x, acc._2, acc._3, true)
        case x => (acc._1 + x, acc._2 + x, acc._3, acc._4)
        }
      }
    val inList = in.toList
    val (min, max, _, _) = miniMaxSum_(inList, in.max.toLong, in.min.toLong)
    (min, max)
  }
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var arr = new Array[Int](5);
    for(arr_i <- 0 to 5-1) {
      arr(arr_i) = sc.nextInt();
    }
    val sol = miniMaxSum(arr)
    println(sol._1 + " " + sol._2)
  }
}

