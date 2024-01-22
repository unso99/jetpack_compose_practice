package com.fastcampus.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fastcampus.jetpack_compose.ui.theme.Jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_composeTheme {
                Greeting(name = "Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //핫 리로딩을 통해 변하는 것을 바로 볼 수 있다 (build가 필요할수도 있음)
//    Text(text = "Hello $name")

    //색상을 지정하기 위해서는 color 파라미터에 색상을 지정
//    Text(text = "Hello $name", color= Color.Red)
    //Color 객체를 활용해서 해쉬값으로 색상 지정 (ARGB 순)
//    Text(text = "Hello $name", color= Color(0xffff9944))

    //fontsize 파라미터에 30.sp를 활용하여 글자크기 변경
//    Text(text = "Hello $name", color= Color(0xffff9944), fontSize = 30.sp)

    //fontWeight를 통해 bold처리 가능
//    Text(text = "Hello $name", color= Color(0xffff9944), fontSize = 30.sp, fontWeight = FontWeight.Bold)

    //fontfamily를 통해서 글꼴변경 가능
//    Text(
//        text = "Hello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive
//    )

    //letterspacing을 사용 text에서는 sp로 반드시 써야함 dp(x)
//    Text(
//        text = "Hello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        letterSpacing = 2.sp
//    )

    //maxline을 통해 최대 문자열 지정
//    Text(
//        text = "Hello $name\nHello $name\nHello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        letterSpacing = 2.sp,
//        maxLines = 2
//    )

    //textDecoration 추가
//    Text(
//        text = "Hello $name\nHello $name\nHello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        letterSpacing = 2.sp,
//        maxLines = 2,
//        textDecoration = TextDecoration.Underline
//    )

    //textAlign을 통해서 가운데 정렬
    //modifier를 통해 가로세로 길이를 정할수잇음
    //modifier size를 하면 가로세로 둘다이다
    Text(
        modifier = Modifier.size(300.dp),
        text = "Hello $name\nHello $name\nHello $name",
        color = Color(0xffff9944),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 2.sp,

        maxLines = 2,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack_composeTheme {
        Greeting("Android")
    }
}