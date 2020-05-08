package demo

fun main() {

    println(solution(intArrayOf(1, 3, 6, 4, 1, 2)))
    println(solution(intArrayOf(1, 2, 3)))
    println(solution(intArrayOf(-1, -3)))
}

fun solution(A: IntArray): Int {

    var sortingArray = A.distinct().filter { it > 0 }.sorted()
    var i = 1
    for (x in sortingArray) {
        if (x != i) return i
        else i = x + 1
    }
    return i
}
