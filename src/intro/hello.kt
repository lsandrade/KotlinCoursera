package intro

fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) args[0] else "kotlin"
    println("Hello, $name!")
}