package com.example.ecommerceapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.ecommerceapp.app.noColor

@Composable
fun CircleAvatarX(
    hspace: Dp = 0.dp,
    vspcae: Dp = 0.dp,
    radius: Int,
    image: Any,
    color: androidx.compose.ui.graphics.Color = noColor
) {
    val painter = when (image) {
        is Painter -> image
        is String -> rememberImagePainter(image)
        else -> throw IllegalArgumentException("Unsupported image type")
    }

    Image(
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(horizontal = hspace, vertical = vspcae)
            .clip(RoundedCornerShape(radius.dp))
            .size(radius.dp)
            .background(color)
    )
}