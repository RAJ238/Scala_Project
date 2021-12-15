class MoodAnalysisException(s:String) extends Exception(s){}
class MoodAnalyzer(msg:String){
  @throws(classOf[MoodAnalysisException])
  def analyzeMood(): Unit ={
    if(msg==null){
      throw new MoodAnalysisException("Given string is NUll")}
    else if(msg.isEmpty){
      throw new MoodAnalysisException("Given string is Empty")}
    else if(msg.contains("Sad")){
      println("Sad")}
    else {
      println("Happy")}
  }}
  object moodAnalyzer{
    def main(args:Array[String]): Unit ={
      var msg="I am Happy"
      var moodAnalyzerObj=new MoodAnalyzer(msg)
      try{
        moodAnalyzerObj.analyzeMood()}
      catch{
        case e:MoodAnalysisException => println("Exception :"+e)}
    }
  }

