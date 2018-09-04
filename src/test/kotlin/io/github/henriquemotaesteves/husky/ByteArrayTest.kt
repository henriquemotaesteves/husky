package io.github.henriquemotaesteves.husky

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ByteArrayTest {
    @Test
    fun `#byteArrayOf returns empty byte array if no numbers are specified`() {
        assertArrayEquals(ByteArray(0), byteArrayOf())
    }

    @Test
    fun `#byteArrayOf returns byte array containing each specified number converted to byte if numbers are specified`() {
        val expected = ByteArray(4)
        expected[0] = 0x00
        expected[1] = 0x7F
        expected[2] = 0x80.toByte()
        expected[3] = 0xFF.toByte()

        assertArrayEquals(expected, byteArrayOf(0x00, 0x7F, 0x80, 0xFF))
    }
}
