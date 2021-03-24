import javax.management.MBeanRegistration

fun main() {
    var gari=Car("volvo","KCB500",0,"legacy")
    gari.start()
    println(gari.speed)
    println(gari.make)
    println(gari.speed)
    var name=Car("subaru","KCV400r",0,"ford")
    println(name.start())
    println(name.model)
    name.accelerate(accelerate = 50)
    println(name.speed)
    gari.Carname()
    var bic=bic()
    bic.write("this is lovelace")

    println(name)



}
 class Car(var make:String,var registration:String,var speed:Int,var model:String) {
    fun start(){
        println("I am starting...brooooom")

    }
    fun accelerate(accelerate:Int):Int{
        speed= speed+accelerate
        return speed




    }
    fun Carname(){
        println("$model")
        println("$make")

    }



}
class bic(){
    fun write(writing:String){
        println(writing)
    



    }



    }




































