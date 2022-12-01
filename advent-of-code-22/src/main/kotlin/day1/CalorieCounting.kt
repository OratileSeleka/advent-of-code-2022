package day1

import util.InputFileReader

class CalorieCounting: InputFileReader {

    private fun createTotalsList() : List<Int> {
        return buildList {
            var sum = 0
            input.forEach {
                if (it.isNullOrBlank()) {
                    println("Sum: $sum")
                    add(sum)
                    sum = 0
                } else {
                    sum += it.toInt()
                }
            }
        }
    }

    fun calculateMaxCalories(): Int {
        return createTotalsList().maxOf { it }
    }

    fun calculateTopThreeTotal(): Int {
        return createTotalsList().sortedByDescending { it }.take(3).sum()
    }

}