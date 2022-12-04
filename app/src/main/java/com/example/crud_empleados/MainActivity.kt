package com.example.crud_empleados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.crud_empleados.databinding.ActivityMainBinding
import com.example.crud_empleados.viewmodel.QuoteViewModel


class MainActivity : AppCompatActivity() {

    private val quoteViewModel: QuoteViewModel by viewModels()
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAuthor.text = it.author
        })

        binding.viewContainer.setOnClickListener {
            quoteViewModel.tandomQuote()
        }
    }
}