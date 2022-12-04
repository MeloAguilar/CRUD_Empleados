package com.example.crud_empleados.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.crud_empleados.model.QuoteModel
import com.example.crud_empleados.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

            fun tandomQuote(){
                val currentQuote = QuoteProvider.random()
                quoteModel.postValue(currentQuote)
            }
}
