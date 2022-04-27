case class Point(x: Int, y: Int)

val point = Point(1, 2)
val anotherPoint = Point(1, 2)
val yetAnotherPoint = Point(2, 2)

if (point == anotherPoint) {
  println(s"$point and $anotherPoint are the same.")
} else {
  println(s"$point and $anotherPoint are different.")
}

if (point == yetAnotherPoint) {
  println(s"$point and $yetAnotherPoint are the same.")
} else {
  println(s"$point and $yetAnotherPoint are different.")
}