package com.example.flashcards

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flashcards.ui.theme.FlashCardsTheme
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.unit.dp
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import android.R.attr.value
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class FlashCardsQuestion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlashCardsTheme()
            {
                var question1 by remember()
                {
                    mutableStateOf("")
                }

                var question2 by remember()
                {
                    mutableStateOf("")
                }

                var question3 by remember()
                {
                    mutableStateOf("")
                }

                var question4 by remember()
                {
                    mutableStateOf("")
                }

                Column()
                {
                    Divider()
                    Spacer(modifier = Modifier.size(30.dp))
                    Text("Chapter 1 : Microcontroller Basics")              //Topic

                    Spacer(modifier = Modifier.size(30.dp))
                    Text("1:What does AVR stand for?")                      //Question1


                    OutlinedTextField(                                             //Answer q1
                        value = question1,
                        onValueChange = { text -> question1 = text },
                        placeholder = { Text(text = "Answer") }
                    )

                    Spacer(modifier = Modifier.size(30.dp))
                    Text("2:What is the clock frequency of an ATmega328P typically used with Arduino Uno??")                      //Question2


                    OutlinedTextField(
                        value = question2,
                        onValueChange = { text -> question2 = text },
                        placeholder = { Text(text = "Answer") }
                    )

                    Spacer(modifier = Modifier.size(30.dp))
                    Text("3: What is the size of the ATmega328P’s Flash memory?")


                    OutlinedTextField(
                        value = question3,
                        onValueChange = { text -> question3 = text },
                        placeholder = { Text(text = "Answer") }
                    )

                    Spacer(modifier = Modifier.size(30.dp))
                    Text("4:Name one of the three main types of memory in an AVR microcontroller?")                  //


                    OutlinedTextField(
                        value = question4,
                        onValueChange = { text -> question4 = text },
                        placeholder = { Text(text = "Answer") }

                    )
                    Spacer(modifier = Modifier.size(30.dp))

                    Row()
                    {
                        Button(onClick = {
                            var back = Intent(this@FlashCardsQuestion, MainActivity::class.java)
                            startActivity(back)
                        }
                        )
                        {
                            Text("Back")
                        }
                        Text("")

                        Button(onClick = {
                            var finish = Intent(this@FlashCardsQuestion, ScoreScreen::class.java)

                            finish.putExtra("",question1)
                            finish.putExtra("",question2)
                            finish.putExtra("",question3)
                            finish.putExtra("",question4)

                            startActivity(finish)

                        }
                        )
                        {
                            Text("Finish")
                        }
                    }
                }
            }
        }
    }
}