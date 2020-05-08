package arrays

fun main() {


    println(solution(A = intArrayOf(9, 3, 9, 3, 9, 7, 9)))
}

fun solution(A: IntArray): Int {
    var unpairNumber = 0

    if (A.isNotEmpty()) {
        val mapData = mutableMapOf<Int, Int>()

        for (number in A) {
            mapData[number] = (mapData[number] ?: 0) + 1
        }

        mapData.forEach { (key, value) ->
            if (value % 2 == 1) {
                unpairNumber = key
            }
        }
    }

    return unpairNumber
}

