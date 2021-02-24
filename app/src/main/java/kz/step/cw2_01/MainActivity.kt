package kz.step.cw2_01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var button: Button? = null
    var textView: TextView? = null
    var editText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    fun initializeViews(){
        button = findViewById(R.id.button_main_activity_press)
        textView = findViewById(R.id.textview_main_activity_text)
        editText = findViewById(R.id.textview_main_activity_edit_text)
    }

    fun initializeLiseners(){
        button?.setOnClickListener {
            var resultText = "Everithing looks fine!"
            var textColor = Color.GREEN
            for(char in editText?.text.toString()){
                if(char.isDigit()){
                    resultText = "Error, we have digits in our name!"
                    textColor = Color.RED
                    break
                }
            }
            textView?.setTextColor(textColor)
            textView?.text = resultText
        }
    }
}