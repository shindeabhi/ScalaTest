package classes

/**
  * Created by user on 2/24/2017.
  */
object Main {

  def main(args: Array[String]): Unit = {
    var derivativeTax : DerivativeTax = new DerivativeTax();
    derivativeTax.notional_=(12.567);
    derivativeTax.taxableQty_=(55.789);
    System.out.println(derivativeTax);
    derivativeTax = new DerivativeTax(12.5678,45.6789);
    System.out.println(derivativeTax);
  }

}
