package com.example.finalprojectkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.finalprojectkotlin.data.Grocery
import com.example.finalprojectkotlin.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_shopping_list.*
import java.lang.StringBuilder

class ShoppingListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_list)
        initializeUi()
    }

    private fun initializeUi() {
        val factory = InjectorUtils.provideGroceryesViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(GroceryesViewModel::class.java)

        //observe
        viewModel.getGroceryes().observe(this, Observer { groceryes ->
            val stringBuilder = StringBuilder()
            groceryes.forEach { grocery ->
                stringBuilder.append("$grocery\n\n")
            }
            textView_quotes.text = stringBuilder.toString()
        })
        button_add_quote.setOnClickListener {
            val grocery = Grocery(editText_quote.text.toString(), editText_author.text.toString())
            viewModel.addGrocery(grocery)
            editText_quote.setText("")
            editText_author.setText("")
        }
    }
}
