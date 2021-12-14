import scala.util.control.Breaks._
import scala.util.matching.Regex
object userRegistration {
  def main(args:Array[String]): Unit ={
    val firstNamePattern="^[A-Z]{1}[a-z]{2}$".r   //FirstName Registration Pattern
    val lastNamePattern="^[A-Z]{1}[a-z]{2}$".r    //LastName Registration Pattern
    val emailRegistrationPattern="^([\\w\\+\\_\\-]){3}(\\.)?([\\d\\w\\+\\_\\-]{0,3})@([\\d\\w]+)\\.([a-z]{2,3})(\\.[a-z]{2,3})?$".r  //E-Mail Registration Pattern
    val phoneNumberPattern="^[\\d]{1,2}\\s[\\d]{10}$".r      //Phone Number Registration Pattern
    val passwordPattern="^[\\w\\W\\d]{8}$".r
    var firstName="Raj"
    var lastName="Joe"
    var email="raj.joe@gmail.com.in"
    var number="91 1234567892"
    var password="rajjon23"
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
    breakable{while(true){
      if(number.matches(phoneNumberPattern.toString)){
        break
      }
      else println("Phone Number is invalid. Enter Valid Phone Number")
    }}
    breakable{while(true){
      if(password.matches(passwordPattern.toString)){
        break
      }
      else println("Password is invalid. Enter Valid Password")
    }}
  }}