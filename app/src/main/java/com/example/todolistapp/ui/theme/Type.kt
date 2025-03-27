package com.example.todolistapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.todolistapp.R

// Set of Material typography styles to start with
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

//val Nunito = FontFamily(
//    listOf(
//        Font(R.font.nunito_light, FontWeight.Light),
//        Font(R.font.nunito_regular, FontWeight.Normal),
//        Font(R.font.nunito_medium, FontWeight.Medium),
//        Font(R.font.nunito_semibold, FontWeight.SemiBold),
//        Font(R.font.nunito_bold, FontWeight.Bold),
//        Font(R.font.nunito_extrabold, FontWeight.ExtraBold)
//    )
//)

val fontName = GoogleFont("Nunito")

val fontFamily = FontFamily(
    Font(googleFont = fontName, fontProvider = provider),
//    Font(googleFont = fontName, fontProvider = provider, weight = FontWeight.Normal)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)