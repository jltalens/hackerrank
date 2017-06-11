object Solution {

		def factorial(n: Int): BigInt = {
			def factorial_(n: Int, state: BigInt): BigInt = n match {
				case 0 => state
				case x => factorial_(x -1, state * x)
			}
			factorial_(n, BigInt(1))
		}

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
				println(factorial(n))
    }
}
