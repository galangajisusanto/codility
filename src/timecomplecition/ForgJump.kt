package timecomplecition

fun main() {
println(solution(10,85,30))
}

fun solution(X: Int, Y: Int, D: Int): Int {
    val distance = Y - X
    var jump = distance / D
    println(jump)
    var overJump = distance % D;
    println(overJump)
    if (overJump > 0) {
        jump++
    }
    return jump
}