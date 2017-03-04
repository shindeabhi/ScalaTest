package classes

/**
  * Created by user on 2/24/2017.
  */
class DerivativeTax {
  private[this] var _notional: BigDecimal = 0.0

  private[this] var _taxableQty: BigDecimal = 0.0


  def taxableQty: BigDecimal = _taxableQty
  def notional: BigDecimal = _notional

  def notional_=(value: BigDecimal): Unit = {
    _notional = value
  };


  def taxableQty_=(value: BigDecimal): Unit = {
    _taxableQty = value
  };

  def this(notional : BigDecimal, taxableQty :BigDecimal)
  {
    this();
    this.taxableQty_=(taxableQty);
    this.notional_=(notional);
  }




  override def toString = s"DerivativeTax($taxableQty, $notional)"
}
