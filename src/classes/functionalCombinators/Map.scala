package classes.functionalCombinators

/**
  * Created by user on 3/4/2017.
  */
object Map {

  def main(args: Array[String]): Unit = {
    val numbers = List(1,5,6,8);
    val numbersAfterMapApplication = numbers.map((i:Int)=>i*3);
    System.out.println(numbers(3))
    System.out.println(numbersAfterMapApplication(3))
  }

}
