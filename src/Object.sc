object Logger {
  def info(message: String): Unit = println(s"INFO: $message")
}

val logger1 = Logger
var logger2 = Logger

class LogEntry (text: String){
  import Logger._
  def loggerInfo = info(text)
}

val logger = new LogEntry("test")
logger.loggerInfo
