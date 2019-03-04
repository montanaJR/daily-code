package org.montanajr.loops

fun main(args: Array<String>) {
    val a: Int = 5;
    val b: Int = 2;

    var max: Int;

    if(a > b){
        max = a;
    } else {
        max = b;
    }
    println("---If-else---")
    println("Max val = $max ")
    println("Max val as expression = " + if (a > b) a else b )
    println()
    println("---When---")
    var x:Int = 4

    when(x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3,4 -> print("x == 3 || x == 4")
        else -> {
            print("x is underfined")
        }
    }

    println()
    println("---For---")
    val items = listOf<Int>(1,2,3,4,5,6,7)
    for (i in items) println("values of the array = $i")
    for((index, vararg ) in items.withIndex()) {
        println("The element at $index is $vararg")
    }
    println()
    println("Example of While Loop--")
    var q:Int = 0

    while(q <= 3) {
        println(q)
        q++
    }

    var w:Int = 0
    do {
        w = w + 10
        println("I am inside Do block == $w ")
    } while(w <= 50)

    println()
    println("Return, Break, Continue")
    fun doubleMe(ww:Int):Int {
        return 2*ww
    }

    var z:Int = 10
    println("The value of X ==" +doubleMe(z))

    println()
    println("Example of Break and Continue")
    myLabel@ for(uu in 1..10) { // appling the custom label
        if(uu == 5) {
            println("I am inside if block with value  $uu \n-- hence it will close the operation")
            break@myLabel //specifing the label
        } else {
            println("I am inside else block with value $uu")
            continue@myLabel
        }
    }


}