package arrays

fun main() {
    solution(intArrayOf(1, 2, 3, 4), 4).forEach {
        println(it)
    }
    println("\n")
    solution2(intArrayOf(1, 2, 3, 4), 4).forEach {
        println(it)
    }

}

fun solution(A: IntArray, K: Int): IntArray {

    var K1 = K % A.size

    var A1 = A
    if (A.isNotEmpty()) {
        for (x in 0 until K1) {
            val last = A1.last()
            for (i in A1.size - 2 downTo 0) {
                A1[i + 1] = A1[i]
            }
            A1[0] = last
        }
    }
    return A1
}

fun solution2(A: IntArray, K: Int): IntArray {
    var K1 = K % A.size
    var data: MutableList<Int> = mutableListOf()
    var array1 = A.copyOfRange(A.size - K1, A.size)
    var array2 = A.copyOfRange(0, A.size - K1)
    data.addAll(array1.toList())
    data.addAll(array2.toList())
    return data.toIntArray()
}

