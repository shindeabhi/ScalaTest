package classes.functionalCombinators

/**
  * Created by user on 3/4/2017.
  */
object FilterExample {
  def main(args: Array[String]): Unit = {
    val numbers = List(1,2,3,4,10)
    val filteredNumbers = numbers.filter((i:Int)=>i%2==0)
    System.out.print(filteredNumbers.size)
  }
}
