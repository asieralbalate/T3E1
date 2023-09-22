import java.io.DataInputStream
import java.io.FileInputStream

fun main(args: Array<String>) {
    val f = DataInputStream(FileInputStream("C:\\Users\\asier\\IdeaProjects\\Exercici_3_1\\src\\Rutes.dat"))

    while (f.available() > 0) {
        println("Ruta: " + f.readUTF())
        println("Desnivell: " + f.readInt())
        println("Desnivell acumulat: " + f.readInt())
        val numPoints: Int = f.readInt()
        println("Té: $numPoints punts")
        for (i in 1..numPoints){
        println("Punt $i: " + f.readUTF() + " (" + f.readDouble() + "," + f.readDouble() + ")")
        }
        println("\n")
    }
    f.close()
}