fun main() {

    // ===== Task 1 : calculs numériques =====
    val result1 = 123 + 456 * 789
    val result2 = 1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9
    val result3 = (1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9
    val result4 = 13530.0 / 1.23

    println(result1)
    println(result2)
    println(result3)
    println(result4)

    // ===== Task 2 : calculs avec variables =====
    val levelOneScore = 79
    val levelTwoScore = 92
    val levelThreeScore = 86

    val total = levelOneScore + levelTwoScore + levelThreeScore

    // Moyenne entière
    val averageInt = total / 3

    // Moyenne flottante
    val averageDouble = total / 3.0

    println("Total score = $total")
    println("Average (Int) = $averageInt")
    println("Average (Double) = %.2f".format(averageDouble))

    // ===== Task 3 : bonus =====
    val multiplier = 4
    val bonus = total * multiplier
    val finalScore = total + bonus

    println("Score boost = $bonus")
    println("Final boosted score = $finalScore")
}
