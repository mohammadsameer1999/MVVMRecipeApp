package com.sameer.mvvmrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoadingImageFromDisk()
        }
    }


    @Composable
    fun LoadingImageFromDisk() {
        Column() {
            Image(
                painter = painterResource(id = R.drawable.pngwing_com),
                contentDescription = null,
                modifier = Modifier.height(300.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(16.dp)) {

                Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {

                    Text(
                        text = "Happy Meal",
                        style = TextStyle(
                            fontSize = 26.sp
                        )
                    )
                    Text(
                        text = "$5.99",
                        style = TextStyle(
                            color = Color(0xFF85bb65),
                            fontSize = 17.sp
                        ),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    text = "800 Calories",
                    style = TextStyle(fontSize = 17.sp)
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(text ="Order Now")
                }

            }

        }
    }
}
//@Composable
//fun RowImage() {
//    Column {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp)
//                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Show Details",
//                modifier = Modifier.align(Alignment.CenterHorizontally)
//            )
//            Text(
//                text="ANM",
//                modifier = Modifier.align(Alignment.CenterHorizontally)
//            )
//        }
//        Spacer(modifier = Modifier.padding(20.dp))
//        Row(
//            modifier = Modifier
//                .width(200.dp)
//                .height(200.dp)
//                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
//            horizontalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Items",
//                modifier = Modifier.align(Alignment.CenterVertically)
//            )
//        }
//    }
//}
//}
