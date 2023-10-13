import java.io.DataInputStream
import java.io.FileInputStream

fun main(args: Array<String>) {
    val f = DataInputStream(FileInputStream("Rutes.dat")) //asigna el archivo a f

    while (f.available() > 0) {  //bucle para leer en el fileInputStream
        println("Ruta: " + f.readUTF())  //sabiendo cada tipo de archivo leemos
        println("Desnivell: " + f.readInt())
        println("Desnivell acumulat: " + f.readInt())
        val numPoints: Int = f.readInt() //lee los puntos y hace un bucle
        println("Té: $numPoints punts")
        for (i in 1..numPoints){
        println("Punt $i: " + f.readUTF() + " (" + f.readDouble() + "," + f.readDouble() + ")") //lee los puntos
        }
        println("\n")
    }
    f.close()
}