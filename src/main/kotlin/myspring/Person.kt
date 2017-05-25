package myspring

import kotlin.properties.Delegates

data class Person(val name: String, val age: Int) {
    val weightChanges = mutableListOf<Double>()

    var weight: Double by Delegates.observable(0.0) {
        _, _, new ->
        weightChanges.add(new)
    }

    fun isMature(): Boolean {
        return age >= 18
    }
}