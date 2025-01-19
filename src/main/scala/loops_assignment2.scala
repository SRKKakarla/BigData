object loops_assignment2 {
  def main(args: Array[String]): Unit = {
    //1    for (i<- 1 to 5)
    //      {
    //        println(i)
    //      }
    //--------------------------------
    //2    var i =1
    //      while (i<=10){
    //        if (i%2==0){
    //          println(i)
    //
    //        }
    //        i=i+1
    //      }
    //-----------------------------------
    //3
    // var sum=0
    //    for (i<- 1 to 50)
    //      {
    //        sum=sum+i
    //      }
    //      print(sum)
    //-------------------------------------------
    //4
    //for (i <- 1 to 5){
    //  println(i*i)
    //}
    //--------------------------------
    //6
    //for (i<- 1 to 5){
    //  println(i*3)
    //}
    //------------------------------
    //7
    //var i =1
    //while(i<=15 ){
    //  if(i%2!=0){
    //    println(i)
    //  }
    //  i=i+1
    //}
    //-----------------------------------------
    //8
    //print("Please enter the number: ")
    //var a =scala.io.StdIn.readInt()
    //var factorial=1
    //for (i<- 1 to a) {
    //  factorial=factorial*i
    //}
    //    print(factorial)
    //-----------------------------------------------
    //10
    //    print("please enter a number: ")
    //    var a = scala.io.StdIn.readInt()
    //    if (a == 2 || a == 3) {
    //      print(a + " is a prime number")
    //    }
    //    else {
    //      var i = 2
    //      var is_prime = true
    //      while (i <= a / 2) {
    //        if (a % i == 0) {
    //          is_prime = false
    //          i = a
    //        }
    //        i = i + 1
    //      }
    //      if (is_prime) {
    //        println(a + " is a prime number")
    //      }
    //      else {
    //        print(a + " is not a prime number")
    //      }
    //    }
    //-------------------------------
    //11
//    val a = Array(10, 20, 30, 40, 50, 60, 70)
//    for (i <- a.length - 1 to 0 by -1) {
//      println(a(i))
//    }
//--------------------------
    //12
//    var i =1
//    var sum = 0
//    while (i<=20){
//      if (i%2==0) {
//        sum=sum+i
//      }
//      i=i+1
//    }
//    print(sum)
//-------------------------------------
//13
//for (i <- 1 to 4){
//  for(j <- 1 to i){
//    print("*")
//  }
//  println("")
//}
//---------------------------------------

//    println("Enter the size of the array:")
//    val size = scala.io.StdIn.readInt()
//    val arr = new Array[Int](size)
//    for (i <- 0 until size) {
//      arr(i) = scala.io.StdIn.readInt()
//    }
//    println("The array elements are:")
//    for (i <- 0 until arr.length)
//{
//  println(arr(i))
//}


//    var arr = Array(1,2,3,4,5)
//    arr(2)=99
//    for (i <- 0 until arr.length){
//      println(arr(i))
//    }

//    var arr =Array(5,10,15,20,25)
//    var sum = 0
//    for (i <- 0 until arr.length){
//      sum=sum+arr(i)
//    }
//    print(sum)

//    val a = Array(1, 2, 3, 4, 5, 6, 7)
//     for (i <- 0 to a.length - 1 by -1) {
//       println(a(i))
//     }
    //------------------------------------
//14
//    var i =1
//    while (i<=3){
//      println(i*i*i)
//      i=i+1
//    }
//---------------------------------------
//17
//    var product =1
//for (i<- 1 to 5){
//  product=product*i
//}
//print(product)
//---------------------------------
//    for (i<- 1 to 4){
//      for (j <-1 to i){
//        print(i)
//      }
//      println("")
//    }
//-------------------------------------
    //18
//    print("please enter the number: ")
//var num = scala.io.StdIn.readInt()
//    //if(num==1){print(num+ " : is a perfect square")}
//    var i = 1
//    var factor =1
//    var Is_perfect_square=false
//while (i<=num){
//  factor=num/i
//  if (factor*factor==num){
//    Is_perfect_square=true
//    i=num
//  }
//  else if (factor*factor!=num){
//    i=i+1
//  }
//
//}
//    if (Is_perfect_square || num==1){
//      print(num+ " : is a perfect square")
//    }
//    else(print(num+ " : is not a perfect square"))
  }
}