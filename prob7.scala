def flatten(listoo : List[Any]): List[Any] = {

    listoo.flatMap(e => {
        e match {
           case l : List[_] => flatten(l)
           case _ => List(e)
        }
    })
    
}


flatten(List(List(1, 1), 2, List(3, List(5, 8))))