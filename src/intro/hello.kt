package intro

import javax.print.attribute.IntegerSyntax

fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) args[0] else "kotlin"
    println("Hello, $name!")

    // variables. val = imutable. var = mutable
    var number : Int = 0
    number = 1
    println("Number: $number")

    // cant
    val list = listOf("Java")
    //list.add()

    // can
    val list2 = mutableListOf("Java")
    list2.add("Kotlin")

    val maxValue = max(10, 20)
    println("Maior: $maxValue")

    println(listOf('a', 'b', 'c').joinToString(separator = ",", prefix = "(", postfix = ")"))

    displaySeparator()

    displaySeparator('a', 5)

    displaySeparator(size = 7, character = 'b')

    println(getDescription(Color.BLUE))

    helloWorldWithFor()

    forWithIndex(listOf("A", "B", "C"))

    countTo(11)

    println(isValidIdentifier("name") == true)   // true
    println(isValidIdentifier("_name") == true)  // true
    println(isValidIdentifier("_12") == true)    // true
    println(isValidIdentifier("") == false)       // false
    println(isValidIdentifier("012") == false)    // false
    println(isValidIdentifier("no$") == false)    // false
}

fun isValidIdentifier(s: String): Boolean {

    fun isValidChar(ch: Char) =
        ch.isLetterOrDigit() || ch == '_'

    if (s.isEmpty() || s[0].isDigit()) return false

    for (c in s) {
        if (!isValidChar(c)) return false
    }

    return true
}

fun max (a: Int, b: Int): Int {
    return if(a>b) a else b
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

enum class Color {
    BLUE, ORANGE, RED
}

fun getDescription(color: Color): String =
    when(color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
        else -> "I don't know"
    }

fun helloWorldWithFor() {
    for (s in "Hello World") {
        println(s)
    }
}

fun forWithIndex(list: List<String>) {
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

fun countTo(j: Int) {
    for (i in 1..j) {
        print(i)
    }
}