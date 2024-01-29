package collection.map
/**
*
 * Maps store items as key-value pairs. You access the value by referencing the key. You can imagine a map like a
 * food menu. You can find the price (value), by finding the food (key) you want to eat. Maps are useful
 * if you want to look up a value without using a numbered index, like in a list.
 *
 * Every key in a map must be unique so that Kotlin can understand which value you want to get.
 * You can have duplicate values in a map.
**/

private fun createAMap(): Unit {
val readOnlyJuiceMap = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMap)

    val mutableMap = mutableMapOf<String,Int>("apple" to 100, "kiwi" to 190, "orange" to 100)
    mutableMap.put("kinu",200)
    mutableMap["chiku"] = 300
    println(mutableMap)
}



fun main() {
createAMap()
}
