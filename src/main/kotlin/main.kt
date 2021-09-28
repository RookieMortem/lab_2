
import java.util.Objects


fun main(args: Array<String>) {
    cut(Objects.requireNonNull(readLine().toString()))
    sort(intArrayOf(0, 5, 8, 9, 2, 4, 1, 6))
    replace(
        Objects.requireNonNull(readLine().toString()),
        Objects.requireNonNull(readLine().toString()),
        Objects.requireNonNull(readLine().toString()))

}

private fun cut(str: String) {
    val chr = str.toCharArray()
    for (i in 0 until chr.size - 1) {
        if (chr[i] == chr[i + 1]) chr[i] = 0.toChar()
    }
    println(chr)
}

private fun sort(arr: IntArray) {
    for (i in arr.indices) {
        val value = arr[i]
        var g = i - 1
        while (g >= 0) {
            if (value < arr[g]) arr[g + 1] = arr[g] else break
            g--
        }
        arr[g + 1] = value

    }

    for (i in arr.indices) println(arr[i])

}

private fun replace(str: String, subStr: String, replace: String) {
    var stroke = str
    stroke = stroke.replace(subStr.toLowerCase().toRegex(), replace.toLowerCase())
    println(stroke)
}