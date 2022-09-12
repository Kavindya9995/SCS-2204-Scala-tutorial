package Demo7

object Q2 {
  def main(args: Array[String]) {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val a = x - y - z

    println(a)
  }

  class Rational(n: Int, d: Int) {
    require(denom > 0, "Denominator must be greater than 0") // require function used to validate input parameters

    def numer = n
    def denom = d

    def neg = new Rational(-this.numer, this.denom)
    // this -> use when want to introduce the current object for a class
    def add(r: Rational) = new Rational(this.numer * r.denom + this.denom * r.numer, this.denom * r.denom)

    def -(r: Rational) = this.add(r.neg)

    override def toString(): String = numer + "/" + denom
    //we can override toString() method in our class to print proper output.
  }
}