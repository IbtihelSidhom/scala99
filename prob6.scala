def reverse[A](listoo : List[A]): List[A] = {
    listoo match {
        case Nil => Nil
        case h :: tail => reverse(tail) :+ h 
    }
}


def isPalindrome[A](listo : List[A]): Boolean = {
    //val reversed = reverse(listo)
    listo == listo.reverse
}


isPalindrome(List(1, 2, 3, 2, 1))