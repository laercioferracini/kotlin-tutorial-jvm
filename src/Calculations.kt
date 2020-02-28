/**
 * @project = kotlin-tutorial-jvm
 *
 * @author lferracini
 * @since <pre>28/02/2020</pre>
 */
class Calculations {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun anotherSum(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int) {
        println("Sum of $a and $b is ${a + b}")
    }

    fun minus(a: Int, b: Int) = a - b
}