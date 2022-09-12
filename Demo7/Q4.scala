package Demo7

object Q4 extends App{

  class Account(id: String, n: Int, b: Double){
    val NIC:String = id
    val ac_no:Int = n
    var balance:Double = b

    override def toString = "NIC : "+NIC+"   Acc. NO : "+ac_no+"   Balance : "+ balance

  }
  val ac_1= new Account("997494776V",800147258,80220)
  val ac_2= new Account("982547631V",800236598,-2500)
  val ac_3= new Account("992354452V",800147359,45000)
  val ac_4= new Account("982225863V",800952635,-10000)

  var bank:List[Account]=List(ac_1,ac_2,ac_3,ac_4)

  val overdraft = bank.filter(x=>x.balance<0)
  val balance = bank.map(x=> x.balance).reduce((x,y)=> x+y)
  val interest = (b:List[Account])=>b.map(x => (x.NIC,x.ac_no,if(x.balance>0)  x.balance + x.balance*0.5 else x.balance + x.balance*0.1 ))

  println("List of Account with negative balances : \n" + overdraft)
  println("\nSum of all accounts : Rs:" + balance)
  println("\nFinal balances of all accounts after apply the interest function : \n" + interest(bank))
}