package classes.collections

/**
  * Created by user on 3/4/2017.
  */
object TupleExample {
  // A tuple groups together simple logical collections of items without using a class.
  def main(args: Array[String]): Unit = {
    val nameAndAddr = ("Abhishek","Shinde","Thane")
    System.out.println(nameAndAddr._1)
    System.out.println(nameAndAddr._2)
    System.out.println(nameAndAddr._3)
    System.out.println(nameAndAddr.toString())
  }

}
