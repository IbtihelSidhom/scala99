def last[A](listoo: List[A]): A = {
    listoo match {
        case Nil => throw new IllegalArgumentException 
        case head :: Nil => head
        case head :: tail => last(tail)
    }
}

last(List(1, 1, 2, 3, 5, 8))