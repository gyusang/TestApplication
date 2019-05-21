package me.effer.testapplication


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow


class MainActivity : AppCompatActivity() {
    val testToast:Toast by lazy {
        Toast.makeText(this, "Test Toast", Toast.LENGTH_SHORT)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val message = editText.text.toString()
            val toast1 = Toast.makeText(this, "${message}를 입력하셨네요?", Toast.LENGTH_SHORT)
            toast1.show()
            val nextIntent = Intent(this, DisplayMessageActivity::class.java)
            nextIntent.putExtra("MESSAGE", message)
            startActivity(nextIntent)

        }

        button2.setOnClickListener {
            testToast.show()
        }

    }


}
