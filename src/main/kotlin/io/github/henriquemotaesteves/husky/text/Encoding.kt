package io.github.henriquemotaesteves.husky.text

import io.github.henriquemotaesteves.husky.text.encoding.HEXEncoding

interface Encoding {
    companion object {
        val HEX = HEXEncoding()
    }

    fun decode(octets: ByteArray): String

    fun encode(string: String): ByteArray
}
