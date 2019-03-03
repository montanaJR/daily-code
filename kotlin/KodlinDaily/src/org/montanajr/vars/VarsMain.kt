package org.montanajr.vars

fun main(args: Array<String>) {
    val a: Int = 1000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1
    println("Values: $a, $d, $f, $l, $s, $b ")
    println()

    val letter: Char
    letter = 'A'
    println(letter)

    val flag : Boolean
    flag = true
    println("This is a flag equals '$flag'")


    var rawString: String = "This is a raw String"
    val escapedString: String = "This is an escaped String\n"

    println("Hello " +rawString)
    println("Hello $escapedString")

    val numbers: IntArray = intArrayOf(1,2,3,4,5,0)
    println("An Integer Array $numbers. " + numbers[5])

    val nums: MutableList<Int> = mutableListOf(1,2,3)
    val readOnlyView: List<Int> = nums
    println("Mutable list - " + nums)
    nums.add(5)
    println("Mutable list after addition - " + nums)
    println(readOnlyView)


    val i:Int  = 2
    for (j in 1..4)
        print(j) // prints "1234"

    if (i in 1..10) { // equivalent of 1 < = i && i < = 10
        println("we found your number --"+i)
    }
}