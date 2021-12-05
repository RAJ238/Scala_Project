object empWageComputation {
  def main(args:Array[String]){
    println("    Welcome to Employee Wage Computation Program    ")
    println("_______________________________________________________________    ")
    val rd=scala.util.Random
    var day=0
    val(empName,atd,empPartTime)=("Raj",rd.nextBoolean(),rd.nextBoolean())
    while(day<=20){
    atd match{
      case true=>
        println("The employee "+empName+" is present today")
        empPartTime match{
          case true=>
            print(empName+" has worked part time today.")
            val wph=20
            val hr=4
            val wage=wph*hr
            println("The daily part time wage of "+empName+" is "+wage)
          case _=>
            val wph=20
            val hr=8
            val wage=wph*hr
            println("The daily wage of "+empName+" is "+wage)}
      case _=> println("The employee "+empName+" is absent today")}
      day+=1
    }}}