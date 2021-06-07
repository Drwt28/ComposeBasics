package com.example.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")

                    // textFieldDemo()
                }
            }
        }
    }
}


//TExt
//TExtField
//IMage
//Button

@Composable
fun Greeting(name: String) {


    //how to use text

    val typography = MaterialTheme.typography

    Column()
    {
        Text(
            text = "Hello $name!", modifier = Modifier
                .padding(20.dp), style = typography.h1
        )
        Text(
            text = "Hello $name!", modifier = Modifier
                .padding(20.dp), style = typography.h2
        )
        Text(
            text = "Hello $name!", modifier = Modifier
                .padding(20.dp), style = typography.h2
        )
        Text(
            text = "Hello $name!", modifier = Modifier
                .padding(20.dp), style = typography.h3
        )
        Text(
            text = "Hello $name!", modifier = Modifier
                .padding(20.dp), style = typography.h4
        )
    }
}

//textfield demo

@Composable
fun buttonDemo(){

    Column()
    {

        imageDemo()

        TextButton(modifier = Modifier.padding(horizontal = 10.dp),onClick = {

        },) {
            Text("text button")
        }


        Button(modifier = Modifier.padding(horizontal = 10.dp),onClick = { /*TODO*/ }) {

            Text("click me")

        }

        OutlinedButton(modifier = Modifier.padding(horizontal = 10.dp),onClick = { /*TODO*/ },border = BorderStroke(1.dp,Color.Magenta)) {
            Text("Outline Button")
        }


        //Icon button
//        IconButton(onClick = { /*TODO*/ },content = {
//            Icon(imageVector = Icons.Outlined.Send,contentDescription = "")
//        })






    }


    //images





}


@Composable
fun imageDemo(){

    Image(modifier = Modifier.fillMaxSize(.5f).background(color = Color.Black).clip(shape = RoundedCornerShape(10.dp

    )
    ),painter = painterResource(id = R.drawable.image), contentDescription = "")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicsTheme {
        //for text demo
        // Greeting("Android")


        //textfield Demo

        buttonDemo()

    }
}