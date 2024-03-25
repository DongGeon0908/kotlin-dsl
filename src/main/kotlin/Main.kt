fun main(args: Array<String>) {
    testPrint {
        2.plus()
    }
}

private fun Int.plus(): Int {
    return this + 1
}

fun <T> testPrint(block: () -> T): T {
    val a = block.invoke()

    println(a)

    return a
}
