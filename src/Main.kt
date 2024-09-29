fun main() {

    //Задача 1
    val alligator = Helicopter("Alligator", 1500, 450, 5000)
    println("Спроектировали вертолет с названием ${alligator.name}" +
            " скоростью полета ${alligator.speed} весом ${alligator.weight}" +
            " высотой полета ${alligator.maxAltitude}")

    //Задача 2
    val tomas = Pet("Томас", 4, Pet.Type.Cat)
    println("Домашнее животное: " + tomas.getType() +
        "; Кличка: " + tomas.name +
        "; Вес: " + tomas.weight)

    //Задача 3
    println(floatingPointNumberToInteger(2.4))
}

//Функции к задаче 3
fun floatingPointNumberToInteger(number: Double) = number.toInt()
fun floatingPointNumberToInteger(number: Float) = number.toInt()