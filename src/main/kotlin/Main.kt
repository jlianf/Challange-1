import javax.swing.plaf.basic.BasicTableUI

fun main(args: Array<String>) {
    println("=================================")
    println("GAME SUIT TERMINAL VERSION")
    println("=================================")

    //Cek Input PLayer1 dan Player2
    val inputCheck = listOf("gunting", "batu", "kertas")

    //input and output player 1 dan 2
    println("Pemain 1 input = ")
    var player1: String? = readln()
    if (player1 in inputCheck) {
        println("Player 1 Inputan sesuai")
    } else {
        println("Player 1 Masukan gunting/batu/kertas")
        return
    }

    println("Pemain 2 input = ")
    var player2: String? = readln()
    if (player2 in inputCheck) {
        println("Player 2 Inputan sesuai")
    } else {
        println("Player 2 Masukan gunting/batu/kertas")
        return
    }

    //Cek Winner
    if (player1 == player2) {
        println("Draw!")
    } else if ((player1 == "gunting" && player2 == "kertas") ||
        (player1 == "kertas" && player2 == "batu") ||
        (player1 == "batu" && player2 == "gunting")
    ) {
        println("Player 1 Menang!")
    } else {
        println("Player 2 Menang!")
    }
}


//GAGAL
//class Pemain1() {
//    var pemain1 = player1
//
//    object player1 {
//
//    }
//
//    val inputCheck = listOf("gunting", "batu", "kertas")
//
//    fun checkInput() {
//        if (pemain1 in inputCheck) {
//            println("Player 1 Inputan sesuai")
//        } else {
//            println("Player 1 Masukan gunting/batu/kertas")
//            return
//        }
//    }
//}
//class Pemain2(){
//        var pemain2 = player2
//
//        object player2 {
//
//        }
//
//        val inputCheck = listOf("gunting","batu","kertas")
//
//        fun checkInput(){
//            if (pemain2 in inputCheck){
//                println("Player 2 Inputan sesuai")
//            }else{
//                println("Player 2 Masukan gunting/batu/kertas")
//                return
//            }
//        }
//}