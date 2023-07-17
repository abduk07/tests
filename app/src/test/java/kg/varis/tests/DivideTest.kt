package kg.varis.tests

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class DivideTests {

    var divide: kg.varis.tests.Divide? = null

    @Before
    fun init() {
        divide = Divide()
    }

    @Test
    fun divide() {
        assertEquals("5", divide?.divide("10", "2"))
    }

    @Test
    fun divideZero() {
        assertEquals("Нельзя делить на ноль (0)", divide?.divide("10", "0"))
    }

    @After
    fun detach() {
        divide = null
    }
}