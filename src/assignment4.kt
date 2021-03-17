import java.util.*

fun main() {
    town("jackline","Nandi","Akirachix","lisalab")
    numbers()
    var name= car("v8","prado","master")
    println(name)
    place()





}
fun town(name:String,country:String,School:String,classes:String){
    var string= arrayOf(name,School,country,classes)
    println(Arrays.toString(string))


}

fun place() { var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities[0].capitalize()+","+ cities[1].capitalize()+","+cities[2].capitalize()+","+cities[3])




}

fun numbers() {
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var total= numbers.component2()+numbers.component5()
    println(total)
    var index=numbers.indexOf(158)
    println(index)
    var int=(numbers.sortedArray())
    for(element in int){
        println(element)
    }





}

fun car(name:String,model:String,make:String):String {
    var string= arrayOf(name,model,make)
    return(Arrays.toString(string))

}














