package primitiveTypes


fun main() {
    val orderId = "OD12"
    //println(orderId.dropLast(5))
    //println(orderId.takeLast(5))


   // test(8)
    test(null)

}

fun test(d : Int?): Unit {

    val discounts = if (d!=null && d!= 0) getInt( d) else null
    println(discounts)
}

private fun getInt(d : Int) = d