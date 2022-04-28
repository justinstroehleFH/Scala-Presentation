5.+(3)

val value = 5
//value = 6 //will not compile

var variable = 5
//variable = 2 //will compile

var u: Unit = ()

val addOne = (x: Int) => x + 1
val list: List[Any] = List(
  "a string",
  732,  // an integer
  'c',  // a character
  true, // a boolean value
  addOne
)

//casting
val x: Long = 987654321
val y: Float = x  // 9.8765434E8 (note that some precision is lost in this case)

val c: Char = 'A'
val number: Int = c  // 65
