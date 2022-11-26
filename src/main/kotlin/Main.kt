fun main(){
    println("Hello, it's calculator")
    while(true){
        println("Enter the first number")
        val first = readLine()?.toDoubleOrNull()
        println("Enter one more number")
        val second = readLine()?.toDoubleOrNull()
        println("Choose the operator(+,-,*,/)")
        val operator = readLine()
        if (first == null || second == null || operator.isNullOrEmpty()){
            println("You entered incorrect data")
        }else{
            val result = calculator(first,second,operator)
            println("Result is $result")
        }
    }
}

fun calculator(fir: Double, sec: Double, op: String): Double {
    var res = 0.0
    when(op){
        "+" -> res = fir + sec
        "-" -> res = fir - sec
        "*" -> res = fir * sec
        "/" -> res = fir / sec
    }
    return res;

}
