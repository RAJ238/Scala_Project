
object empWageComputation {

  def main(args:Array[String]){
    println("    Welcome to Employee Wage Computation Program    ")
    println("_______________________________________________________________    ")
    val rd=scala.util.Random
    var(empName,atd,empDays)=("Raj",rd.nextBoolean(),rd.nextInt(20))
    if(atd)
      println("The employee "+empName+" is present today")
    else
      println("The employee "+empName+" is absent today")

  }
}