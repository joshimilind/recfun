/*


def balance(chars: List[Char], count:Int = 0): Boolean = (chars, count) match {
        case (cs, 0) => true
        case (cs, _) => false
  case (cs, c) => cs.head match {
    case '(' => balance(cs.tail, c+1)
    case ')' if c > 0 => balance(cs.tail, c-1)
    case ')' => false
    case _  => balance(cs.tail, c)
  }
  //      case (cs, _) => false

}*/
