package com.example.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.model.QuoteModel
import com.example.mvvm.model.QuoteProvider

class QuoteViewModel : ViewModel(){
    val quoteModel = MutableLiveData<QuoteModel>()
    val quoteAutor = MutableLiveData<String>()


    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteAutor.postValue(currentQuote.author)
        quoteModel.postValue(currentQuote)

    }
}