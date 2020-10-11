fun main() {

    senteciaIf()
    senteciaIfOperadoresLogicos()
}

private fun senteciaIf(){

    val myNumber: Int = 10

    if ( myNumber <= 10 ){
        println( "$myNumber es menor o igual que 10" )
    }else{
        println( "$myNumber es mayor que 10" )
    }

    if ( myNumber in 1..10 ){
        println( "$myNumber esta entre 1 y 10" )
    }else{
        println( "$myNumber no esta entre 1 y 10" )
    }
}

private fun senteciaIfOperadoresLogicos(){

    /*
        AND -> &&
        OR -> ||
        NOT -> !
     */

    val myNumber: Int = 11

    // AND
    if ( myNumber in 1..10 && myNumber > 5) {
        println( "$myNumber esta entre 1 y 10 y es mayor que 5" )
    }else if (myNumber in 1..10 && myNumber <= 5){
        println( "$myNumber esta entre 1 y 10 y es menor o igual que 5" )
    }else{
        println( "$myNumber no esta entre 1 y 10" )
    }

    // OR
    if ( myNumber in 1..10 || myNumber in 30..40 ){
        println( "$myNumber esta entre 1 y 10 o entre 30 y 40" )
    }else{
        println( "$myNumber no esta entre 1 y 10 o entre 30 y 40" )
    }

    // AND - OR
    if ( (myNumber in 1..10 && myNumber > 5) || myNumber in 30..40) {
        println( "$myNumber esta entre 1 y 10 y es mayor que 5 o esta entre 30 y 40" )
    }else if (myNumber in 1..10 && myNumber <= 5){
        println( "$myNumber esta entre 1 y 10 y es menor o igual que 5" )
    }else{
        println( "$myNumber no esta entre 1 y 10 ni entre 30 y 40" )
    }


}