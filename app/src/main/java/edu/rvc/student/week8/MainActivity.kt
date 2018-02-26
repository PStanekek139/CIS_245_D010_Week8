package edu.rvc.student.week8
//Paul Stanek
//CIS-245-D010
//Week 8 Assignment
//2/26/2018
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //bind controls
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        var txtName = findViewById<EditText>(R.id.txtName)
        var txtEmail = findViewById<EditText>(R.id.txtEmail)

        btnSubmit.setOnClickListener(View.OnClickListener {
            //hide keyboard
            hideKeyboard()

            //navigate to 2nd activity
            val intent = Intent(this, MainActivity2::class.java)

            //add data to intent
            intent.putExtra("name", txtName.text.toString())
            intent.putExtra("email", txtEmail.text.toString())

            //clear fields
            txtName.setText("")
            txtEmail.setText("")

            //start 2nd activity
            startActivity(intent)


        })

    }

    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            // TODO: handle exception
        }

    }
}
