package com.fastcampus.modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fastcampus.modifier.ui.theme.Jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_composeTheme {
                ModifierEx()
            }
        }
    }
}

@Composable
fun ModifierEx() { // Modifier는 레이아웃을 변경하고 이벤트 리스너 추가 등을 가능하게 만들어주는 코틀린 객체다.
    //1.Modifier에 Modifier.fillMaxSize()를 통해 사이즈를 변경
//    Button(
//        onClick = {},
//        modifier = Modifier.fillMaxSize()
//        ) {
//        Icon(imageVector = Icons.Filled.Search, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    //2. 높이만 100dp로 설정하기
//    Button(
//        onClick = {},
//        modifier = Modifier.height(100.dp) //width는 content size에 맞게 설정이됨
//    ) {
//        Icon(imageVector = Icons.Filled.Search, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    //3. 이제 width도 설정해보자 chaining으로도 가능하다
//    Button(
//        onClick = {},
//        modifier = Modifier
//            .height(100.dp)
//            .width(200.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Search, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    //4. width와 height를 동시에 사용할대는 size가 더 편리하다
//    Button(
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp,100.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Search, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    //5. backgournd 설정 (단, 버튼에서는 되지 않음)
    //그러므로 text나 icon에 설정
//    Button(
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp,100.dp).background(Color.Red)
//    ) {
//        Icon(imageVector = Icons.Filled.Search, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    //6.그러면 버튼의 background는 어떻게 바꿀까?
    //colors 파라미터에 ButtonDefaults.buttonColors와  containerColor와 contentColor 프로퍼티사용
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Magenta, //버튼 자체의 색상
//            contentColor= Color.Cyan//버튼에 들어가는 이미지나 텍스트에 영향
//        ),
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp,100.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Search, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    //7.button에 modifier에 padding을 추가
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Magenta, //버튼 자체의 색상
//            contentColor= Color.Cyan//버튼에 들어가는 이미지나 텍스트에 영향
//        ),
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp)
//            .padding(10.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Search, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    //8.button에 enalbed를 false로 하고 Text의 modifier에 clickable을 추가
    //button부분은 클릭이 안되지만 text부분만 클릭효과가 생김
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Magenta, //버튼 자체의 색상
//            contentColor= Color.Cyan//버튼에 들어가는 이미지나 텍스트에 영향
//        ),
//        onClick = {},
//        enabled = false,
//        modifier = Modifier
//            .size(200.dp)
//            .padding(10.dp)
//    ) {
//        Icon(imageVector = Icons.Filled.Search, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(
//            text = "Search",
//            modifier = Modifier.clickable {}
//        )
//    }
    //9.text의 modifier에 offset을 설정하고 x 파라미터를 설정
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta, //버튼 자체의 색상
            contentColor = Color.Cyan//버튼에 들어가는 이미지나 텍스트에 영향
        ),
        onClick = {},
        modifier = Modifier
            .size(200.dp)
            .padding(10.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search, contentDescription = null,
            modifier = Modifier.background(Color.Blue)
        )
        Spacer(modifier = Modifier
            .size(ButtonDefaults.IconSpacing)
            .background(Color.Blue))
        Text(
            text = "Search",
            modifier = Modifier
                .offset(x = 10.dp)
                .background(Color.Blue)//오른쪽으로 text가 이동
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jetpack_composeTheme {
        ModifierEx()
    }
}