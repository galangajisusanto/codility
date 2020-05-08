package timecomplecition

import java.lang.reflect.Array
import java.util.ArrayList

fun main() {
    println(solution(intArrayOf(2, 5, 1, 4,6)))
}

private fun solution(A: IntArray): Int {
    val size = A.size
    var missing = 0;
    val maps = mutableMapOf<Int, Int>()

    for (x in A) {
        maps[x] = 1
    }

    for (x in 1..size + 1) {
        if (maps[x] == null) {
            missing = x
        }
    }
    return missing
}

