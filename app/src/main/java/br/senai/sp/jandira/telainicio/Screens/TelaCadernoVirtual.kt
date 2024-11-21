package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R

@Composable
fun CadernoVirtual(modifier: Modifier = Modifier) {
    Column {
            Box(modifier = Modifier
                .background(Color(0xFFFE9CE03))
                .height(80.dp)
                . width(400.dp)){
                Row ( verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.fillMaxHeight()){
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        modifier = Modifier
                            .height(40.dp)
                            .width(40.dp)
                    )
                    Text(text = "Titulo",
                        fontSize = 30.sp
                        )
                }
            }
        Box(modifier = Modifier
            .background(Color(0xFFFD9D9D9))
            .height(60.dp)
            .width(400.dp)
        ){
            Row {
                 Image(painter = painterResource(id = R.drawable.estilotexto),
                        contentDescription = "",
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                        )
                Image(painter = painterResource(id = R.drawable.negrito),
                    contentDescription = "",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                )
                Image(painter = painterResource(id = R.drawable.corsubliado),
                    contentDescription = "",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CadernoVirtualPreview() {
    CadernoVirtual()
}