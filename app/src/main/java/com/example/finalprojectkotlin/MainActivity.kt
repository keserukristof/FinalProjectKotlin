package com.example.finalprojectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.finalprojectkotlin.databinding.ActivityMainBinding
import com.example.finalprojectkotlin.model.Author

class MainActivity : AppCompatActivity() {

    //Create binding object
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Data binding
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //Data to Data binding
        var author = Author()
        author.name = "Keserű Kristóf"
        author.neptun = "OO8RQV"
        binding.author = author

        //Navigatiom to About me
        val goToAboutMe : Button = findViewById(R.id.button_go_to_about_me)
        goToAboutMe.setOnClickListener {
            val intent = Intent(this, AboutActivity :: class.java)
            startActivity(intent)
        }

        //Navigation to Shopping list
        val goToShoppingList : Button = findViewById(R.id.button_to_buy_list)
        goToShoppingList.setOnClickListener {
            val intent = Intent(this, ShoppingListActivity :: class.java)
            startActivity(intent)
        }

        val goToRoom : Button = findViewById(R.id.button_go_to_room_shopping)
        goToRoom.setOnClickListener {
            val intent = Intent(this, RoomShopping :: class.java)
            startActivity(intent)
        }

    }
}
