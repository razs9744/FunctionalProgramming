import scala.collection.mutable.ListBuffer

object Util {

  // max
  def max[A](AList:List[A], func: (A, A) => Int):A={
    if (AList.isEmpty) -1
    //Variables init
    var maxA =AList(0)
    //check for each item if he is max
    AList.foreach{A=>
      if(func(maxA,A)<0) maxA=A
    }
    maxA
}


  // map
def map[A,B,C](AList:List[A],AtoBFunc:A=>B,BtoCFunc:B=>C): List[C] ={
  var CList=  ListBuffer[C]()
  AList.foreach{A=>CList+=BtoCFunc(AtoBFunc(A))}
  CList.toList
}

  // isSorted
  def isSorted[A](AList:List[A], func: (A, A) => Boolean): Boolean={
  if(AList.length.equals(1) || AList.isEmpty) return true
    if(func(AList(0),AList(1))) isSorted(AList.drop(1),func) //send the list from the next arg
    else false
  }


  // prob
def prob(any: Any,anyArr:Array[Any]): Double ={
  var numOfOccur:Double =0
  anyArr.foreach{X=>if(X.equals(any))  numOfOccur+=1}
  numOfOccur/anyArr.length
}

  // entropy
  def entropy(arr: Array[Any]): Double = {
    var sum:Double=0
    arr.foreach(X=>{
    var XProb:Double = prob(X,arr)
    sum+= XProb *(math.log10(XProb)/math.log10(2))})
    -1*sum
  }


}
