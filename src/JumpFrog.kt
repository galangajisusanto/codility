fun main(){

    println(solution(5, intArrayOf(1,3,1,4,2,3,5,4)))
}

private fun solution(X: Int, A: IntArray): Int {
    return if(X in 1..100000) A.indexOf(X)
    else -1
}
