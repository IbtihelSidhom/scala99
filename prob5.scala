def reverse[A](listoo : List[A]): List[A] = {
    listoo match {
        case Nil => Nil
        case h :: tail => reverse(tail) :+ h 
    }
}

reverse(List(1, 1, 2, 3, 5, 8))