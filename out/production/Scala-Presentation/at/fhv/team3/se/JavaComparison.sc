class Product1 {
  var id: Int = _
  var category: String = _
}
class Order1 {
  var id: Int = _
  var products: List[Product] = Nil
}
class User1 {
  var name: String = _
  var orders: List[Order1] = Nil
}

var product = new Product1
product.id = 1
product.id

// custom Setter
class User2 {
  private var _name: String = _
  var orders: List[Order1] = Nil

  def name = _name

  def name_=(name: String) = {
    if (name == null) {
      throw new NullPointerException("User.name cannot be null!")
    }
    _name = name
  }
}
var user = new User2
// set Name still looks like this
user.name = "John Doe"

case class Product3(id: Int, category: String)
case class Order3(id: Int, products: List[Product])
case class User3(name: String, orders: List[Order3])

// List

val list = List("1", "2", "3");

val ints = list.map(s => s.toInt)

