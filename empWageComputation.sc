object empWageComputation {
  def main(args:Array[String]){
    println("    Welcome to Employee Wage Computation Program    ")
    println("_______________________________________________________________    ")
    val rd=scala.util.Random
    var day=1
    var presentDay=0
    var totalWage=0
    var totalHrs=0
    var empName="Raj"
    while(day<=20 && totalHrs<100 ){
      var atd=rd.nextBoolean()
      atd match{
        case true=>
          println("Day "+day+": "+empName+" is present today")
          presentDay+=1
          var empPartTime=rd.nextBoolean()
        empPartTime match{
          case true=>
            print("    "+empName+" has worked part time today.")
            val wph=20
            val hr=4
            totalHrs+=hr
            val wage=wph*hr
            totalWage+=wage
            println("So, part time wage of "+empName+" is "+wage)
          case _=>
            val wph=20
            val hr=8
            totalHrs+=hr
            val wage=wph*hr
            totalWage+=wage
            println("Daily wage of "+empName+" is "+wage)}
      case _=> println("Day "+day+": "+empName+" is absent today")}
      day+=1
    }
    if(totalWage>2000)
      println(empName+", you were present for "+presentDay+" days and the total monthly wage is 2000")
    else
      println(empName+", you were present for "+presentDay+" days and the total monthly wage is "+totalWage)
  }}