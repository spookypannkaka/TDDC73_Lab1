package com.example.lab1_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.lab1_compose.ui.theme.Lab1_ComposeTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyLayout()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1_ComposeTheme {
        Greeting("Android")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyLayout() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Green Header Box with Text
        Text(
            text = "Example 1",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF308474))
                .padding(start = 16.dp, top = 8.dp, bottom = 8.dp),
            color = Color.White,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Image
        Image(
            painter = painterResource(id = R.drawable.cat),
            contentDescription = "Silly cat"
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Buttons in 2 Rows
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Column {
                Button(onClick = { }, modifier = Modifier.width(120.dp).height(48.dp), shape = RoundedCornerShape(4.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)) { Text("BUTTON") }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = { }, modifier = Modifier.width(120.dp).height(48.dp), shape = RoundedCornerShape(4.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)) { Text("BUTTON") }
            }
            Column {
                Button(onClick = { }, modifier = Modifier.width(120.dp).height(48.dp), shape = RoundedCornerShape(4.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)) { Text("BUTTON") }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = { }, modifier = Modifier.width(120.dp).height(48.dp), shape = RoundedCornerShape(4.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)) { Text("BUTTON") }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Text Field with Email Label
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Email", modifier = Modifier.padding(end = 8.dp))
            val textState = remember { mutableStateOf(TextFieldValue()) }
            OutlinedTextField(
                value = textState.value,
                onValueChange = { textState.value = it },
                modifier = Modifier
                    .width(300.dp)
                    .heightIn(min = 56.dp),  // Ensuring a good touch target size
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedBorderColor = Color(0xFFE91E63),
                    unfocusedBorderColor = Color(0xFFE91E63)
                )
            )
        }
    }
}