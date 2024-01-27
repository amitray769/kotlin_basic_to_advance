fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val testSet = setOfMy<Int>()
}

public fun <T> setOfMy(vararg elements: T): Set<T> = if (elements.size > 0) elements.toSet() else emptySet()

