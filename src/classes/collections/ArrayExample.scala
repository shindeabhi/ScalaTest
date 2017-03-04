package classes.collections

/**
  * Created by user on 2/24/2017.
  */
object ArrayExample {

  def main(args: Array[String]): Unit = {
    var arrayOfIntegers: Array[Int] = new Array[Int](2);
    arrayOfIntegers(0) = 10;
    arrayOfIntegers(1) = 20;
    for (arrayData <- arrayOfIntegers) {
      System.out.println(arrayData)
    }

  }

}
