package com.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                About()
            }
        }
    }
}

//Icon(
// imageVector = Icons.Default.Call,
// contentDescription = "Call",
// tint = Color.Blue
// )


@Composable
fun About() {
    Column (
        modifier = Modifier
            .fillMaxSize().background(Color(0xFFBED3C7)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (
            modifier = Modifier.padding(top = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )  {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.size(150.dp).background(Color(0xFF172855))
            )
            Text(
                text = "Marjan Lazarov",
                fontSize = 34.sp
            )
            Text(
                text = "Android Developer Extraordinaire",
                color = Color(0xFF104628),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 250.dp)
                )
        }
        Column (
            horizontalAlignment = Alignment.Start
        ) {
            Row (
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(imageVector = Icons.Default.Call,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(
                    text = "+389 78 375 057",
                )
            }
            Row {
                Icon(imageVector = Icons.Default.Share,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier.padding(end = 16.dp)
                    )
                Text(
                    text = "@AndoridDev",
                )
            }
            Row {
                Icon(imageVector = Icons.Default.Email,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84),
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(text = "marjanlazarov86@gmail.com")
            }
        }
    }

}



@Preview(showBackground = true)
@Composable
fun AboutPreview() {
    BusinessCardTheme {
        About()
    }
}