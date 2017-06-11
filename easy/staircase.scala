object Solution {
  val c = "#"
  val rc = " "
  val nl = "\n"
  def sol(in: Int) : String = {
    def sol_(dec: Int, rem: Int, state: String) : String = {
      if (dec == 0)
        state
      else {
        val newState = (rc * rem) + (c * dec) + nl
        sol_(dec - 1, rem + 1, newState + state)
      }
    }
    sol_(in, 0, "")
  }
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    println(sol(n))
  }
}

