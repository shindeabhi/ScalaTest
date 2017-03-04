package classes.functionalCombinators

/**
  * Created by user on 3/4/2017.
  */
object ForEachExample {
  def main(args: Array[String]): Unit = {
    var sum = 0
    // foreach is like map but returns nothing. foreach is intended for !!!!!side-effects only!!!!.
    val numbers = List(1, 4, 8, 10)
    numbers.foreach(sum+=_)
    System.out.print(sum)

  }
}
