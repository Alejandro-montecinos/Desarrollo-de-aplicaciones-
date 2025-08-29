fun main (){

    // Un input normal

    //println("ingresa un numero ")
    

    /*
    println("iniciando proga")
    try {
        println("dentro del try")

        var num :Int = 1
        var num2 : String = "broooo"
    }
    catch (e:Exception){
        println("dentro del catch")
    }
    */

    //seguridad ante nulos con String?
    // util para controlar si una variable podria ser null

    /*
    var palabra :String? = null

    println(palabra?.length)
    */

    //Util para menus,
    /*
    var num : Int = 8

    var nombreDia : String = when (num) {

        1 ->"Lune"
        2 ->"Martes"
        3 ->"Miercoles"
        4 ->"Jueves"
        5 ->"Viernes"
        6,7 ->"Fin de semana"
        else -> "El negativo bro"


    }

    println("hoy es "+nombreDia)
    */

    /*
    for (i in 3..300){
        println("hola perros")
    }
    */

    /*
    var num : Int = 1
    while (num <= 7){
        num++
        println(num)

    }
    */




    /*
    var sum = 5+3
    var rest = 5-3
    var multi = 5*3
    var divi = 5/3
    var mod = 5%2

    println("sum $sum")
    println("rest $rest")
    println("multi $multi")
    println("divi $divi")
    println("mod $mod")
    */

    /*
    fun suma (a: Int, b: Int): Int {
        return a*b
    }

    print(suma(4,5))

     */

    /*
    fun condicionalDeEdades(edad1: Int){

        println("La edad es de $edad1 ")
        if (edad1 >= 18){
            println("Es mayor de edad")
        }else{
            println("Es menor de edad")
        }
    }

    condicionalDeEdades(5)

    fun divicion(num: Int,num2: Int){
        if (num2!=0){
            print(num/num2)
        }else{
            print("no se puede dividir entre cero")
        }
    }
    divicion(1,2)

     */

    /*
    fun Ciclo(){
        for (i in 1..100){
            println(i)
        }
    }
    Ciclo()

     */
    /*
    fun Ciclo(){
        for (i in 1..20 step 2){
            print(i)
        }

    }

    fun hola(){
        for (i in 1..20){
            if (i==5 || i in 11..19){

            }else{
                print("$i ")

            }
        }
    }
    hola()

     */

/*
    fun CicloWile(){
        var i=1;
        do {
            println(i)
            i++
        }while (i <= 10)
    }
    CicloWile()

 */


    //manejo de listas como List, SEt, Maps
/*
    var lista = mutableListOf(1,2,5,8,10,33,67,100) // las terminaciones en OF no son mutables
    lista.add(5)
    lista.add(5)
    lista.add(5)
    lista.add(5)

    println("lista $lista")

    var filtrado = lista.filter { it % 2==0}
    println("filtrado $filtrado")

    var map = lista.map { it+1 }
    println("map $map")

    var suma = lista.sum()
    println("suma $suma")

    var buscarElPar = lista.find { it % 2==0}
    println("buscarElPar $buscarElPar")

    var busraElPrimerElemento = lista.first()
    println("busraElPrimerElemento $busraElPrimerElemento")

    var buscaElUltimoElemento = lista.last()
    println("buscaElUltimoElemento $buscaElUltimoElemento")

 */




/*
    var conjunto =setOf(1,2,3)
    println("conjunto $conjunto")

 */

/*
    var informacion = mapOf("nombre" to "juan",
        "edad" to 9,
        "dolares" to 1000)
    informacion.forEach {
        (llave,valor ) -> println("la llave es $llave y el valor es $valor")
    }

 */

    val  Charmander = Pokemon("Charmander",20,80)
    val mewto = Pokemon("Mewto", 100, 450)

    Charmander.informacion()
    mewto.informacion()


    Charmander.sePreparaParaLaBatalla()
    mewto.recibeDanio(Charmander.atak)

    mewto.sePreparaParaLaBatalla()
    Charmander.recibeDanio(mewto.atak)




}

class Pokemon(
    //propiedades
    val nombre : String,
    var atak : Int,
    var hp : Int,
){
    //funciones
    fun sePreparaParaLaBatalla(){
        println("el $nombre se prepara para la batalla")
    }
    fun informacion(){
        println("nombre:$nombre ATK: $atak hp: $hp")
    }
    fun recibeDanio(danio: Int){
        println("$nombre recibe $danio puntos de danio ")
        hp = hp -danio
        println("$nombre ahora tiene $hp de vida ")
        if (hp<0){
            println("$nombre se a debilitado !!!!!!")
        }

    }
}