package prefixsum

import kotlin.system.measureTimeMillis

fun main() {
    println(solution(6, 11, 2))

    val time = measureTimeMillis {
        solution(100, 123000000, 2)

    }

}

//fun solution(A: Int, B: Int, K: Int): Int {
//    // write your code in Kotlin
//    var sumDivisible = 0
//    for (number in A..B) {
//        if (number % K == 0) {
//            sumDivisible++
//        }
//    }
//    return sumDivisible
//}

//fun solution2(A: Int, B: Int, K: Int): Int {
//    // write your code in Kotlin
//    var sumDivisible = 0
//    var numberFirst = A
//    for (number in A..B) {
//        if (number % K == 0) {
//            numberFirst = number
//            break
//        }
//    }
//    for (number in numberFirst until B step K) {
//        sumDivisible++
//    }
//    return sumDivisible
//}

fun solution(A: Int, B: Int, K: Int): Int {
    var offsetForLeftRange = 0;
    if (A % K == 0) offsetForLeftRange++
    return (B / K) - (A / K) + offsetForLeftRange
}

//public int solution(int A, int B, int K) {
//    int offsetForLeftRange = 0;
//    if ( A % K == 0) { ++offsetForLeftRange; }
//
//    return  (B/K) - (A /K) + offsetForLeftRange;
//}
