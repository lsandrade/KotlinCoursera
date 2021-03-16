package intro

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    println(s1.isEmptyOrNull() eq true)
    println(s2.isEmptyOrNull() eq true)

    val s3 = "   "
    println(s3.isEmptyOrNull() eq false)
}

private infix fun Boolean.eq(b: Boolean) = this == b

private fun String?.isEmptyOrNull(): Boolean = this == "" || this == null
