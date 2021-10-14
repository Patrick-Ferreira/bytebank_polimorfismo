fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "alex",
        cpf = "123.456.789.-00",
        salario = 1000.0
    )
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")
}





