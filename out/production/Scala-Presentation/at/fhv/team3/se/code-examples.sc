import at.fhv.team3.se.JavaCode
import at.fhv.team3.se.JavaCode.test

test()








// Pattern Matching

// Lambda expressions
val a = List(10, 20, 30, 40, 10)
a.filter((i: Int) => i < 25)
a.filter((i) => i < 25)
a.filter(i => i < 25)
a.filter( _ < 25)

// Differences Scala and Java
// List
/*
view JavaCode.java
*/

val list = List("1", "2", "3");

val ints = list.map(s => s.toInt)

// Class
/*
view Student in JavaCode.java
*/

class Student {
  private var _id: Int = _
  var course: String = _

  def id: Int = _id
  def id_= (id: Int) = {
    if(id > 0){
      _id = id
    }
  }
}

var student = new Student()
student.id = 1
student.course = "IT"
println(student.id + ": " + student.course)

/* or */

case class StudentC(id: Int, course: String)
var studentC = new StudentC(2, "Accounting")
println(studentC.id + ": " + studentC.course)

