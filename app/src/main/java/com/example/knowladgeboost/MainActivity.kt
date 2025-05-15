package com.example.knowladgeboost

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.knowladgeboost.ui.theme.KnowladgeBoostTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var showWelcomeScreen = remember { mutableStateOf(true) }
            var showFlashcardScreen = remember { mutableStateOf(false) }
            var showScoreScreen = remember { mutableStateOf(false) }
            var questionIndex = remember { mutableStateOf(0) }
            var score = remember { mutableStateOf(0) }

            val questions = listOf(
                "Nelson Mandela was South Africa's first Black president",
                "Apartheid began in 1994",
                "The Soweto Uprising happened in 1986",
                "F.W. de klerk helped end Apartheid ",
                "The ANC was formed in 1994"
            )
            val answers = listOf( true,false,false ,true ,false)
        }
    }
}

