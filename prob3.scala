def nth[A](n : Int,listoo : List[A]) : A = {
    if (listoo.isEmpty) throw new IllegalArgumentException

    n match {
        case 0 => listoo.head
        case _ => nth(n-1, listoo.tail)
    }
}

nth(2, List(1, 1, 2, 3, 5, 8))