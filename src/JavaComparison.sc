//class Product {
//  var id: Int = _
//  var category: String = _
//}
//class Order {
//  var id: Int = _
//  var products: List[Product] = Nil
//}
//class User {
//  var name: String = _
//  var orders: List[Order] = Nil
//}


//custom Setter
//class User {
//  private var _name: String = _
//  var orders: List[Order] = Nil
//
//  def name = _name
//
//  def name_=(name: String) = {
//    if (name == null) {
//      throw new NullPointerException("User.name cannot be null!")
//    }
//    _name = name
//  }
//}

//set Name still looks like this
//user.name = "John Doe"

//case class Product(id: Int, category: String)
//case class Order(id: Int, products: List[Product])
//case class User(name: String, orders: List[Order])

