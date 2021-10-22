package com.example.aplikasikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit_btn(view: View){
        val namaEditText = findViewById<EditText>(R.id.nama_edit_text)
        val nama = namaEditText.text.toString()

        val toast = Toast.makeText(applicationContext, nama, Toast.LENGTH_SHORT)
        toast.show()
    }
    fun hello_mok(view: View) {
        val toast2 = Toast.makeText(this,"halo juga :)", Toast.LENGTH_LONG)
        toast2.show()
    }
    fun hello_mok2(view: View) {
        val toast3 = Toast.makeText(this,"hai aku moka ;)", Toast.LENGTH_LONG)
        toast3.show()
    }
}