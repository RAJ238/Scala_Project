object empWageComputation {
  def main(args:Array[String]){
    println("    Welcome to Employee Wage Computation Program    ")
    println("_______________________________________________________________    ")
    val rd=scala.util.Random
    var(empName,atd,empPartTime,empDays)=("Raj",rd.nextBoolean(),rd.nextBoolean(),rd.nextInt(20))
    if(atd)
      {println("The employee "+empName+" is present today")
        if(empPartTime){
          print(empName+" has worked part time today.")
          var wph=20
          var hr=4
          var wage=wph*hr
          println("The daily part time wage of "+empName+" is "+wage)

      }
        else{
        var wph=20
        var hr=8
        var wage=wph*hr
        println("The daily wage of "+empName+" is "+wage)
      }}
    else
      println("The employee "+empName+" is absent today")
  }
}