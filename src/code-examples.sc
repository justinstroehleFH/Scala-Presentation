// Pattern Matching


// Lambda expressions
val a = List(10, 20, 30, 40, 10)
a.filter((i: Int) => i < 25)
a.filter((i) => i < 25)
a.filter(i => i < 25)
a.filter( _ < 25)

// Differences Scala and Java
/*
List<String> list = new ArrayList<String>();
list.add("1");
list.add("2");
list.add("3");
*/
val list = List("1", "2", "3");