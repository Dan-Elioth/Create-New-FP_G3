import scala.io.StdIn.readLine
object AreaTCS {
def main(args: Array[String]) ={
//Declaracion de variables 
println("Ejercicio 01: Area Triangulo")
//Datos de entrada
println("Ingrese Base:")
val b = readLine().toInt
println("Ingrese Altura:")
val h = readLine().toInt
//Proceso 
val area=(b*h)/2
//Datos de salida
println("El area del Triangulo es:"+area)
}
}