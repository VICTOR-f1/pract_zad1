package com.bignerdranch.android.pract1_farnosov_10112022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreenLight
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyOrange
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.PRACT1_farnosov_10112022Theme

class CreateAlarmActivity : ComponentActivity() {
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
                        UserLogin().up_panel2("Добавить будильник")
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

                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.019f)
                    )
                    {
                        AlarmActivity().Button_add_task("Создать будильник")

                    }
                }
            }
        }
    }

    @Composable
    fun editSecond() {


        TextField(
            value = "16:30",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.list),
                    modifier = Modifier.size(50.dp),
                    contentDescription = "Проверено"
                )
            },
            modifier = Modifier
                .offset(x = 25.dp, y = 0.dp)
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
                .offset(x = 35.dp, y = 15.dp)

        )

        TextField(
            value = "14.01.2021",
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(textColor = Color.Gray),
            onValueChange = {},
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.list),
                    modifier = Modifier.size(50.dp),
                    contentDescription = "Проверено"
                )
            },
            modifier = Modifier
                .offset(x = 240.dp, y = 0.dp)
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
                .offset(x = 250.dp, y = 15.dp)

        )


        Text(
            text = "Повторять каждый ",
            color = Color.White,
            fontSize = 18.sp,
            modifier = Modifier
                .offset(x = (25).dp, y = 75.dp)
        )
        AddCheckBox("Понедельник", 100)
        AddCheckBox("Вторник", 145)
        AddCheckBox("Среда", 190)
        AddCheckBox("Четверг", 235)
        AddCheckBox("Пятница", 280)
        AddCheckBox("Суббота", 325)
        AddCheckBox("Воскресенье", 370)

    }

    @Composable
    fun AddCheckBox(name: String, y: Int) {
        val checkedState = remember { mutableStateOf(false) }
        Row(
            modifier = Modifier
                .size(198.dp, 48.dp)
                .offset(x = 17.dp, y = y.dp)
                .padding(start = 8.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checkedState.value,
                onCheckedChange = { checkedState.value = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = MyOrange,
                    uncheckedColor = MyOrange,
                    checkmarkColor = Red
                ),
                modifier = Modifier
                    .background(Color.White)
                    .size(18.dp)
            )
            Text(
                text = name,
                style = TextStyle(fontSize = 18.sp, color = Color.White),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}