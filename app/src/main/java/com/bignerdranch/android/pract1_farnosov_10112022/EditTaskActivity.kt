package com.bignerdranch.android.pract1_farnosov_10112022

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreenLight
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreend
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyOrange
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.PRACT1_farnosov_10112022Theme

class EditTaskActivity : ComponentActivity() {
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
                        UserLogin().up_panel2("Изменить задачу")
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
                            .weight(0.017f)
                    )
                    {
                        Button_Red("Удалить задачу")

                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.019f)
                    )
                    {
                        AlarmActivity().Button_add_task("Записать задачу")

                    }
                }
            }
        }
    }


    @Composable
    fun editSecond() {


        TextField(
            value = "Заголовок задачи",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            modifier = Modifier
                .offset(x = 25.dp, y = 20.dp)
                .clip((RoundedCornerShape(12)))
                .size(370.dp, 52.dp)
                .background(Color.White)
        )
        TextField(
            value = "16:30",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            leadingIcon = { Icon(  painter = painterResource(id=R.drawable.list), modifier = Modifier.size(50.dp), contentDescription = "Проверено") },
            modifier = Modifier
                .offset(x = 25.dp, y = 90.dp)
                .clip((RoundedCornerShape(12)))
                .size(160.dp, 52.dp)
                .background(Color.White)
        )
        Image(
            painter = painterResource(id = R.drawable.micro_alarm),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(22.dp)
                .offset(x = 35.dp, y = 105.dp)

        )

        TextField(
            value = "14.01.2021",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            leadingIcon = { Icon(  painter = painterResource(id=R.drawable.list), modifier = Modifier.size(50.dp), contentDescription = "Проверено") },
            modifier = Modifier
                .offset(x = 233.dp, y = 90.dp)
                .clip((RoundedCornerShape(12)))
                .size(160.dp, 52.dp)
                .background(Color.White)
        )
        Image(
            painter = painterResource(id = R.drawable.microcalendar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(22.dp)
                .offset(x = 243.dp, y = 105.dp)

        )
        TextField(
            value = "Описание задачи",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            modifier = Modifier
                .offset(x = 25.dp, y = 160.dp)
                .clip((RoundedCornerShape(8)))
                .size(370.dp, 110.dp)
                .background(Color.White)
        )


    }

    @Composable
    fun Button_Red(value: String) {
        Column(
            modifier = Modifier
                .offset(x = 0.dp, y = (15).dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Button(
                { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                modifier = Modifier
                    .size(400.dp, 60.dp)
                    .clip(RoundedCornerShape(10))
                    .offset(x = 0.dp, y = (0).dp)
            )

            {
                Text(
                    text = "$value ",
                    color = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .offset(x = (-15).dp, y = 0.dp)
                )
            }
        }
    }
}