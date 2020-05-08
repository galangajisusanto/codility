package stack

import java.util.Stack

fun main() {
    println(solution(intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8)))
}

fun solution(H: IntArray): Int {
    var blockCount = 0
    var stack = Stack<Int>()

    for (value in H) {

        while (stack.isNotEmpty() && stack.peek() > value) stack.pop()

        if (stack.isNotEmpty() && stack.peek() == value) continue
        else {
            blockCount++
            stack.add(value)
        }
    }
    return blockCount
}

