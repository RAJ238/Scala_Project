import scala.util.control.Breaks._
import scala.util.matching.Regex
object userRegistration {
  def main(args:Array[String]): Unit ={
    val firstNamePattern="^[A-Z]{1}[a-z]{2}$".r   //FirstName Registration Pattern
    val lastNamePattern="^[A-Z]{1}[a-z]{2}$".r    //LastName Registration Pattern
    var firstName="Raj"
    var lastName="Joe"
    breakable{while(true){
      if(firstName.matches(firstNamePattern.toString)){
        break
      }
      else println("First Name is invalid. Enter Valid First Name")
    }}
    breakable{while(true){
      if(lastName.matches(lastNamePattern.toString)){
        break
      }
      else println("Last Name is invalid. Enter Valid Last Name")
    }}
  }}