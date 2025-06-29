package com.example.dataclasspractice

import com.example.dataclasspractice.modelclass.UserData
import com.google.gson.Gson

/*
 * ✅ What is Gson?
 * Gson is a JSON library provided by Google.
 * It allows conversion between Kotlin/Java objects and JSON format.
 * JSON (JavaScript Object Notation) is a lightweight data format commonly used for transmitting data in web APIs.
 *
 * ✅ What is toJson()?
 * The toJson() function is used to serialize a Kotlin/Java object into a JSON-formatted string.
 * This is useful when sending data to a server or storing it locally in a readable format.
 *
 * ✅ What is fromJson()?
 * The fromJson() function is used to deserialize a JSON string back into a Kotlin/Java object.
 * This is helpful when you receive JSON data (e.g., from an API) and want to work with it as a typed object.
 */

fun gsonChecking(){

    val gson = Gson()

    var json : String = gson.toJson(UserData(name = "ONE", age = 22, mobileNumber = 99))

    println(json)

    val user : UserData = gson.fromJson(json, UserData::class.java)
    println(user)

}

