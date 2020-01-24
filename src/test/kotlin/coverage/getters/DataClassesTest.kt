package coverage.getters

import org.junit.*
import org.junit.Assert.*

class DataClassesTest {

    @Test
    fun testDataClasses() {
        println(DataClass(1, 2))
        println(ImplicitGetter())
        println(ExplicitGetter())
    }
}
