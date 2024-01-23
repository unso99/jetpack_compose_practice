package com.fastcampus.surface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fastcampus.surface.ui.theme.SurfaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurfaceTheme {
                //surface는 materail design의 기본적인 패턴
                //높이가 있기에 그림자를 만들수 있음
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //suface가 외각에 위치하면서 패딩을 세팅하고 그안에 물건이 또 패딩을 세팅하는 형태로 코딩함
    //예를들어 텍스트가 5dp의 마진이 필요하면 마진을 설정하는게 아니라 suface에 5dp의 패딩을 설정
    //성능을 위한 것이기에 익숙해질 필요
//    Surface(
//        color = MaterialTheme.colorScheme.surface,
//        modifier = Modifier.padding(5.dp)
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }
    //1. surface의 elevation을 통해 높이를 설정해보자 -> 그림자를 가질수있음 이를통해 입체감을 넣어줄수있음
//    Surface(
//        modifier = Modifier.padding(5.dp),
//        elevation = 10.dp
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }
    //2. border의 값을 설정해보자
//    Surface(
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Magenta
//        ),
//        modifier = Modifier.padding(5.dp),
//        elevation = 10.dp
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }
    //3.Surface의 shape을 설정해보자
//    Surface(
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Magenta
//        ),
//        modifier = Modifier.padding(5.dp),
//        elevation = 10.dp,
//        shape = CircleShape
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }
    //4. color를 설정해보자
    //MaterialTheme.colors에서 primary, error
    //background, surface, secondary 등을 지정해보자
    //contentcolor가 자동으로 선택된다
    //color만 설정하고 contentColor을 안하면 자동으로 해줌
    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta
        ),
        modifier = Modifier.padding(5.dp),
        elevation = 10.dp,
        shape = CircleShape,
        color = MaterialTheme.colors.error
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SurfacePreview() {
    SurfaceTheme {
        Greeting("Android")
    }
}