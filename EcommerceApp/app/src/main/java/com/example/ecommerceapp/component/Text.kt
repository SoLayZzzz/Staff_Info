package com.example.ecommerceapp.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun XTextMedium(
    modifier: Modifier = Modifier,

    text: String,
    color: Color = Color.Black,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(
            fontSize = 20.sp,
            color = color,
            fontWeight = fontWeight
        ))
}

@Composable
fun XTextSmall(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = Color.Black,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(
            fontSize = 15.sp,
            color = color,
            fontWeight = fontWeight
        ))
}

@Composable
fun XTextLarge(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = Color.Black,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(
            fontSize = 24.sp,
            color = color,
            fontWeight = fontWeight
        ))
}