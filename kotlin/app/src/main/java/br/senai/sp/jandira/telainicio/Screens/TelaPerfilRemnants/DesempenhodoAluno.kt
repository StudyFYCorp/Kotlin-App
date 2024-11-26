package br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.Screens.TelaPerfil
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun DesempenhoDoAluno() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Título
        Text(
            text = "Desempenho",
            fontFamily = poppinsFontFamily,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Contêiner da tabela
        Column(
            modifier = Modifier
                .height(110.dp)
                .fillMaxWidth()
                .border(2.dp, Color(0xFFD9D9D9), RoundedCornerShape(8.dp))
                .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
        ) {
            // Linha 1: Rank recorde e Pontos
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .border(
                        2.dp,
                        Color(0xFFD9D9D9),
                        RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)
                    )
            ) {
                TabelaItem(
                    iconId = R.drawable.medalhadeouro,
                    title = "Rank recorde",
                    value = "Ouro III",
                    modifier = Modifier.weight(1f)
                )
                // Divisória
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(1.dp)
                        .background(Color(0xFFD9D9D9))
                )
                TabelaItem(
                    iconId = R.drawable.pontos,
                    title = "Pontos",
                    value = "210",
                    modifier = Modifier.weight(1f)
                )
            }

            // Linha 2: Sem parar e Atividades feitas
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
            ) {
                TabelaItem(
                    iconId = R.drawable.fogo,
                    title = "Sem parar!",
                    value = "14 dias",
                    modifier = Modifier.weight(1f)
                )
                // Divisória
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(1.dp)
                        .background(Color(0xFFD9D9D9))
                )
                TabelaItem(
                    iconId = R.drawable.correto,
                    title = "Atividades feitas",
                    value = "20",
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
fun TabelaItem(
    iconId: Int,
    title: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(8.dp)
            .fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Ícone
        Image(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier
                .size(25.dp)
                .align(Alignment.CenterVertically)
        )

        // Espaçamento entre ícone e texto
        Spacer(modifier = Modifier.width(8.dp))

        // Textos (Título e Valor)
        Column {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = poppinsFontFamily
            )
            Text(
                text = value,
                fontSize = 14.sp,
                color = Color.Gray,
                fontFamily = poppinsFontFamily
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DesempenhoDoAlunoPreview() {
    DesempenhoDoAluno()
}

class DesempenhodoAluno {

}
