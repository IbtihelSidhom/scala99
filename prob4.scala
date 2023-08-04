def length[A](listoo : List[A]): Int = {
    listoo match {
        case Nil => 0
        case _ :: tail => 1 + length(tail)
    }
}

length(List(1, 1, 2, 3, 5, 8))
