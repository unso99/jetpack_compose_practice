package com.fastcampus.button

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fastcampus.button.ui.theme.Jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_composeTheme {
                ButtonExample(onButtonClicked = {
                    //1. 버튼을 클릭했을 때 Toast 띄우기
                    Toast.makeText(this, "SendClicked", Toast.LENGTH_SHORT).show()
                })
            }
        }
    }
}

@Composable
fun ButtonExample(onButtonClicked: () -> Unit) {
    //버튼을 만들기 위해서는 Button함수를 호출하고 onClick을 넣어줘야함
//    Button(onClick = onButtonClicked) {
//        Text(text = "send")
//    }
    //2. 아이콘을 텍스트 앞에 추가해보기
    //가로로 순서대로 표시되기에 아이콘을 앞에다가
    //imageVector 안에는 Icons.Filled에 있는 것을 활용
    //contentDescription과 아이콘이 다른의미가 있다면 설정해줘야함
//    Button(onClick = onButtonClicked) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Text(text = "send")
//    }
    //3. 아이콘과 텍스트 사이에 Spacer 추가
    //modifier에 Modifier.size를 통해서 조정
//    Button(onClick = onButtonClicked) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "send")
//
//    }

    //4. enabled를 false로 해보자
//    Button(
//        onClick = onButtonClicked,
//        enabled = false
//    ) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "send")
//
//    }
    //5.버튼의 외각을 설정 -> border에 BorderStroke를 설정
//    Button(
//        onClick = onButtonClicked,
//        enabled = true,
//        border = BorderStroke(width = 10.dp, Color.Magenta)
//    ) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "send")
//    }

    //6.shpae를 CircleShape으로 설정해보기
//    Button(
//        onClick = onButtonClicked,
//        enabled = true,
//        border = BorderStroke(width = 10.dp, Color.Magenta),
//        shape = CircleShape
//    ) {
//        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "send")
//    }

    //7. contentPadding에서 PaddingValues 설정해보기
    Button(
        onClick = onButtonClicked,
        enabled = true,
        border = BorderStroke(width = 10.dp, Color.Magenta),
        shape = CircleShape,
        contentPadding = PaddingValues(20.dp)
    ) {
        Icon(imageVector = Icons.Filled.Send, contentDescription = null)
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "send")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jetpack_composeTheme {
        ButtonExample(onButtonClicked = {})
    }
}