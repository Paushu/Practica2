package mx.tecnm.tepic.ladm_u1_practica2_memoriaintext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        starTimer()
    }
    fun starTimer(){
        object : CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val intent = Intent (applicationContext, Principal::class.java).apply {  }
                startActivity(intent)
            }

        }.start()
    }
}


