package com.example.todolistapp.taskmanager.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todolistapp.R
import com.example.todolistapp.ui.theme.LightGray
import com.example.todolistapp.ui.theme.fontFamily


@Composable
@Preview
fun WelcomeComponents (){
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = "Hi Randi!",
            fontFamily = fontFamily,
            fontSize = 22.sp
        )

        Text(
            text = "8 tasks for today Monday",
            fontFamily = fontFamily,
            fontSize = 18.sp,
            color = LightGray
        )
    }
}