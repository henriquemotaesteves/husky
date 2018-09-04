package io.github.henriquemotaesteves.husky.text.encoding

import io.github.henriquemotaesteves.husky.isEven
import io.github.henriquemotaesteves.husky.text.Encoding
import java.lang.Integer.parseInt

class HEXEncoding : Encoding {
    companion object {
        private val       CHARSET = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
        private const val RADIX   = 16
    }

    /**
     * Decodes a byte array into a hex string.
     *
     * **Example:**
     *
     * `assertEquals("076DC85647B86A86", Encoding.HEX.decode(`[byteArrayOf][io.github.henriquemotaesteves.husky.byteArrayOf]`(0x07, 0x6D, 0xC8, 0x56, 0x47, 0xB8, 0x6A, 0x86)))`
     *
     * @return
     * - hex string representing byte array if byte array is not empty.
     * - empty string if byte array is empty.
     */
    override fun decode(octets: ByteArray): String {
        return octets.fold(StringBuilder()) { s, b -> s.append(CHARSET[(b.toInt() and 0xFF) / RADIX]).append(CHARSET[(b.toInt() and 0xFF) % RADIX]) }.toString()
    }

    /**
     * Encodes a hex string into a byte array.
     *
     * **Example:**
     *
     * `assertArrayEquals(`[byteArrayOf][io.github.henriquemotaesteves.husky.byteArrayOf]`(0x07, 0x6D, 0xC8, 0x56, 0x47, 0xB8, 0x6A, 0x86), Encoding.HEX.encode("076DC85647B86A86"))`
     *
     * @return
     * - byte array represented by hex string if string contains only hex characters and has even length.
     * - empty byte array if string is empty.
     *
     * @throws
     * - [IllegalArgumentException] if string has odd length.
     * - [IllegalArgumentException] if string contains non-hex characters.
     */
    override fun encode(string: String): ByteArray {
        require(string.length.isEven()) { "String cannot have odd length: '${string.length}'." }

        try {
            return ByteArray(string.length / 2, { i -> parseInt(string.substring(i * 2, i * 2 + 2), RADIX).toByte() })
        } catch (ex: IllegalArgumentException) {
            throw IllegalArgumentException("String has invalid character(s): '$string'.", ex);
        }
    }
}
