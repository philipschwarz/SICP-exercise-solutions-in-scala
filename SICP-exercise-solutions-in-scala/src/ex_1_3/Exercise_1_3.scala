package ex_1_3

object Exercise_1_3 {

  def sumOfSquaresOfTwoLargerNumbers (x:Int, y:Int, z:Int) : Int = 
  {
    val (first,second) = largestTwo(x,y,z)
    square(first) + square(second)
  }
  
  def largestTwo(x:Int, y:Int, z:Int) : (Int,Int) =
  {
    val (smallestSoFar,notTheSmallest) = order(x,y)
    val (smallest,alsoNotTheSmallest) = order(smallestSoFar,z)
    order(notTheSmallest, alsoNotTheSmallest)
  }
  
  def order(x:Int,y:Int) = if (x < y) (x,y) else (y,x)
  def square(x:Int) = x * x  
  
  assert(sumOfSquaresOfTwoLargerNumbers(2,3,4)==25)
  assert(sumOfSquaresOfTwoLargerNumbers(2,4,3)==25)
  assert(sumOfSquaresOfTwoLargerNumbers(4,3,2)==25)
  assert(sumOfSquaresOfTwoLargerNumbers(4,2,3)==25)
  assert(sumOfSquaresOfTwoLargerNumbers(3,2,4)==25)  
  assert(sumOfSquaresOfTwoLargerNumbers(3,4,2)==25)  
  
}