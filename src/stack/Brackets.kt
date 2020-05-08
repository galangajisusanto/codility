package stack

fun main() {
println(solution("{[()()]}"))
println(solution("([)()]"))
}

private fun solution(S: String): Int {

    val stack = mutableListOf<Char>()

    val openBracket1 = '{'
    val openBracket2 = '('
    val openBracket3 = '['

    for (char in S) {
        if (char == openBracket1 || char == openBracket2 || char == openBracket3) {
            stack.add(char)
        } else {
            if (stack.size == 0) return 0
            val last = stack.last()
            stack.removeAt(stack.size - 1)
            if (!isValid(last, char)) return 0
        }
    }
    if (stack.size != 0) return 0
    return 1
}

fun isValid(left: Char, right: Char): Boolean {
    if (left == '(' && right == ')') return true
    if (left == '[' && right == ']') return true
    if (left == '{' && right == '}') return true
    return false
}




