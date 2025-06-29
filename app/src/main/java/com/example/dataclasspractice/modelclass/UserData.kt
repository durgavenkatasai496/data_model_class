package com.example.dataclasspractice.modelclass

import com.google.gson.Gson

/**
 * ✅ What is a Data Class in Kotlin?
 *
 * A data class is a special type of class in Kotlin designed to hold and manage data.
 * It automatically generates commonly used functions such as:
 *   - toString()     → Gives a readable string output of the object
 *   - equals()       → Checks if two objects have same content
 *   - hashCode()     → Returns a hash code based on content
 *   - copy()         → to create copies with modified values
 *   - componentN()   → to support destructuring declarations or Each Property
 *
 * ✅ Requirements for a Data Class:
 *   - Must have at least one parameter in the primary constructor
 *   - All primary constructor parameters must be marked with `val` or `var`
 *   - Cannot be abstract, open, sealed, or inner (i.e., final by default)
 *
 * ✅ Use Case:
 *   - Ideal for representing simple data structures like User, Product, Response, etc.
 *   - Commonly used in model layers, APIs, and data transfer objects (DTOs)
 *
 * ✅ Example:
 */
data class UserData(val name: String, val age: Int, val mobileNumber: Int)

/*
 * Why Use The Data Class :
 * Using data saves time and reduces code when you're just storing and passing data.
 */

fun main(){

//    gsonChecking()


}

fun modelClassPractice(){
    var namesAdd = UserData(name = "ONE", age = 22, mobileNumber = 99)
    var namesAdd1 = UserData(name = "TWO", age = 21, mobileNumber = 99)

    // toString() : for Readable
    println(namesAdd)

    //Equals
    println(namesAdd == namesAdd1)

    //hasCode()
    println(namesAdd.hashCode())

    //Copy
    val updatedUser =  namesAdd.copy(name = "UpdatedName")
    println(updatedUser)

    //Component
    println(namesAdd1.component1())

}


