package coverage.delegates


class DelegatedList : List<Int> by ArrayList() {
    // Overridden method that should be shown as "not covered"
    override val size: Int
        get() = 42
}

