// write a fonksiyon which prints elements of a list
// recurisvely
def printRec[A](listoo: List[A]): Unit = {
    listoo match { 
        case head :: tail => {
                                print(head)
                                printRec(tail)
                             }
        case Nil => ()
    }
}

// write a fonksiyon which prints cumulative sums of a list
// recurisvely
def printRec[A <: Int](sum: Int, listoo: List[A]): Unit = {
    listoo match { 
        case head :: tail => {
                                print(sum + head)
                                printRec(sum + head, tail)
                             }
        case Nil => ()
    }
}

def compress[A](listoo: List[A]): List[A] = {

    def compressRec[A](compressed: List[A], current: List[A], lastelement: Option[A]): List[A] = {
        current match {
            case h :: tail => {
                if (Option(h) != lastelement){
                compressRec(compressed :+ h, tail, Option(h))
                } else {
                compressRec(compressed, tail, Option(h))
                }
            }
            case Nil => compressed
        }
    } 

    compressRec(List.empty, listoo, None)
}



// istihel => 7 bytes
val x = "istihel"
val y = "istihel"
// 14 bytes memory used

val x = 'istihel
val y = 'istihel
// 7 bytes memory used
// because symbol is unique reference it caches sometin sometin



compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))