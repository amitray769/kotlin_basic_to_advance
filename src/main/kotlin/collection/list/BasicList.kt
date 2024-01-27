package collection.list

/**
 *List store items in the order that they are added and allow for duplicate items.
 **/

//To prevent unwanted modifications, you can obtain read-only views of mutable lists by assigning them to a List, This is also called casting
val _shapes = mutableListOf("triangle", "circle", "pentagon")
val shapesLocked = _shapes
fun main() {
    createAList()
    checkItemPresent()
}

private fun createAList() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    val shapes = mutableListOf<String>("triangle", "square", "circle")
    println(shapes)

    //adding in the mutableList
    shapes.add("hexagon")
    println(shapes)

    /**
     *.first() and .last() functions are examples of extension functions.
     *  To call an extension function on an object, write the function name after the object appended with a period .
     **/
    println(shapes.first())
    println(shapes.last())
    println(shapes.count())

}

private fun checkItemPresent() {
    val list = listOf("triangle", "square", "circle")
    println("circle" in list)
}