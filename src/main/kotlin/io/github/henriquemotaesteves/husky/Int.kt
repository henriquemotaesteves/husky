package io.github.henriquemotaesteves.husky

/**
 * Indicates whether an integer is even.
 *
 * **Example**
 *
 * `assertTrue(2.isEven())`
 *
 * `assertTrue((-2).isEven())`
 *
 * `assertTrue(0.isEven())`
 *
 * @return
 * - true if integer is positive and even.
 * - true if integer is negative and even.
 * - true if integer is 0.
 */
fun Int.isEven() = this % 2 == 0

/**
 * Indicates whether an integer is odd.
 *
 * **Example**
 *
 * `assertTrue(1.isOdd())`
 *
 * `assertTrue((-1).isOdd())`
 *
 * @return
 * - true if integer is positive and odd.
 * - true if integer is negative and odd.
 * - false if integer is 0.
 */
fun Int.isOdd() = this.isEven().not()
