object Q3 extends App{

  class Account(id: String, n: Int, b: Double){
    val NIC:String = id
    val ac_no:Int = n
    var balance:Double = b

    def withdraw(a:Double): Unit = this.balance = this.balance - a

    def deposit(a:Double): Unit = this.balance = this.balance + a

    def transfer(a:Account, b:Double):Unit = {
      this.withdraw(b)
      a.deposit(b)
    }
    override def toString: String = "NIC - " + this.NIC + "   Acc. NO - " + this.ac_no + "   Balance - " + this.balance
  }

  val ac_1 = new Account("997494776V", 800759368, 80000)
  val ac_2 = new Account("982547631V", 800741258, 40000)

  println("Initial account details: ")
  println(ac_1)
  println(ac_2)

  ac_1.transfer(ac_2, 10000)
  println("\nAccount details after transferring money: ")
  println(ac_1)
  print(ac_2)
}
