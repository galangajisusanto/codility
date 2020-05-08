package timecomplecition

import kotlin.math.abs

fun main() {
    println(solution(intArrayOf(3, 1, 2, 4, 3)))
}

private fun solution(A: IntArray): Int {

    val dataDeference = mutableListOf<Int>()

    for (x in 1 until A.size) {

        val deference = A.copyOfRange(0, x).sum() - A.copyOfRange(x, A.size).sum()
        dataDeference.add(abs(deference))
    }
    return dataDeference.min() ?: 0
}

