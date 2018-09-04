package io.github.henriquemotaesteves.husky

/**
 * Creates a byte array of numbers converted to byte
 *
 * @return
 * - byte array containing each specified number converted to byte if numbers are specified.
 * - empty byte array if no numbers are specified.
 */
fun byteArrayOf(vararg numbers: Number) = ByteArray(numbers.size, { i -> numbers[i].toByte() })
