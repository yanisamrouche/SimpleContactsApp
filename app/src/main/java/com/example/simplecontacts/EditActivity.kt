package com.example.simplecontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.simplecontacts.databinding.ActivityEditBinding
import com.example.simplecontacts.databinding.ActivityMainBinding

class EditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        val view = binding.root
        val btn = binding.btn
        setContentView(view)
        btn.text = "Enregistrer"
        btn.setOnClickListener {
            Toast.makeText(this@EditActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val contact = Contact("new contact", "new contact", "0987659876","y@mail.fr")
            println(contact.firstName)

        }

    }
}