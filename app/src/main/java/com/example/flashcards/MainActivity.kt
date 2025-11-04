package com.example.flashcards

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column //import column
import androidx.compose.foundation.layout.Row //import Row

import androidx.compose.material3.Button
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flashcards.ui.theme.FlashCardsTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent ()
        {
            FlashCardsTheme ()
            {

                Column(

                    modifier= Modifier.fillMaxSize(), //to expand the wrap to fill the entire screen
                    horizontalAlignment=Alignment.CenterHorizontally, //this is going to center the composables horizontally
                    verticalArrangement = Arrangement.Center //this is going to center the composables vertically


                )  // initiate the column layout
                {
                    Text("Welcome to the flashcards ") //display a text
                    Button(onClick={
                        var start= Intent(this@MainActivity, FlashCardsQuestion::class.java)
                        startActivity(start)
                    } )
                    {
                        Text("Start") // Text of the button to be "Start"
                    }
                }
            }
        }
    }
}

