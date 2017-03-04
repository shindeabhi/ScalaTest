package classes.functionalCombinators

/**
  * Created by user on 3/4/2017.
  */
object ZipExample {

  def main(args: Array[String]): Unit = {
    //zip aggregates the contents of two lists into a single list of pairs.
    val zippedList =
    List(1,2,3).zip(List("A","B","C"))
    System.out.print(zippedList)

  }

}
