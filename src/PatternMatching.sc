import scala.util.Random

val x: Int = Random.nextInt(10)

x match {
  case 0 => "zero"
  case 1 => "one"
  case 2 => "two"
  case _ => "other"
}

//pattern matching with functions
//def matchTest(x: Int): String = x match {
//  case 1 => "one"
//  case 2 => "two"
//  case _ => "other"
//}
//matchTest(3)  // returns other
//matchTest(1)  // returns one


//pattern matching with tupels
//val planets =
//  List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
//    ("Mars", 227.9), ("Jupiter", 778.3))
//planets.foreach{
//  case ("Earth", distance) =>
//    println(s"Our planet is $distance million kilometers from the sun")
//  case _ =>
//}

//pattern matching with case classes
//abstract class Notification
//case class Email(sender: String, title: String, body: String) extends Notification
//case class SMS(caller: String, message: String) extends Notification
//case class VoiceRecording(contactName: String, link: String) extends Notification
//
//def showNotification(notification: Notification): String = {
//  notification match {
//    case Email(sender, title, _) =>
//      s"You got an email from $sender with title: $title"
//    case SMS(number, message) =>
//      s"You got an SMS from $number! Message: $message"
//    case VoiceRecording(name, link) =>
//      s"You received a Voice Recording from $name! Click the link to hear it: $link"
//  }
//}
//val someSms = SMS("12345", "Hello World")
//val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
//
//println(showNotification(someSms))
//
//println(showNotification(someVoiceRecording))


//pattern matching on type only
//abstract class Device
//case class Phone(model: String) extends Device {
//  def screenOff = "Turning screen off"
//}
//case class Computer(model: String) extends Device {
//  def screenSaverOn = "Turning screen saver on..."
//}
//
//def goIdle(device: Device) = device match {
//  case p: Phone => p.screenOff
//  case c: Computer => c.screenSaverOn
//}
//
//goIdle(Phone("IPhone 13"))