package com.bignerdranch.android.pract1_farnosov_10112022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreenLight
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.PRACT1_farnosov_10112022Theme

class UserLogin2 : ComponentActivity() {
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
                            .weight(0.03f)
                    )
                    {
                        UserLogin().up_panel2("Войти")
                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.1f)
                    )
                    {
                        editSecond()
                    }


                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.115f)
                    )
                    {
                        AlarmActivity().Button_add_task("Войти")
                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.025f)
                    )
                    {

                    }
                }
            }
        }
    }


    @Composable
    fun editSecond() {


        TextField(
            value = "Имя пользователя",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            modifier = Modifier
                .offset(x = 25.dp, y = 190.dp)
                .clip((RoundedCornerShape(12)))
                .size(370.dp, 52.dp)
                .background(Color.White)
        )

        TextField(
            value = "Пароль",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            modifier = Modifier
                .offset(x = 25.dp, y = 260.dp)
                .clip((RoundedCornerShape(12)))
                .size(370.dp, 52.dp)
                .background(Color.White)
        )


    }


}