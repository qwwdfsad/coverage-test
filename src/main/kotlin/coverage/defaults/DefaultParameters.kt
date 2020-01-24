package coverage.defaults


fun withDefaultParameters(i: Int = 1, k: Int = compute(), l: Int = (k + i).also { println("") }) {
    println("")
}

fun withDefaultParameters2(i: Int = 1, k: Int = compute(), l: Int = (k + i).also { println("") }) {
    println("")
}

fun compute(): Int {
    return 42
}
