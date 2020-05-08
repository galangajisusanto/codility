package prefixsum

fun main() {
    println(solution("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)).joinToString(","))

//    var array = "CAGCCTA".toCharArray()
//    var copy = array.copyOfRange(0, 6 + 1)
//    println(copy.joinToString(", "))
}

fun solution(S: String, P: IntArray, Q: IntArray): IntArray {

    val impactFactor = mutableListOf<Int>()

    val dnaMap = mapOf<Char, Int>('A' to 1, 'C' to 2, 'G' to 3, 'T' to 4)

    for (index in P.indices) {
        val dnaCopy = S.toCharArray().copyOfRange(P[index], Q[index] + 1).sorted()
        val firstDna = dnaCopy.first()
        dnaMap[firstDna]?.let { impactFactor.add(it) }
    }
    return impactFactor.toIntArray()
}

