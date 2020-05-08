package stack

fun main() {

    println(solution("(()(())())"))
    println(solution("())"))
    println(solution("sk())"))
    println(solution("(())(())(())(())"))

}

private fun solution(S: String): Int {

    val stack = mutableListOf<Char>()

    if (S.length % 2 != 0) return 0

    for ((index, value) in S.withIndex()) {

        if (isOpeningBracket(value)) stack.add(value)
        else {
            if (stack.isEmpty()) return 0

            val popChar = stack.last()
            stack.removeAt(stack.lastIndex)

            if (isBracketMach(popChar, value)) continue
            else return 0
        }

    }

    if (stack.isEmpty()) return 1

    return 0
}


fun isOpeningBracket(pChar: Char): Boolean {
    if (pChar == '(') return true
    return false
}

fun isBracketMach(pC1: Char, pC2: Char): Boolean {
    if (pC1 == '(' && pC2 == ')') return true
    return false
}

