object first {
  def main(args: Array[String]): Unit = {
    val arr = Array(10,20,30,40,50,60,70,80,90, 'a')
    var array = Array('a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 1)
    for (i <- 0 until arr.length) {
      for (j<- 0 until array.length)
        println(array(j))
      println(arr(i))
    }
  }


}
