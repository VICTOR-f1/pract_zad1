package com.bignerdranch.android.pract1_farnosov_10112022

import android.os.Bundle
import android.widget.CalendarView
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
import androidx.compose.ui.viewinterop.AndroidView
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.MyGreenLight
import com.bignerdranch.android.pract1_farnosov_10112022.ui.theme.PRACT1_farnosov_10112022Theme

class CalendarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PRACT1_farnosov_10112022Theme {
                // A surface container using the 'background' color from the theme
                Column()
                {
                    Box(modifier = Modifier
                        .background(MyGreenLight)
                        .fillMaxWidth()
                        .weight(0.07f))
                    {
                       AlarmActivity().up_panel("Будильник")
                    }
                    Box(modifier = Modifier
                        .background(Color.Yellow)
                        .fillMaxWidth()
                        .weight(0.38f))
                    {
                        centerCalender("d")
                    }
                    Box(modifier = Modifier
                        .background(MyGreenLight)
                        .fillMaxWidth()
                        .weight(0.06f))
                    {

                    }


                    Box(modifier = Modifier
                        .background(MyGreenLight)
                        .fillMaxWidth()
                        .weight(0.08f))
                    {
                       AlarmActivity().down_butons(MyGreenLight,Color.Red, Color.Red, Color.Red,R.drawable.green_spisok,R.drawable.settings,R.drawable.alarm                            ,R.drawable.red_list
                        )
                }
            }
        }
    }
}

@Composable
fun centerCalender(value: String) {


    AndroidView({CalendarView(it)}, modifier = Modifier.wrapContentWidth(),
    update = {view->
        view.setOnDateChangeListener{calendarView,i,i2,i3->
            
        }

    })

}
}

