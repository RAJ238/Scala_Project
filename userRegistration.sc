import scala.util.control.Breaks._
import scala.util.matching.Regex
object userRegistration {
  def main(args:Array[String]): Unit ={
    val firstNamePattern="^[A-Z]{1}[a-z]{2}$".r   //FirstName Registration Pattern
    val lastNamePattern="^[A-Z]{1}[a-z]{2}$".r    //LastName Registration Pattern
    val emailRegistrationPattern="^([\\w\\+\\_\\-]){3}(\\.)?([\\d\\w\\+\\_\\-]{0,3})@([\\d\\w]+)\\.([a-z]{2,3})(\\.[a-z]{2,3})?$".r  //E-Mail Registration Pattern
    var firstName="Raj"
    var lastName="Joe"
    var email="raj.joe@gmail.com.in"
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
    breakable{while(true){
      if(email.matches(emailRegistrationPattern.toString)){
        break
      }
      else println("Email is invalid. Enter Valid Email")
    }}
  }}