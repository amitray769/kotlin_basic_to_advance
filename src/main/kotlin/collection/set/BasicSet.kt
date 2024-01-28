package collection.set

/**
*
 * Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
 * To create a read-only set (Set), use the setOf() function.
 * To create a mutable set (MutableSet), use the mutableSetOf() function.
**/

private fun createASet()  {
    val readOnlySet = setOf("apple", "banana","cherry")
    println(readOnlySet)

    val mutableSet = mutableSetOf("apple", "banana","cherry")
    //Trying to add a duplicate element
    mutableSet.add("apple") //element will not be duplicated
    mutableSet.add("guava")
    println(mutableSet)

}

fun main() {
createASet()
}