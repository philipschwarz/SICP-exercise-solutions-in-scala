package ex_1_4

object Exercise_1_4 extends Application {

  def plus(x:Int,y:Int) = x + y
  def minus(x:Int,y:Int) = x - y
  
  def a_plus_abs_b(a:Int,b:Int) : Int =
  {
    (if(b > 0) plus _ else minus _)(a,b)
  }
  
  assert(a_plus_abs_b(1,-2)==3)
  assert(a_plus_abs_b(1,-1)==2)
  assert(a_plus_abs_b(1,0)==1)
  assert(a_plus_abs_b(1,1)==2)
  assert(a_plus_abs_b(1,2)==3)
  
}