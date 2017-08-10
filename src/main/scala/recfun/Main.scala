package recfun

object Main {


  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || r == 0) return 1
      else pascal(c - 1, r - 1)
      pascal(c, r - 1) + pascal(c-1,r-1)
}

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def balanceInit(chars: List[Char],count:Int  = 0):Int = chars match {
        case head::tail => head match {
          case '(' =>  balanceInit(tail,count + 1)
          case ')' =>  balanceInit(tail,count - 1)
          case _ => balanceInit(tail,count)
        }
        case Nil => count
      }

      chars match {
        case Nil => true
        case list => if (balanceInit(list,0) == 0) true else false
      }
    }


  /**
   * Exercise 3
   */

    def countChange(money: Int, coins: List[Int]): Int = (money, coins) match {
    case (0, _) => 1
    case (m, _) if (m < 0) => 0
    case (_, cs)  if cs.isEmpty => 0
    case (m, cs) => countChange(m - cs.head, cs) + countChange(m, cs.tail)
  }
  }
