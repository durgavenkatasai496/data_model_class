package com.example.dataclasspractice.comparable

import kotlin.collections.sorted

/*
 * Comparable :
 * Every object of the data class knows how to compare itself with another object of the same class.
 */

data class ComparableMy(val name : String, val age : Int) : Comparable<ComparableMy>{
    override fun compareTo(other: ComparableMy): Int {
        return this.age - other.age
    }
}

fun main(){

    val listOf = listOf(
        ComparableMy(name = "ONE", age = 11),
        ComparableMy(name = "TWO", age = 61),
        ComparableMy(name = "THREE", age = 1),
        ComparableMy(name = "FOUR", age = 811),
        ComparableMy(name = "FIVE", age = 12)
    )

    println(listOf.sorted())

}