object main {

  def main(args:Array[String]) = {
    val nums: List[Int] = List(1, 2, 3, 4)
    val st: List[Double]= List( 5000000.01, 0.8901, 0.87,1.3333, 99999, 99999.000001, 5000000)
    if(Util.max(nums,(x:Int,y:Int)=>x-y)!=4)
      println("max does not return the max value for list of ints(-10)")
    //var t=Util.max(st,(x:Double,y:Double)=>x-y)

   // println(t)


    Util.map(nums,(x:Int)=>x*2,(y:Int)=>"student "+y).foreach(s=>println(s))

    if(!Util.isSorted(nums,(x:Int,y:Int)=>x<=y))
      println("wrong result for isSorted (-10)")

    val items: Array[Any] = Array("a",1,1,2,2,3,3.9,4,4,4,4.5,"a","b")
    val p=Util.prob("a",items) // 2/13

    if(!(p>0.153 && p<0.154))
      println("wrong result for prob function (-10)")

    val items2: Array[Any] = Array(1,1,1,2)
    println(Util.prob(1,items2)) // 0.75
    println(Util.prob(2,items2)) // 0.25
    println(Util.entropy(items2)) // -(3*0.75*log2(0.75) + 0.25*log2(0.25))=1.4338
  }


}
