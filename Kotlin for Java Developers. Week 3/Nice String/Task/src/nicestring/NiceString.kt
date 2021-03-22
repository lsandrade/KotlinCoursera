package nicestring

fun String.isNice(): Boolean {
    return listOf(!this.containsBuBaBe(),
            this.containsVowels(),
            this.containsDoubleLetter())
            .count { it } > 1
}


fun String.containsBuBaBe() = listOf("bu", "ba", "be").any { this.contains(it) }

fun String.containsVowels() = this.count { setOf('a','e','i','o','u').contains(it) } > 2

fun String.containsDoubleLetter(): Boolean {
    val letters = this.toSet()
    val doubleLetters = letters.map { it + "" + it }
    return doubleLetters.any { this.contains(it) }
}
