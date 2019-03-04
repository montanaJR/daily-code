package org.montanajr.classes

class MyClass {
    // property (data member)
    private var name: String = "Example"

    // member function
    fun printMe() {
        print("You are at the best $name")
    }
}
class Outer {
    class Nested {
        fun foo() = "Welcome to The example"
    }

    private val welcomeMessage: String = "Welcome to the Example2"
    inner class Nested2 {
        fun foo() = welcomeMessage
    }
}

fun main(args: Array<String>) {
    val obj = MyClass() // create obj object of myClass class
    obj.printMe()

    val demo = Outer.Nested()
    println(demo.foo())


}