import java.util.*

fun main() {
    stmt()
    cities()
    numbers()
    names()
}


//1.Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun stmt(){
    val statement= arrayOf("I", "am", "always", "awesome")
//    println(statement[0])
//    println(statement[1])
//    println(statement[2])
//    println(statement[3])
    println(statement.contentToString())
}


//2.Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
fun cities(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
//    var sortedcities= cities.sortedArray()
//    println(Arrays.toString(sortedcities))
    cities.forEach { cities -> println(cities.capitalize()) }
}


//3.Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//(ii) prints out the index of 158
//(iii) prints out the elements in ascending order
fun numbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=4+43
    println(sum)
     println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}

//4.Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun names(){
    val names= arrayOf("Lynette", "Nathalie", "Annet")
    println(names.contentToString())
}

