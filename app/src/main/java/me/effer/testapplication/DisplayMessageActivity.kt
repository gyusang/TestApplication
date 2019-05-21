package me.effer.testapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        var message: String = intent.getStringExtra("MESSAGE")
        if (message.isBlank()) message = "무명"
        message = "${message}님, 안녕하세요?"
        textView2.text = message
        checkSwitch()
        toggleButton.setOnClickListener {
            checkSwitch()
        }
    }

    private fun checkSwitch() {
        textView2.textSize = if (toggleButton.isChecked) 18.0f else 14.0f
    }

}
