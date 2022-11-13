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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // A surface container using the 'background' color from the theme

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MyGreenLight

            )
            {


                Row(

                ) {
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center)
                    ) {

                        Spacer(modifier = Modifier.size(100.dp))
                        Box(
                            modifier = Modifier
                                .offset(x = 28.dp, y = 15.dp)
                                .size(360.dp, 100.dp)
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 30.dp,
                                        topEnd = 0.dp,
                                        bottomEnd = 30.dp,
                                        bottomStart = 0.dp
                                    )
                                )
                                .background(MyOrange)
                        ) {
                            Text(
                                text = "Вечерний поход в кино",
                                fontSize = 20.sp,
                                color = White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(15.dp)
                            )
                            Text(
                                text = "Идем в кино с коллегами!",
                                color = MyGray,
                                fontSize = 14.sp,
                                modifier = Modifier
                                    .padding(40.dp)
                                    .offset(x = (-24).dp, y = 0.dp)

                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Box(
                            modifier = Modifier
                                .offset(x = 28.dp, y = 15.dp)
                                .size(360.dp, 100.dp)
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 30.dp,
                                        topEnd = 0.dp,
                                        bottomEnd = 30.dp,
                                        bottomStart = 0.dp
                                    )
                                )
                                .background(MyOrange)
                        ) {
                            Row() {}
                            Text(
                                text = "Забрать заказ Ozon",
                                fontSize = 20.sp,
                                color = White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(15.dp)
                            )
                            Text(
                                text = "Пункт выдачи на ул. Ленина, 103",
                                fontSize = 14.sp,
                                color = MyGray,
                                modifier = Modifier
                                    .padding(40.dp)
                                    .offset(x = (-24).dp, y = 0.dp)

                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Box(
                            modifier = Modifier
                                .offset(x = 28.dp, y = 15.dp)
                                .size(360.dp, 125.dp)
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 30.dp,
                                        topEnd = 0.dp,
                                        bottomEnd = 50.dp,
                                        bottomStart = 0.dp
                                    )
                                )
                                .background(MyOrange)
                        ) {
                            Text(
                                text = "Запись в автосервис",
                                fontSize = 20.sp,
                                color = White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(10.dp)
                            )


                        }
                        Box(modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.048f))
                        {
                        }
                        Box(modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.02f))
                        {
                           AlarmActivity().down_butons(Color.Red,Color.Red,Color.Red, MyGreenLight,R.drawable.calendar,R.drawable.settings,R.drawable.alarm,R.drawable.list)

                        }
                    }
                }
                Row(

                ) {
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center)
                    )

                    {
                        Text(
                            text = "Сдать автомобиль в автосервис на ул  \nБисертская, д. 14. Замена масла",
                            fontSize = 14.sp,
                            color = MyGray,
                            modifier = Modifier
                                .padding(40.dp)
                                .offset(x = (-45).dp, y = 352.dp)
                        )
                        Text(
                            text = "10.02.2022\n19:40",
                            fontSize = 14.sp,
                            color = MyGray,
                            modifier = Modifier
                                .padding(40.dp)
                                .offset(x = (225).dp, y = 210.dp)
                        )
                        Text(
                            text = "10.02.2022\n19:40",
                            fontSize = 14.sp,
                            color = MyGray,
                            modifier = Modifier
                                .padding(40.dp)
                                .offset(x = (225).dp, y = (-28).dp)
                        )
                        Text(
                            text = "10.02.2022\n19:40",
                            fontSize = 14.sp,
                            color = MyGray,
                            modifier = Modifier
                                .padding(40.dp)
                                .offset(x = (225).dp, y = (-265).dp)
                        )



                    }
                }
                Row(

                )
                {


                    up_panel(stringResource(R.string.DoList))

                }
                Row(modifier = Modifier.offset(y=655.dp)) {

                 AlarmActivity().Button_add_task("Добавить задачу")
                }



            }


        }


    }
    @Composable
    fun Button_add_task (value:String)
    {
        Column(
            Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.CenterEnd)
        ) {
            Spacer(modifier = Modifier.size(677.dp))
            Button(
                {val intent = Intent(this@MainActivity,AddTaskActivity  ::class.java)
                    startActivity(intent)},
                colors = ButtonDefaults.buttonColors(backgroundColor = MyGreend),
                modifier = Modifier
                    .size(400.dp, 60.dp)
                    .clip(RoundedCornerShape(10))
                    .offset(x = 22.dp, y = (0).dp)
            )

            {
                Text(
                    text = "$value ",
                    color = MaterialTheme.colors.background,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .offset(x = (-15).dp, y = 0.dp)
                )
            }
        }
    }
    @Composable
    fun up_panel (value:String)
    {
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
                .offset(x = 201.dp, y = 10.dp)
        )

    }
}









