package intro

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
}

fun max (a: Int, b: Int): Int {
    return if(a>b) a else b
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}