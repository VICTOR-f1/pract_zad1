package com.bignerdranch.android.pract1_farnosov_10112022

import android.content.Intent
import android.os.Bundle
import android.text.Layout.Alignment
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreenLight
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreend
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.PRACT1_farnosov_10112022Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class ProfileActivity : ComponentActivity() {
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
                        UserLogin().up_panel2("Профиль Пользователь")
                    }
                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.1f)
                    )
                    {
                        image_and_text()
                    }


                    Box(
                        modifier = Modifier
                            .background(MyGreenLight)
                            .fillMaxWidth()
                            .weight(0.017f)
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
                        Button_add_task("Регестрация ")

                    }
                }
            }
        }
    }


    @Composable
    fun image_and_text() {


            Image(
                painter = painterResource(id = R.drawable.is_avatarka),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(255.dp)
                    .offset(x = 78.dp, y = 75.dp)
            )
            Text(
                text = "Вход не выполнен",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(x = 132.dp, y = (350).dp)
            )
        }
    @Composable
    fun Button_add_task(value: String) {
        Column(
            modifier = Modifier
                .offset(x = 0.dp, y = (15).dp)
                .fillMaxWidth(),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val context = LocalContext.current

            Button(
                onClick = {


                        context.startActivity(Intent(context, UserLogin::class.java))

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
}