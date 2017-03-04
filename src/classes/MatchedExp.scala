package classes

/**
  * Created by user on 2/24/2017.
  */
object MatchedExp {

  def main(args: Array[String]): Unit = {
    var value = "Kimaya";

    var result = value match {
      case "Abhishek" => "Shit is happening!!!!";
      case "Vrushali" => "Bigger Shit is happening!!!!";
      case "Kimaya" => "Brilliant KIDO!!!";
    }

    print(result);
  }

}
