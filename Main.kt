import java.lang.Exception
import java.lang.IllegalStateException
import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    // Sayfa 9
    print("Sayfa 9: Hello world\n")
    println("Sayfa 9: ${123}")
    println("Sayfa 9: ${321}")

    // Sayfa 10
    println("Sayfa 10: ${multiply1(10, 4)}")
    println("Sayfa 10: ${multiply2(6, 6)}")
    printMultiply(2, 50)

    // Sayfa 11
    val x = 12
    val y: Int
    var z = 25
    y = 44
    println("Sayfa 11: x = $x and y = $y are val in kotlin ")
    println("Sayfa 11: z = $z is var in kotlin")
    z = decrement(num = z, decBy = 1)
    println("Sayfa 11: z is decremented by 1 and new value is $z")

    // Sayfa 12
    val box1 = Box(10, 2)
    println("Sayfa 12: Height of Box is ${box1.height} and Width of Box is ${box1.width}")

    // Sayfa 13
    print("Sayfa 13: ")
    val phone = Phone("Samsung")
    phone.turnOff()

    // Sayfa 14
    val page = 14
    val pageString = "Sayfa 14: Page is $page"
    println(pageString)
    println(pageString.uppercase())

    // Sayfa 15
    fun isEqual(a: Int, b: Int) = a == b
    println("Sayfa 15: 10 and 42 ${if(isEqual(10, 42)) "is" else "is not"} equal")

    // Sayfa 16
    val names = listOf<String>("Ertuğrul", "Haluk", "Ahmet", "Ayşe")
    print("Sayfa 16: Names with for loop1 are ")
    for (name in names){
        print("$name ")
    }
    print("\nSayfa 16: Names with for loop2 are ")
    for (i in names.indices){
        print("${names[i]} ")
    }

    // Sayfa 17
    print("\nSayfa 17: Names with while loop are ")
    var index = 0
    while (index < names.size){
        print("${names[index]} ")
        index++
    }

    // Sayfa 18
    fun daysOfWeek(index: Int): String =
        when(index){
            1-> "Monday"
            2-> "Tuesday"
            3-> "Wednesday"
            4-> "Thursday"
            5-> "Friday"
            6-> "Saturday"
            7-> "Sunday"
            else -> "Unknown"
        }
    println("\nSayfa 18: 5. day of week is ${daysOfWeek(5)}")

    // Sayfa 19
    print("Sayfa 19: ")
    for (i in 0..5){
        print("$i ")
    }

    print("\nSayfa 19: ")
    for (i in 10 downTo 2 step 3){
        print("$i ")
    }

    print("\nSayfa 19: ")
    for (i in 40 until  45){
        print("$i ")
    }
    println()

    // Sayfa 20
    print("Sayfa 20: Filtering even numbers and multiply with 2 and results are ")
    val numbers = listOf<Int>(4, 2, 6, 20, 42, 15, 6, 0, 77, 43, 99, 58, 7)
    numbers.filter {num->
        num % 2 == 0 // filtering even nums
    }.map {
        it * 2
    }.forEach {
        print("$it ")
    }

    println()
    // Sayfa 21
    var age: Int? = 24
    age?.let {
        println("Sayfa 21: My age is $it")
    }

    // Sayfa 22
    println("Sayfa 22: ${splitString("I am learning kotlin :)")}")
    println("Sayfa 22: ${splitString("")}")
    println("Sayfa 22: ${splitString("              ")}")

    // Sayfa 23-36
    /*
        Bu sayfa aralığında adlandırma kuralları anlatılmaktadır.
        Bu ödev boyunca bu kurallara dikkat edilmiştir.
     */

    // Sayfa 37
    val myDoctor = Doctor(
        name = "Ertugrul",
        age = 24,
        department = MedicalFields.CARDIOLOGIST,
        email = "ertugrul.sengul00@gmail.com"
    )
    println("Sayfa 37: Doctor -> name: ${myDoctor.name}, age: ${myDoctor.age}, department: ${myDoctor.department}, email: ${myDoctor.email}")

    // Sayfa 38
    print("Sayfa 38: ")
    printDoctorInfo()
    println()

    print("Sayfa 38: ")
    printDoctorInfo(myDoctor)
    println()

    // Sayfa 39
    val animals = listOf<String>("Cat", "Dog", "Elephant", "Monkey", "Fish", "Eagle", "Moose")
    println("Sayfa 39: Animals start with \"e\": ${animals.filter { animal-> animal.startsWith("E")}}") // long
    println("Sayfa 39: Animals start with \"m\": ${animals.filter { it.startsWith("M")}}") // short

    // Sayfa 40
    if ("Dog" in animals)
        println("Sayfa 40: There is a dog in my Zoo :)")
    else
        println("Sayfa 40: There is no dog in my Zoo :(")

    // Sayfa 41
    println("Sayfa 41: ${getParameterType(20)} ")

    // Sayfa 42
    val readOnlyList = listOf<Int>(4, 2, 6, 1, 42, 30)
    // readOnlyList[2] = 10 is not allowed
    println("Sayfa 42: value in 3th index is ${readOnlyList[3]}")

    // Sayfa 43
    val weeksMap = mapOf<Int, String>(
        1 to "Monday",
        2 to "Tuesday",
        3 to "Wednesday",
        4 to "Thursday",
        5 to "Friday",
        6 to "Saturday",
        7 to "Sunday",
    )
    println("Sayfa 43: 6th day of week is ${weeksMap[6]}")

    // Sayfa 44
    print("Sayfa 44: Days of week are ")
    for ((key, value) in weeksMap){
        print("$key->$value ")
    }
    println()

    // Sayfa 45
    val temperature: Float by lazy {
        println("Sayfa 45: Temperature initialized")
        9.2f
    }
    println("Sayfa 45: temperature is $temperature")

    // Sayfa 46
    val myNum = 20
    println("Sayfa 46: Multiply 20 with random number and result is ${myNum.multiplyByRandom()}")

    // Sayfa 47
    println("Sayfa 47: Divide 10.2 by 2.3 = ${MathOperations.divide(10.2f, 2.3f)}")

    // Sayfa 48
    val car : Car = Mercedes()
    println("Sayfa 48: Car model is ${car.model}")

    // Sayfa 49-50
    var myStr: String? = "Hello"
    println("Sayfa 49: My string is ${myStr?.let { it }}")
    myStr = null
    println("Sayfa 50: My string is ${myStr?.let { it } ?: run { "null" }}")

    // Sayfa 51
    val doctors = listOf<Doctor?>(myDoctor, null)
    // This line throws exception
    // val doctor = doctors[1] ?: throw IllegalStateException("Doctor is null")

    // Sayfa 52
    val firstDoctor = doctors.firstOrNull()
    println("Sayfa 52: My first doctor name is ${firstDoctor?.let { it.name } ?: "Doctor is null"}")

    // Sayfa 53
    firstDoctor?.let {
        println("Sayfa 53: Doctor is not null")
    }

    // Sayfa 54
    print("Sayfa 54: ")
    firstDoctor?.let {
        printDoctorInfo(it)
    }?: "Doctor is null"
    println()

    // Sayfa 55
    print("Sayfa 55: ")
    println(getParameterType("Getir"))

    //Sayfa 56
    val doctor = try {
        doctors[1] ?: throw IllegalStateException("Doctor is null")
    }catch (e: Exception){
        println("Sayfa 56: ${e.localizedMessage}")
        null
    }

    // Sayfa 58
    val str = ""
    val strLength = if (str.length == 0){
        "Length is 0"
    }else {
        "String length is ${str.length}"
    }
    println("Sayfa 57: $strLength")

    // Sayfa 59
    val newDoctor = createDoctor("Ahmet", 26, MedicalFields.NEUROLOGIST)
    println("Sayfa 59: New doctor email-> ${newDoctor.email}")

    // Sayfa 60
    println("Sayfa 60: PI number is ${getPI()}")

    // Sayfa 61
    val mario = Mario()
    print("Sayfa 61: ")
    with(mario){
        move()
        jump()
        onDie()
    }
    println()

    // Sayfa 62
    mario.apply {
        this.xPos = 10
        this.yPos = 20
    }
    println("Sayfa 62: Mario x position = ${mario.xPos}  y position = ${mario.yPos}")

    // Sayfa 64
    print("Sayfa 64: ")
    printValue("Mario is death now :(")

    // Sayfa 65
    print("Sayfa 65: ")
    val newMario = mario.also {
        it.respawn()
    }

    // Sayfa 66
    // todo örneği mario classının içinde yapılmıştır

    // Sayfa 67
    var s = "Getir Bir Mutluluk"

    var default = replaceSpace(s)
    println("Sayfa 67: $default")
    var withAst = replaceSpace(s, '*')
    println("Sayfa 67: $withAst")

    // Sayfa 68
    println("Sayfa 68: ${5 powerOf 2}")

    // Sayfa 69
    mario + 4
    println("Sayfa 69: Mario current x position ${mario.xPos}")

    // Sayfa 70
    print("Sayfa 70: Values are: ")
    printValues(3, 4, 2, 2, 1, 2 )
    println()

    // Sayfa 71
    val myName = "Ertugrul" // Immutable
    var myAge = 24  // Mutable
    println("Sayfa 71: My name is $myName and my age after 1 year will be ${myAge+1}")

    // Sayfa 72
    print("Sayfa 72: ")

    val myMario1: Mario = Mario()
    val myMario2: Mario? = null

    myMario1.let { print("Mario 1 cant be null. ") }

    myMario2?.let {
        print("Mario 2 is not null. ")
    } ?: print("Mario 2 is null.")
    println()

    // Sayfa 73
    println("Sayfa 73: ${startGame(myMario2)}")

    // Sayfa 74
    val zoo = Zoo("Happy Zoo")
    println("Sayfa 74: Zoo name is ${zoo.name}.")

    // Sayfa 75
    val firstNode = Node(6)
    println("Sayfa 75: Item in my first node is ${firstNode.item}")

    // Sayfa 76
    print("Sayfa 76: Next node of first node is ")
    printValue(firstNode.next)

    // Sayfa 77-78-79
    print("Sayfa 77: ")
    val device: Device = Television("Vestel")
    device.turnOn()

    // Sayfa 80
    print("Sayfa 80: ")
    printWeatherCondition(WeatherCondition.RAINY)

    // Sayfa 81
    val todayWeather = assignWeatherCondition(WeatherCondition.SUNNY)
    println("Sayfa 81: Today weather -> $todayWeather")

    // Sayfa 82
    print("Sayfa 82: With for loop -> 5 Days weather temperature are : ")
    val weatherTemps = listOf<Float>(14.2f, 8.6f, 10.0f, 12.1f, 9.7f)
    for (temp in weatherTemps){
        print("$temp°C, ")
    }
    println()

    // Sayfa 83
    print("Sayfa 83: With while loop -> 5 Days weather temperature are : ")
    var count = 0
    while (count in weatherTemps.indices){
        print("${weatherTemps[count]}°C, ")
        count++
    }
    println()

    // Sayfa 84
    print("Sayfa 84: With do-while loop -> 5 Days weather temperature are : ")
    count = 0
    do {
        print("${weatherTemps[count]}°C, ")
        count++
    } while (count in weatherTemps.indices)
    println()

    // Sayfa 85
    print("Sayfa 85: Weather indices are ")
    for (i in weatherTemps.indices) // .indices returns range
        print("$i ")
    println()

    // Sayfa 86
    print("Sayfa 86: Here is Alphabet -> ")
    for (char in 'a'..'z')
        print("$char ")
    println()

    // Sayfa 87
    val myChar = 'ğ'
    if (myChar !in 'a'..'z')
        println("Sayfa 87: Character 'ğ' is not in English alphabet!")

    // Sayfa 88
    print("Sayfa 88: ")
    val name1 = "Ertugrul"
    val name2 = "Ahmet"
    val name3 = name1
    val name4 = "Ertugrul"

    print(name1 == name2)
    print(" ")
    print(name1 == name3)
    print(" ")
    print(name4 === name3) // true because it is created in string pool in heap and referencing same object
    println()

    // Sayfa 89
    print("Sayfa 89: name1 and name4 is in same heap are -> ")
    println(isAllocatedSameHeap(name1, name4))

    // Sayfa 90-91
    print("Sayfa 90-91: ")

    val todayWeatherDetails =
        WeatherDetails(
            country = "Turkey",
            city = "Istanbul",
            temp = 9.0,
            humidity = 77.0,
            condition = WeatherCondition.RAINY
        )

    val tomorrowWeatherDetails =
        WeatherDetails(
            country = "Turkey",
            city = "Istanbul",
            temp = 9.0,
            humidity = 77.0,
            condition = WeatherCondition.RAINY
        )

    if (todayWeatherDetails == tomorrowWeatherDetails){ // equal() function
        println("Today and Tomorrow weather are the same")
    }else{
        println("Today and Tomorrow weather are not the same")
    }
    println("Sayfa 90-91: Hash codes ${todayWeatherDetails.hashCode()} and ${tomorrowWeatherDetails.hashCode()}")
    println("Sayfa 90-91: To string  $todayWeatherDetails and $tomorrowWeatherDetails")

    val yesterdayWeather = tomorrowWeatherDetails.copy(temp = 12.0, condition = WeatherCondition.SUNNY)
    println("Sayfa 90-91: Yesterday weather temperature is ${yesterdayWeather.temp} and condition is ${assignWeatherCondition(yesterdayWeather.condition)}")
}

class Node<T>(var item: T){
    var next: Node<T>? = null
}

class Box(val height: Int, val width: Int)

open class Device(val brand: String){
    fun turnOff(){
        println("$brand turn-off")
    }

    fun turnOn(){
        println("$brand turn-on")
    }
}

class Phone(val phoneBrand: String): Device(phoneBrand)

class Television(val televisionBrand: String): Device(televisionBrand)

abstract class Car{
    abstract val model: String
    open fun honk() = "Honk Honk"
}

class Mercedes: Car(){
    override val model: String = "Mercedes"

    override fun honk(): String {
        return "Bow Bow"
    }
}

class Zoo(var name: String, val animals: List<String> = emptyList())

class Mario(var xPos: Int = 0, var yPos: Int = 0){
    var isAlive: Boolean = true

    fun move(x: Int = 1){
        xPos += x
        print("Mario moved ")
    }

    fun jump(y: Int = 1){
        yPos += y
        print("Mario jumped ")
    }

    fun onDie(){
        isAlive = false
        print("Mario death ")
    }

    fun respawn(){
        isAlive = true
        xPos = 0
        yPos = 0
        println("Mario respawned")
    }

    fun fire(): Unit = TODO("Design fire method for mario")
}

data class WeatherDetails(
    val country: String,
    val city: String,
    val temp: Double,
    val humidity: Double,
    val condition: WeatherCondition
)

data class Doctor(
    val name: String,
    var age: Int,
    var department: MedicalFields?,
    var email: String? = "",
)

enum class MedicalFields{
    NEUROLOGIST,
    CARDIOLOGIST,
    SURGEON,
}

enum class WeatherCondition{
    SUNNY,
    RAINY,
    FOGGY,
}

fun printWeatherCondition(condition: WeatherCondition) =
    when(condition){
        WeatherCondition.SUNNY-> println("It is a sunny day :)")
        WeatherCondition.RAINY-> println("It is a rainy day :(")
        WeatherCondition.FOGGY-> println("It is a foggy day :/")
        else -> println("Unknown weather condition :0")
    }

fun assignWeatherCondition(condition: WeatherCondition): String{
    val res = when(condition){
        WeatherCondition.SUNNY-> "Sunny"
        WeatherCondition.RAINY-> "Rainy"
        WeatherCondition.FOGGY-> "Foggy"
        else -> "Unknown weather"
    }
    return res
}

fun multiply1(a: Int, b: Int): Int{
    return a*b
}

fun multiply2(a: Int, b: Int) = a*b

fun printMultiply(a: Int, b: Int){
    println("Sayfa 10: $a times $b is ${a * b}")
}

fun decrement(num: Int, decBy: Int = 1): Int{
    return num - 1
}

//Function split the given string. if string is empty which means no meaningful character it returns null
fun splitString(str: String): List<String>?{
    return if (str.trim().isEmpty())
        null
    else
        return str.split(" ")
}

// Function with default parameters
fun printDoctorInfo(doctor: Doctor = Doctor("no-name", 0, null, null)) =
    print("doctor name: ${doctor.name}, age: ${doctor.age}, department: ${doctor.department}, email: ${doctor.email}")

fun getParameterType(x: Any): String{
    return when(x){
        is String -> {
            "parameter is String"
        }
        is Int -> {
            "parameter is Int"
        }
        is Float -> {
            "parameter is Float"
        }
        else -> {"parameter is not, String, Int or Float"}
    }
}

// Extension. This function multiply the value by random value between 1 and 10
fun Int.multiplyByRandom(): Int{
    val random = (1..10).random()
    return this * random
}

fun createDoctor(name: String, age: Int, department: MedicalFields?): Doctor{
    return Doctor(
        name = name,
        age = age,
        department = department,
    ).apply {
        this.email = "No email provided"
    }
}

fun getPI() = PI

// Singleton
object MathOperations{
    fun divide(x: Float, y: Float): Float{
        return if (y == 0.0f){
            println("0 divisor")
            Float.MAX_VALUE
        }else{
            x / y
        }
    }
}

fun startGame(mario: Mario?): String{
    return mario?.let {
        "Game is started"
    } ?: "Game is not started. No mario found"
}

operator fun Mario.plus(x: Int){
    this.xPos += x
}

fun <T> printValue(value: T) {
    println("$value ")
}

fun <T> printValues(vararg value: T){
    for (v in value){
        print("$v ")
    }
}

fun replaceSpace(str: String, prefix: Char = '-'): String{
    return str.replace(' ', prefix)
}

infix fun Int.powerOf(power: Int): Int{
    return this.toDouble().pow(power.toDouble()).toInt()
}

fun isAllocatedSameHeap(obj1: Any, obj2: Any) = if (obj1 === obj2) true else false