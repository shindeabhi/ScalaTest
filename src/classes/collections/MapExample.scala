package classes.collections

/**
  * Created by user on 3/4/2017.
  */
object MapExample {

  def main(args: Array[String]): Unit = {
    val map = Map("Abhishek"->"Shinde")
    System.out.println(map.values)
    System.out.println(map.keys)
    System.out.println(map.get("Abhishek"));
  }

}
