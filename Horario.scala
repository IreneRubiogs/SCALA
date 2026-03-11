import scala.collection.mutable.ArrayBuffer
object Horario{
    def main(args: Array[String]): Unit ={

        val tablaHorario: Array[Array[String]]= Array(Array("Horario", "Mañana", "Tarde", "Noche"),
        Array("Lunes", "turno", "libre", "libre"),
        Array("Martes", "turno", "libre", "libre"),
        Array("Miércoles", "libre", "turno", "libre"),
        Array ("Jueves", "turno", "libre", "turno"), 
        Array ("Viernes", "libre", "libre", "turno"))
    
    var contador = 2
    
    
    for (i <- tablaHorario.indices) {
  for (j <- tablaHorario(i).indices) {
     if (i>0 && j>0 && tablaHorario(i)(j) =="turno") { 
      
            if (contador < 2) {
      println (s" No respeta ${tablaHorario(i)(j)}, el día  ${tablaHorario(i)(0)} en horario de  ${tablaHorario(0)(j)}")
          
     }
        else   contador = 0

    //println(s"Elemento [$i][$j] = ${tablaHorario(i)(j)}")
     }
     else if  (i>0 && j>0) contador +=1
   }
    }
 
    for (m <- tablaHorario(0).indices) {
       for (n <- tablaHorario.indices) {


    //print(s"Elemento [$n][$m] = ${tablaHorario(n)(m)}  ")
    print(s" ${tablaHorario(n)(m)}  ")
  }
  println()
}

    }}