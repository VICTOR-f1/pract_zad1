package com.bignerdranch.android.pract1_farnosov_10112022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreenLight
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.PRACT1_farnosov_10112022Theme

class UserLogin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PRACT1_farnosov_10112022Theme {
                // A surface container using the 'background' color from the theme
                Column()
                {
                    Box(modifier = Modifier
                        .background(Color.Yellow)
                        .fillMaxWidth()
                        .weight(0.07f))
                    {
                        up_panel2("Добавить будильник")
                    }
                    Box(modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth()
                        .weight(0.38f))
                    {
                        center("d")
                    }
                    Box(modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(0.06f))
                    {

                    }


                    Box(modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth()
                        .weight(0.08f))
                    {

                    }
                }
            }
        }
    }
}

@Composable
fun up_panel2(value: String) {


    Text(
        text = value,
        color = Color.White,
        fontSize = 27.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.offset(x = 15.dp, y = 12.dp)
    )
    Image(
        painter = painterResource(id = R.drawable.back_button),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(60.dp)
            .offset(x = 344.dp, y = 10.dp)
    )

}