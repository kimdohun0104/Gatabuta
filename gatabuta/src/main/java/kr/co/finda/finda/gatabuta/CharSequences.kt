package kr.co.finda.finda.gatabuta

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.fail

suspend fun <T : CharSequence> LiveDataTest<T>.isBlank() {
    if (value()?.isNotBlank() == true) {
        fail("")
    }
}

suspend infix fun <T : CharSequence> LiveDataTest<T>.hasLength(expected: Int?) {
    assertEquals(expected, value()?.length)
}

suspend fun <T : CharSequence> LiveDataTest<T>.isEmpty() {
    if (value()?.isNotEmpty() == true) {
        fail("")
    }
}
