package com.bignerdranch.android.pract1_farnosov_10112022

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.BackHandler
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.07f)
                    )
                    {
                        up_panel2("Регестрация")

                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.15f)
                    )
                    {
                        editFirst()
                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.06f)
                    )
                    {
                        AlarmActivity().Button_add_task("Регестрация")

                    }


                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.04f)
                    )
                    {
                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.03f)
                    )
                    {
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
                .clickable(
                    onClick = {


                    }
                )
        )


    }

    @Composable
    fun editFirst() {


        TextField(
            value = "Имя пользователя",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            modifier = Modifier
                .offset(x = 25.dp, y = 170.dp)
                .clip((RoundedCornerShape(12)))
                .size(370.dp, 52.dp)
                .background(White)
        )
        TextField(
            value = "Адрес электронной почты",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            modifier = Modifier
                .offset(x = 25.dp, y = 240.dp)
                .clip((RoundedCornerShape(12)))
                .size(370.dp, 52.dp)
                .background(White)
        )
        TextField(
            value = "Пароль",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            modifier = Modifier
                .offset(x = 25.dp, y = 310.dp)
                .clip((RoundedCornerShape(12)))
                .size(370.dp, 52.dp)
                .background(White)
        )


    }

}