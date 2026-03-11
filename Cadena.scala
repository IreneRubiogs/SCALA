object Cadena {

    def main(args: Array[String]): Unit = {
    

    // 1️⃣ Crear un Array de palabras
    val palabras = Array("Hola", "soy", "programador", "en", "Scala")

    // 2️⃣ Generar una frase uniendo el Array
    val frase = palabras.mkString(" ")

    // 3️⃣ Mostrar la frase
    println(frase)


 
    def crearfrase (palabras: Array[String]): String = {
        var f = ""
        for (p <- palabras) {

            f += p + " "
        }
            f = f.dropRight(1)+ "."
//return f
            f

    }
    val frasef = crearfrase(palabras)
    println(frasef)

    println(palabras.map(_+" ").reduceLeft(  _ + _) + ".")

  
  }
}


    