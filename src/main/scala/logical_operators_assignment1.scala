object logical_operators_assignment1 {
  def main(args: Array[String]): Unit = {

    def function1(): Unit = {
      print("Please enter your number: ")
      var a = scala.io.StdIn.readInt()
      if (a % 2 == 0 && a > 0) {
        print(a + " is both even and positive number")
      }
      else if (a % 2 == 0 && a < 0) {
        print(a + " is even but negative number")
      }
      else if (a % 2 == 1 && a > 0) {
        print(a + " is positive number but an odd number")
      }
      else {
        print(a + " is both negative and odd number")
      }
    }

    def function2(): Unit = {
      print("Please enter your number: ")
      var a = scala.io.StdIn.readInt()
      if (a < -10)
        {
          print(a+ " is less than -10")
        }
      else if ( a>10)
      {
        print(a+ " is greater than 10")
      }
      else
        {
          print("given number is neither less than -10 nor greater than 10")
        }
    }

    def function3(): Unit = {
      print("Please enter your number: ")
      var a = scala.io.StdIn.readInt()
      if (a%2==1 && a%3==0)
      {
        print(a+ " is odd number and divisible by 3")
      }
      else
      {
        print(a+" is either even number or not divisible by 3")
      }
    }

    def function4(): Unit = {
      print("Please enter your number: ")
      var a = scala.io.StdIn.readInt()
      if (a%4==0 || a%6==0)
      {
        print(a+ " is divisible by either 4 or 6")
      }
      else
      {
        print(a+" is not divisible by both 4 and 6")
      }
    }

    def function5(): Unit = {
      print("Please enter your age: ")
      var a = scala.io.StdIn.readInt()
      if (a>=18)
      {
        print("you are eligible to vote and drive")
      }
      else if (a>=16 && a<18)
      {
        print("you are eligible to drive but not eligible to vote")
      }
      else
        {
          print("you are not eligible to vote and drive")
        }
    }
    def function6(): Unit = {
      print("Please enter your number: ")
      val a = scala.io.StdIn.readInt()
      if (a>=1 && a<= 10)
      {
        print(a+ " is in range[1,10]")
      }
      else if (a>=20 && a<=30)
      {
        print(a+" is in range [20,30]")
      }
      else {print("given number is not in the defined ranges")}
    }




  }
}
// 19. if(a%3==0 && a%7==0)
// 20. if(a%5==0 || a%9==0)
//21. 