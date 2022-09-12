package Demo7
object Q1 {

  def main(args: Array[String]) {

    val obj1 = new Rational(2, 3)  //new is used to create an instance of the class.
    val obj2 = new Rational(1, 8)

    println(obj1.neg)

    val q: Rational = obj1.add(obj2)
    println(q)

  }

class Rational(n:Int, d:Int) {
  require(denom > 0, "Denominator should be greater than 0")  // require function used to validate input parameters
  def numer: Int = n
  def denom: Int = d

  def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
  // this -> use when want to introduce the current object for a class

  def neg = new Rational(-this.numer, this.denom)

  override def toString: String = numer + "/" + denom
}
  }