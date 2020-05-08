package interation

fun main() {

    println(solution(9))
    println(solution(529))
    println(solution(51272))
    println(solution(15))
    println(solution(53))
    println(solution(2147483647))
    println(solution(0))
    println(solution(-1))

}

fun solution(N: Int): Int {
    // Tests if our value is an integer
    if (N is Int && N >= 1 && N <= 2147483647) {

        val binary = N.toString(2)
        val binaryArray = binary.toList()
        // finding the first one via its index

        return getGaps(binaryArray, mutableListOf())
    }


    // default if it doesn't meet the requirements
    return 0
}

fun getGaps(binaryArray: List<Char>, gaps: MutableList<Int>): Int {
    val firstOne = binaryArray.indexOf('1')

    if (firstOne > -1) {
        // new array created taking a slice of original array
        // from the index of the firstOne + 1 index
        var newBinaryArray = binaryArray.subList(firstOne + 1, binaryArray.size)
        // finding second one via its index in new array slice
        val secondOne = newBinaryArray.indexOf('1'); // 2
        if (secondOne > 0) {
            gaps.add(secondOne)
        }

        // Pass array minus second one and gaps array
        return getGaps(newBinaryArray.subList(secondOne + 1, newBinaryArray.size), gaps);
    }
    return if (gaps.size > 0) {
        gaps.max() ?: 0
    } else {
        0;
    }


}