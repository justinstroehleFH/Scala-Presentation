class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}

val point1 = new Point(2, 3)

//class Point(var x: Int = 0, var y: Int = 0)
//val origin = new Point

//class Point {
//  private var _x = 0
//  private var _y = 0
//  private val bound = 100
//
//  def x: Int = _x
//  def x_= (newValue: Int): Unit = {
//    if (newValue < bound) _x = newValue else printWarning()
//  }
//
//  def y: Int = _y
//  def y_= (newValue: Int): Unit = {
//    if (newValue < bound) _y = newValue else printWarning()
//  }
//
//  private def printWarning() = println("WARNING: Out of bounds")
//}
//
//val point1 = new Point
//point1.x = 99
//point1.y = 101 // prints the warning