fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    //Lambda Funtion
    val myLambda : (String) -> Unit = {s:String-> print(s)}
    val v:String = "Jurusan Teknik Informatika"
    myLambda(v)

    //Inline Function
    myFun(v,myLambda) //passing lambda as a parameter of another function
}

fun myFun(a: String, action: (String) -> Unit) { //passing lambda
    print("\nHeyyy!!!")
    action(a)

}

fun MyFunction(x: String): String {
    var c: String = "Hey!! Welcome to ---"
    return (c+x)
}


