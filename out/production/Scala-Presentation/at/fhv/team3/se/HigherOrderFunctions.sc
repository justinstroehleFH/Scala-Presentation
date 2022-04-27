// Map
val salaries = List(1000, 3000, 5000)
val increase = (x: Int) => x * 1.1
val newSalaries1 = salaries.map(increase)
// shorten
val newSalaries2 = salaries.map(x => x * 1.1)
val newSalaries3 = salaries.map(_ * 1.1)

// Coercing methods into functions
case class WeeklyWeatherForecast(temperatures: List[Double]) {

  def convertCtoF(temp: Double) = temp * 1.8 + 32

  def forecastInFahrenheit: List[Double] = temperatures.map(convertCtoF) // <-- passing the method convertCtoF
  def forecastInFahrenheit2: List[Double] = temperatures.map(x => convertCtoF(x)) // <-- Same, but using Lambda Expression
}

var temperaturesC = List(0.0, 38.0)
var forecast = WeeklyWeatherForecast(temperaturesC)
var temperaturesF = forecast.forecastInFahrenheit
var temperaturesF2 = forecast.forecastInFahrenheit2

// Functions that accept functions
object SalaryRaiser1 {

  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)
}

object SalaryRaiser2 {

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)
}


SalaryRaiser1.smallPromotion(List(1000.0, 3000.0, 5000.0))
SalaryRaiser2.smallPromotion(List(1000.0, 3000.0, 5000.0))

// Functions that return functions
def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
  val schema = if (ssl) "https://" else "http://"
  (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
}

val domainName = "www.fhv.at"
def getURLhttp = urlBuilder(ssl = false, domainName)
def getURLhttps = urlBuilder(ssl = true, domainName)
val endpoint = "users"
val query = "id=1"
val http = getURLhttp(endpoint, query)
val https = getURLhttps(endpoint, query)

// Further Functions for a list
var list = List(10, 20, 30, 40, 10)
list.dropWhile(_ < 25)
list.sortWith(_ > _)