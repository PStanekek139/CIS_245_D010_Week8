package edu.rvc.student.week8
//Paul Stanek
//CIS-245-D010
//Week 8 Assignment
//2/26/2018
import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //bind controls
        val btnReturn = findViewById<Button>(R.id.btnReturn)
        val txtMessage = findViewById<TextView>(R.id.txtMessage)

        val bundle = intent.extras
        val strName = bundle.getString("name")
        val strEmail = bundle.getString("email")

        //display confirmation message in text view
        txtMessage.text = "Thank you, ${strName} - a confirmation email is being sent to ${strEmail}."

        //return to first instance
        btnReturn.setOnClickListener{
            finish()
        }
    }
}
