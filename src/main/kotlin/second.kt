import kotlin.system.exitProcess

fun main(){
    println("Enter names list using comma (,) as separator")
    val names = readLine().orEmpty()
    val arraynames = names.split(",")
    println("Enter salaries using comma (,) as separator")
    val salaries = readLine().orEmpty()
    val arraysalaries = salaries.split(",")
    if (arraynames.size != arraysalaries.size){
        println("Names list must be the same as salaries list")
        exitProcess(0)
    }

    validateLength(arraynames,10,"Names")
    validateLength(arraynames,6,"Salaries")
  printTable (arraynames,arraysalaries)

}

fun printTable(arraynames: List<String>, arraysalaries: List<String>) {
    println("-".repeat(23))
    for (name in arraynames){
        val index = arraynames.indexOf(name)
        val salary = arraysalaries[index]
        val f1 = (12 - name.length) /2
        val f2 = 12 - name.length - f1
        val s1 = (8 - salary.length) /2
        val s2 = 8 - salary.length - s1
        println("|" + " ".repeat(f1) + name + " ".repeat(f2) + "|" + " ".repeat(s1) + salary + " ".repeat(s2) + "|")

    }
    println("-".repeat(23))

}

fun validateLength(arraynames: List<String>, maxsize: Int, entity: String) {
    for(names in arraynames){
        if(names.length > maxsize) println("$entity must be up to $maxsize characters")
        break
    }

}
