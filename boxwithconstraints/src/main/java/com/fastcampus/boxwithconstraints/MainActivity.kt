package com.fastcampus.boxwithconstraints

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fastcampus.boxwithconstraints.ui.theme.BoxWithConstraintTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxWithConstraintTheme {
                Outer()
            }
        }
    }
}
//
//@Composable
//fun Outer() { //outer 하나에 inner가 연결되어 있는 구조 따라서 inner에 있는 내용이 outer에 들어간다고 생각하면 됨
//    Column {
//        Inner()
//    }
//}
//2. Inner의 인자로 Modifier.widthIn(min = 100.dp_로 설정 heightIn도 설정, 각각 인자의 max값도 전달
//4.Column에 width를 지정해서 제한
@Composable
fun Outer() { //outer 하나에 inner가 연결되어 있는 구조 따라서 inner에 있는 내용이 outer에 들어간다고 생각하면 됨
    Column(
        modifier = Modifier.width(120.dp)
    ) {
        Inner(
            Modifier
                .widthIn(min = 100.dp, max= 150.dp)
                .height(160.dp)
        )
//        Inner(
//            Modifier
//                .width(200.dp)
//                .height(160.dp)
//        )
    }
}
//@Composable
//private fun Inner() {
//    BoxWithConstraints {//기본적으로 box와 비슷하지만 boxWithConstraintsScope가 있다 boxScope와는 다른형태 boxScope에 추가적으로
//                                                // minWidth,minHeight, maxWidth, maxHeight, constraints의 기능 사용가능
//        Text("maxW:$maxWidth maxH:$maxHeight minW:$minWidth minH:$minHeight")
//    }
//}

//1. Inner 인자로 modifier를 전달
 //파라미터로 받은 modifier를 BoxWidthConstrains에 전달
//@Composable
//private fun Inner(modifier: Modifier = Modifier) {
//    BoxWithConstraints(
//        modifier = modifier
//    ) {//기본적으로 box와 비슷하지만 boxWithConstraintsScope가 있다 boxScope와는 다른형태 boxScope에 추가적으로
//        // minWidth,minHeight, maxWidth, maxHeight, constraints의 기능 사용가능
//        Text("maxW:$maxWidth maxH:$maxHeight minW:$minWidth minH:$minHeight")
//    }
//}

//3. maxHeight 값이 90dp가 넘을때만 추가로 텍스트를 출력
@Composable
private fun Inner(modifier: Modifier = Modifier) {
    BoxWithConstraints(
        modifier = modifier
    ) {//기본적으로 box와 비슷하지만 boxWithConstraintsScope가 있다 boxScope와는 다른형태 boxScope에 추가적으로
        // minWidth,minHeight, maxWidth, maxHeight, constraints의 기능 사용가능
        if(maxHeight > 100.dp){
            Text(
                text = "여기 꽤 길군요!",
                modifier = Modifier.align(Alignment.BottomCenter)
                )
        }
        Text("maxW:$maxWidth maxH:$maxHeight minW:$minWidth minH:$minHeight")
    }
}

//그렇게 자주 사용되지는 않지만 width,height가 얼마일때 뭔가를 넣겠다 이런 경우에 사용할 수 있다

@Preview(showBackground = true)
@Composable
fun BoxWithConstraintPreview() {
    BoxWithConstraintTheme {
        Outer()
    }
}