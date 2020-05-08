package stack

fun main() {
    println(solution(intArrayOf(4, 3, 2, 1, 5), intArrayOf(0, 1, 0, 0, 0)))
}

private fun solution(A: IntArray, B: IntArray): Int {
    if (A == null || B == null || A.size != B.size) {
        return -1;
    }

    val downStream = mutableListOf<Int>()
    var alive = 0

    for (index in A.indices) {
        if (B[index] == 0) {
            while (downStream.isNotEmpty()) {
                if (downStream.last() < A[index]) downStream.removeAt(downStream.size - 1)
                else break
            }
            if (downStream.isEmpty()) alive++
        } else {
            downStream.add(A[index])
        }
    }
    return alive + downStream.size
}

