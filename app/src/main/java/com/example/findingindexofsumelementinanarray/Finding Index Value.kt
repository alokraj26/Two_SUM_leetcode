package com.example.findingindexofsumelementinanarray


fun main() {
    val arr = intArrayOf(2, 3, 4, 6, 7, 9)
    val target = 9
    findSumOfIndexValue(arr, target)?.let { (i1, i2) ->
        println("$i1,$i2")
    }
}

fun findSumOfIndexValue(arr: IntArray, target: Int): Pair<Int, Int>? {
    val map = mutableMapOf<Int, Int>()
    for (i in arr.indices) {
        val targetValue = target - arr[i]
        map[targetValue]?.let { return it to i }
        map[arr[i]]= i
    }
    return null
}
