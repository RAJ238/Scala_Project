object empWageComputation {
  def main(args:Array[String]){
    println("    Welcome to Employee Wage Computation Program    ")
    println("_______________________________________________________________    ")
    val rd=scala.util.Random
    var day=1
    var presentDay=0
    var wage=0
    var totalWage=0
    var totalHrs=0
    val wph=20
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
            val hr=4
            val dayType="part"
            totalHrs+=hr
            wage=WorkingHours(wph,hr,dayType,totalHrs,empName)
            totalWage+=wage
          case _=>
            val hr=8
            val dayType="full"
            totalHrs+=hr
            wage=WorkingHours(wph,hr,dayType,totalHrs,empName)
            totalWage+=wage}
      case _=> println("Day "+day+": "+empName+" is absent today")}
      day+=1
    }
    if(totalWage>2000){
      println("_______________________________________________________________")
      println(empName+", you were present for "+presentDay+" days and your total monthly wage earned is 2000")
      println("_______________________________________________________________")}
    else{
      println("_______________________________________________________________")
      println(empName+", you were present for "+presentDay+" days and your total monthly wage earned is "+totalWage)
      println("_______________________________________________________________")}}
    def WorkingHours( wph:Int, hr:Int, s:String,totalWage:Int,empName:String): Int ={
      var wage=wph*hr
      if(s=="part"){
        println("So, part time wage of "+empName+" is "+wage)}
      else{
        println("Daily wage of "+empName+" is "+wage)}
    wage}}