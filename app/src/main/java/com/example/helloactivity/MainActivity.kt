package com.example.helloactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isGone
import com.example.helloactivity.Constance.Constance
import com.example.helloactivity.databinding.ActivityMainBinding
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    //Введите Имя 4 имени
    // по имени выдать зарплаты


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)






        }

    fun onClickGoMain(view: View){
        val intent = Intent(this, TestActivity1::class.java)
        startActivity(intent)


    }
    fun onClickGoMain2(view: View){
        val intent = Intent(this, TestActivity2::class.java)
        startActivity(intent)
    }



    }




/**  bindingClass.resB.setOnClickListener {
val resultValue = bindingClass.edValue.text.toString()
bindingClass.imPhoto.visibility = View.VISIBLE
bindingClass.tvResult.visibility = View.VISIBLE

if (bindingClass.edPassword.text.toString() == "" || bindingClass.edValue.text.toString()=="" ) {
bindingClass.tvResult.text = "Введите данные "
bindingClass.imPhoto.visibility = View.GONE
} else {
when (resultValue) {

Constance.qaTest -> {
// bindingClass.tvResult.visibility = View.VISIBLE
val temptext = "Имя: $resultValue \n" +
"Должность: Тестировщик 2 категории\n " +
"Зарплата: ${Constance.R_many} тысячи рублей"
if (bindingClass.edPassword.text.toString()
.toInt() == Constance.qaTest_Password
) {
bindingClass.tvResult.text = temptext
bindingClass.imPhoto.setImageResource(R.drawable.rustam)
} else {
bindingClass.tvResult.text = "Неверный номер ID"
bindingClass.imPhoto.setImageResource(R.drawable.figa)
}


}
Constance.progSen -> {
//bindingClass.tvResult.visibility = View.VISIBLE
val temptext1 = "Имя: $resultValue \n" +
"Должность: Ведущий разраб \n" +
"Зарплата: ${Constance.A_many} тысяч рублей"
if (bindingClass.edPassword.text.toString()
.toInt() == Constance.progSen_Password
) {
bindingClass.tvResult.text = temptext1
bindingClass.imPhoto.setImageResource(R.drawable.aydar)
} else {
bindingClass.tvResult.text = "Неверный номер ID"
bindingClass.imPhoto.setImageResource(R.drawable.figa)
}

}
Constance.progMiddl -> {
//bindingClass.tvResult.visibility = View.VISIBLE
val temptext2 = "Имя: $resultValue \n" +
"Должность: Старший разработчик \n" +
"Зарплат: ${Constance.P_many} тысяч рублей"

if (bindingClass.edPassword.text.toString()
.toInt() == Constance.progMiddl_Password
) {
bindingClass.tvResult.text = temptext2
bindingClass.imPhoto.setImageResource(R.drawable.pavel)
} else {
bindingClass.tvResult.text = "Неверный номер ID"
bindingClass.imPhoto.setImageResource(R.drawable.figa)
}

}
Constance.progJun -> {
// bindingClass.tvResult.visibility = View.VISIBLE
val temptext3 = "Имя: $resultValue \n" +
"Должность: Младший разработчик \n" +
"Зарплат: ${Constance.N_many} тысячи рублей"
if (bindingClass.edPassword.text.toString()
.toInt() == Constance.progJun_Password
) {
bindingClass.tvResult.text = temptext3
bindingClass.imPhoto.setImageResource(R.drawable.kolya)
} else {
bindingClass.tvResult.text = "Неверный номер ID"
bindingClass.imPhoto.setImageResource(R.drawable.figa)
}


}


else -> {

//  bindingClass.tvResult.visibility = View.VISIBLE
bindingClass.tvResult.text = "Ты счастливщик!\n" +
"Ты не работаешь за копейки.."
bindingClass.imPhoto.setImageResource(R.drawable.figa)
}



}


}


}*/

/**
bindingClass.resB.setOnClickListener {
getInput()
/**
 * /1
 * when(currentPerson){
in 0.. maxPerson->{bindingClass.tvW1.text="Все ок"}
else -> bindingClass.tvW1.text="Предел превышен"

}
/2
bindingClass.tvW1.text = when(currentPerson){
in 0 .. maxPerson -> {"Ok"}
else -> {"Bad"}
} */


}

/**
bindingClass.DiffB.setOnClickListener {
getInput()
myResult = textB1-textB2
bindingClass.tvW1.text= myResult.toString()
}


bindingClass.addB.setOnClickListener {
getInput()
myResult = textB1+textB2
bindingClass.tvW1.text = myResult.toString()
}


bindingClass.MultB.setOnClickListener {
getInput()
myResult = textB1*textB2
bindingClass.tvW1.text= myResult.toString()
}*/

}
private fun getInput(){
maxPerson = bindingClass.tw2.text.toString().toInt()
currentPerson = bindingClass.tw3.text.toString().toInt()

 */