package intro

fun List<Int>.allNonZero() =  all { it != 0 }
fun List<Int>.allNonZero1() =  none { it == 0 }
fun List<Int>.allNonZero2() =  !any { it == 0 }

fun List<Int>.containsZero() =  any { it == 0 }
fun List<Int>.containsZero1() =  !all { it != 0 }
fun List<Int>.containsZero2() =  !none { it == 0 }

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3)
    println(list1.allNonZero1() eq true)
    println(list1.allNonZero2() eq true)

    println(list1.containsZero() eq false)
    println(list1.containsZero1() eq false)
    println(list1.containsZero2() eq false)

    val list2 = listOf(0, 1, 2)
    println(list2.allNonZero() eq false)
    println(list2.allNonZero1() eq false)
    println(list2.allNonZero2() eq false)

    println(list2.containsZero() eq true)
    println(list2.containsZero1() eq true)
    println(list2.containsZero2() eq true)
}
