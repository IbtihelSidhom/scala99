def preLast[A](listoo: List[A]): A = {
    listoo match {
        case Nil | _ :: Nil => throw new IllegalArgumentException 
        case first :: second :: Nil => first
        case head :: tail => preLast(tail)
    }
}

preLast(List(1, 1, 2, 3, 5, 8))