package com.example.simplecontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplecontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  var contacts = arrayOf<Contact>(
        Contact("contact1","contact1","098765443","contact1@mail.fr"),
        Contact("contact2","contact2","098765443","contact1@mail.fr"),
        Contact("contact3","contact3","098765443","contact1@mail.fr"),
        Contact("contact4","contact4","098765443","contact1@mail.fr"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.fullName.text = contacts.get(0).firstName
        binding.phoneNumber.text = contacts.get(0).phoneNumber
        binding.email.text = contacts.get(0).email
    }
}