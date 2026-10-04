package com.example.tenantmanagementsystem

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tenantmanagementsystem.databinding.ActivityMainBinding
import com.example.tenantmanagementsystemgroup.Tenant

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.saveButton.setOnClickListener {
            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()
            val tenant = Tenant(name, phone, rent)
            binding.tenant = tenant
        }

    }
}