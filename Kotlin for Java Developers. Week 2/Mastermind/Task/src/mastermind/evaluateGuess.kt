package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    fun rightPosition(s: Char, g: Char) = s == g
    fun wrongPosition(g: Char, s: String) = g in s
    fun replaceCharAtPosition(s: String, i: Int): String = s.substring(0, i) + '*' + s.substring(i+1)
    fun getIndexOfFirstChar(s: String, c: Char): Int = s.indexOfFirst { it == c }

    var rp = 0
    var wp = 0
    var s = secret
    var g = guess

    guess.forEachIndexed { index, c ->
        if (rightPosition(s[index], c)) {
            rp += 1
            s = replaceCharAtPosition(s, index)
            g = replaceCharAtPosition(g, index)
        }
    }

    g.forEachIndexed { index, c ->
        if (!rightPosition(c, s[index]) && wrongPosition(c, s)) {
            wp += 1
            s = replaceCharAtPosition(s, getIndexOfFirstChar(s, c))
        }
    }

    return Evaluation(rp, wp)
}
