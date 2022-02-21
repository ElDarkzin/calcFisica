fun main(args: Array<String>) {
    val exerciciopratico: calculadora = calculadora()

    val resultadoPeso: Float = exerciciopratico.forcaPeso(3f,5f)
    println("O resultado e $resultadoPeso")

    val resultadoCentripeta: Double = exerciciopratico.forcaCentripeta(2f, 7.0,2f)
    ("o resultado e $resultadoCentripeta")

    val resultadoImpulso: Float = exerciciopratico.forcaImpulso(10f, 10f, 5f, 5f)
    println("O resultado e $resultadoImpulso")

    val resultadoElastica: Float = exerciciopratico.forcaelastica(10f, 10f )
    println("O resultado e $resultadoElastica")

    val resultadovelocidade: Float = exerciciopratico.velocidademedia(5f, 10f, 2f, 5f)
    println("O resultado e $resultadovelocidade")

    val resultadomovimento: Float = exerciciopratico.movimentoRetUni(11f, 5f, 8f, 10f)
    println("O resultado e $resultadomovimento")

    val resultadomrvu: Float = exerciciopratico.mrvu(10f, 2f, 20f, 7f, 11f)
    println("O resultado e $resultadomrvu")
}


