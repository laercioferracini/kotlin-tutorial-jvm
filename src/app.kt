/**
 * @project = kotlin-tutorial-jvm
 *
 * @author lferracini
 * @since <pre>28/02/2020</pre>
 */

fun main() {
    println("Tutorial JVM")
    val c = Calculations()
    var sum = c.sum(1, 6)
    println(sum)
    sum = c.anotherSum(3, 4)
    println(sum)
    c.printSum(5, 2)

}