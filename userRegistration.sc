import scala.util.control.Breaks._
import scala.util.matching.Regex
object userRegistration {
  def main(args:Array[String]): Unit ={
    //FirstName Registration
    var firstNamePattern="^[A-Z]{1}[a-z]{2}$".r
    var firstName="Raj"
    breakable{while(true){
      if(firstName.matches(firstNamePattern.toString)){
        break
      }
      else println("First Name is invalid. Enter Valid First Name")
    }}
  }}