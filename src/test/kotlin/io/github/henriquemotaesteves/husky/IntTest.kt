package io.github.henriquemotaesteves.husky

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IntTest {
    @Test
    fun `#isEven returns true if integer is 0`() {
        assertTrue(0.isEven())
    }

    @Test
    fun `#isEven returns true if integer is positive and even`() {
        assertTrue(2.isEven())
    }

    @Test
    fun `#isEven returns true if integer is negative and even`() {
        assertTrue((-2).isEven())
    }

    @Test
    fun `#isEven returns false if integer is positive and odd`() {
        assertFalse(1.isEven())
    }

    @Test
    fun `#isEven returns false if integer is negative and odd`() {
        assertFalse((-1).isEven())
    }

    @Test
    fun `#isOdd returns true if integer is positive and odd`() {
        assertTrue(1.isOdd())
    }

    @Test
    fun `#isOdd returns true if integer is negative and odd`() {
        assertTrue((-1).isOdd())
    }

    @Test
    fun `#isOdd returns false if integer is 0`() {
        assertFalse(0.isOdd())
    }

    @Test
    fun `#isOdd returns false if integer is positive and even`() {
        assertFalse(2.isOdd())
    }

    @Test
    fun `#isOdd returns false if integer is negative and even`() {
        assertFalse((-2).isOdd())
    }
}
