package coverage.delegates

import org.junit.*

class DelegatedListTest {

    @Test
    fun testDelegationCoverage() {
        DelegatedList().contains(2)
    }
}
