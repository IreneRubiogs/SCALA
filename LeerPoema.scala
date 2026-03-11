import scala.collection.mutable.Map
import scala.language.postfixOps
object LeerPoema {

  def main(args: Array[String]): Unit = {

    val poema = "la penumbra azul de la mañana, cuando el rocío tiembla en la alborada, despierta el mundo, luz recién sembrada, como un latido fiel tras la ventana. Suspira el viento leve en la campana del viejo campanario en la enramada, y el tiempo fluye, sombra ya dorada, sobre la piel callada de la arcana. Mas yo persigo un sueño entre la bruma, un nombre escrito en agua y en memoria, ardiente como sol que no se esfuma. Y en su fulgor cifrado va mi historia: si el alba hiere, el corazón perfuma la breve eternidad de nuestra gloria."

    val palabras = poema.split("[\\s.,;:!?]+")
   // val palab = pal.map(_.toLowerCase)
   // val mapa = palab.map(p => p -> 1).toMap

    //val mapa = plmin.map(_.toLowerCase -> 1).toMap

       val recuento = palabras.map(_.toLowerCase).groupBy(identity).view.mapValues(_.length).toMap

    recuento.foreach{case(palabra, recuento) => println(s"la palabra:  $palabra, está $recuento veces.")}
  

    }

  }