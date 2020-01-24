package coverage.defaults

import org.junit.*

class DefaultParametersTest {

    @Test
    fun testDefaultParametersCovered() {
        withDefaultParameters(1)
    }

    @Test
    fun withDefaultParametersCovered() {
        withDefaultParameters2(1, 2, 3)
    }
}
