package com.blue.birthdaycard2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.blue.birthdaycard2.ui.theme.BirthdayCard2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCard2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Composable
fun GreetingText(message: String, modifier: Modifier = Modifier){
    Text(
        text = message,
        fontSize = 30.sp,
        lineHeight = 100.sp,
    )
}

@Preview(
    showBackground = true,
    name = "bluePreview")
@Composable
fun BirthdayCardPreview() {
    BirthdayCard2Theme {
        GreetingText(message = "Happy Birthday blue!")
    }
}