package classes.functionalCombinators

/**
  * Created by user on 3/4/2017.
  */
object PartitionExample {
  def main(args: Array[String]): Unit = {
    val numbers = List(1,2,3,4,5,6,7,8)
    val paritionedList = numbers.partition(_%2==0)
    System.out.println(paritionedList)
  }
}
