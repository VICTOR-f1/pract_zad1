package com.bignerdranch.android.pract1_farnosov_10112022

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreenLight
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreend
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyRed
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.PRACT1_farnosov_10112022Theme

class AlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PRACT1_farnosov_10112022Theme {
                Column()
                {

                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.07f)
                    )
                    {
                        up_panel("Будильник")
                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.38f)
                    )
                    {
                        center("d")
                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.06f)
                    )
                    {
                        Button_add_task("Добавить будильник")
                    }


                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.08f)
                    )
                    {
                        down_butons(
                            Color.Red,
                            Color.Red,
                            MyGreenLight,
                            Color.Red,
                            R.drawable.calendar,
                            R.drawable.settings,
                            R.drawable.green_alarm,
                            R.drawable.red_list
                        )
                    }
                }

            }
        }
    }


    @Composable
    fun up_panel(value: String) {

        val context = LocalContext.current

        Text(
            text = value,
            color = Color.White,
            fontSize = 27.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.offset(x = 15.dp, y = 12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.is_avatarka),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .offset(x = 344.dp, y = 10.dp)
                .clickable(
                    onClick = {
                        context.startActivity(Intent(context, ProfileActivity::class.java))

                    }
                )
        )

    }

    @Composable
    fun center(value: String) {
        Column(
            modifier = Modifier
                .offset(x = 0.dp, y = (15).dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val context = LocalContext.current


            val checkedState = remember { mutableStateOf(false) }
            val textColor = remember { mutableStateOf(Color.Unspecified) }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp)
                    .offset(15.dp, (-50).dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(bottom = 8.dp, top = 4.dp, start = 4.dp, end = 18.dp)
                        .size(428.dp, 125.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "07:30",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 58.sp,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier
                            .padding((0).dp, 0.dp, 0.dp, 8.dp)
                            .clickable(
                                onClick = {
                                    context.startActivity(
                                        Intent(
                                            context,
                                            EditAlarm::class.java
                                        )
                                    )

                                }
                            )
                    )

                    val checkedState = remember { mutableStateOf(false) }
                    Switch(
                        checked = checkedState.value,
                        modifier = Modifier
                            .offset(x = (-30).dp, y = 0.dp)
                            .size(107.dp, 55.dp)
                            .background(
                                color = if (checkedState.value) {
                                    MyGreend
                                } else {
                                    MyRed
                                },
                                shape = RoundedCornerShape(29.dp)
                            )
                            .offset(x = (-18).dp, y = 0.dp)
                            .size(255.dp, 175.dp),
                        onCheckedChange = { checkedState.value = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = MyGreend,
                            uncheckedThumbColor = Color.White,
                            uncheckedTrackColor = MyRed
                        )
                    )

                }
                Row(
                    modifier = Modifier
                        .padding(bottom = 8.dp, top = 4.dp, start = 4.dp, end = 18.dp)
                        .size(428.dp, 125.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "08:00",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 58.sp,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier
                            .padding((0).dp, 0.dp, 0.dp, 8.dp)
                            .offset(x = (0).dp, y = (-60).dp)
                            .clickable(
                                onClick = {
                                    context.startActivity(
                                        Intent(
                                            context,
                                            EditAlarm::class.java
                                        )
                                    )

                                }
                            )

                    )

                    val checkedState = remember { mutableStateOf(true) }
                    Switch(
                        checked = checkedState.value,
                        modifier = Modifier
                            .offset(x = (-30).dp, y = (-60).dp)
                            .size(107.dp, 55.dp)
                            .background(
                                color = if (checkedState.value) {
                                    MyGreend
                                } else {
                                    MyRed
                                },
                                shape = RoundedCornerShape(29.dp)
                            )
                            .offset(x = (-17).dp, y = 0.dp)
                            .size(255.dp, 175.dp),
                        onCheckedChange = { checkedState.value = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = MyGreend,
                            uncheckedThumbColor = Color.White,
                            uncheckedTrackColor = MyRed
                        )
                    )

                }
            }

        }

    }

    @Composable
    fun Button_add_task(value: String) {
        Column(
            modifier = Modifier
                .offset(x = 0.dp, y = (15).dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            var addMainActiviti: Int = 0
            var addAlarmActiviti: Int = 0
            var addTaskActiviti: Int = 0
            var addLogin1Activiti: Int = 0
            var addLogin2Activiti: Int = 0
            if (value == "Войти") {
                addLogin1Activiti++

            }

            val context = LocalContext.current
            Log.d("tag", "$context")

            val s1: String = "com.bignerdranch.android.pract1_farnosov_10112022.MainActivity@"
            val s2: String = "com.bignerdranch.android.pract1_farnosov_10112022.AlarmActivity@"
            val s3: String = "com.bignerdranch.android.pract1_farnosov_10112022.AddTaskActivity@"

            val s4: String = "com.bignerdranch.android.pract1_farnosov_10112022.UserLogin@"
            val s5: String = "MainActivity"
            Log.d("tag", "$context")

            var check: String = ""
            for (char in context.toString()) {
                check += char
                if (char == '@') {
                    break

                }
            }

            if (s1 == check) {
                addMainActiviti++
            }

            if (s2 == check) {
                addAlarmActiviti++
            }
            if (s3 == check) {
                addTaskActiviti++
            }
            if (s4 == check) {
                addLogin2Activiti++
            }
            Button(
                onClick = {
                    if (addMainActiviti > 0) {
                        context.startActivity(Intent(context, AddTaskActivity::class.java))
                    }
                    if (addAlarmActiviti > 0) {
                        context.startActivity(Intent(context, CreateAlarmActivity::class.java))
                    }
                    if (addTaskActiviti > 0) {
                        context.startActivity(Intent(context, MainActivity::class.java))
                    }
                    if (addLogin1Activiti > 0) {
                        context.startActivity(Intent(context, UserLogin2::class.java))
                    }
                    if (addLogin2Activiti > 0) {
                        context.startActivity(Intent(context, UserLogin::class.java))
                    }
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = MyGreend),
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

    @Composable
    fun down_butons(
        color1: Color,
        color2: Color,
        color23: Color,
        color24: Color,
        image: Int,
        image2: Int,
        image3: Int,
        image4: Int
    ) {
        Column(
            modifier = Modifier
                .offset(x = 0.dp, y = (0).dp)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val context = LocalContext.current


            Box(
                modifier = Modifier
                    .offset(x = 0.dp, y = 18.dp)
                    .size(360.dp, 150.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 35.dp,
                            topEnd = 35.dp,
                            bottomEnd = 0.dp,
                            bottomStart = 0.dp
                        )
                    )
                    .background(MyGreend)
            ) {

                Image(
                    painter = painterResource(id = image4),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .offset(x = 45.dp, y = 18.dp)
                        .clickable(
                            onClick = {
                                context.startActivity(Intent(context, MainActivity::class.java))

                            }
                        )
                )
                Image(
                    painter = painterResource(id = image3),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .offset(x = 118.dp, y = 18.dp)
                        .clickable(
                            onClick = {
                                context.startActivity(Intent(context, AlarmActivity::class.java))

                            }
                        )
                )
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .offset(x = 192.dp, y = 18.dp)
                        .clickable(
                            onClick = {
                                context.startActivity(Intent(context, CalendarActivity::class.java))
                            }
                        )

                )
                Image(
                    painter = painterResource(id = image2),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .offset(x = 270.dp, y = 19.dp)
                        .clickable(
                            onClick = {
                                context.startActivity(Intent(context, SettingActivity::class.java))

                            }
                        )
                )
                Text(
                    text = stringResource(R.string.List),
                    fontSize = 16.sp,
                    color = color24,
                    modifier = Modifier
                        .offset(x = 50.dp, y = (55).dp)
                )
                Text(
                    text = stringResource(R.string.Alarm),
                    fontSize = 14.sp,
                    color = color23,
                    modifier = Modifier
                        .offset(x = 118.dp, y = 57.dp)
                )
                Text(
                    text = stringResource(R.string.Calender),
                    fontSize = 14.sp,
                    color = color1,
                    modifier = Modifier
                        .offset(x = 185.dp, y = 57.dp)
                )
                Text(
                    text = stringResource(R.string.Settings),
                    fontSize = 14.sp,
                    color = color2,
                    modifier = Modifier
                        .offset(x = 264.dp, y = 57.dp)
                )
            }
        }

    }
}
