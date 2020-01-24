package coverage.getters


data class DataClass(val x: Int, val y: Int)

class ImplicitGetter {
    var x: Int = 42
}

class ExplicitGetter() {
    var x: Int = 42
        get() = field
        set(value) {
            field = value
        }
}

