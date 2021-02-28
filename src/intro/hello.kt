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
}