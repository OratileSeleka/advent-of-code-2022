import day1.CalorieCounting

fun main(args: Array<String>) {
    val calorieCounting = CalorieCounting()

    println("Max is : ${calorieCounting.calculateMaxCalories()}")
    println("Top Three Max is : ${calorieCounting.calculateTopThreeTotal()}")
}