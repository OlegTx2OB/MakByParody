package com.example.makbyparody.presentation.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.makbyparody.R
import com.example.makbyparody.presentation.theme.Typography
import com.example.makbyparody.presentation.theme.gray99
import com.example.makbyparody.presentation.theme.makGreen
import com.example.makbyparody.presentation.theme.makYellow
import com.example.makbyparody.presentation.theme.size12Dp
import com.example.makbyparody.presentation.theme.size16Dp
import com.example.makbyparody.presentation.theme.size50Dp
import com.example.makbyparody.presentation.theme.white
import com.example.makbyparody.presentation.viewmodel.MoreViewModel

@Composable
fun MoreScreen(navController: NavHostController, viewModel: MoreViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(gray99)
            .padding(size16Dp)
    ) {
        Text(
            text = stringResource(R.string.more),
            style = Typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(size16Dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(size12Dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(white)

            ) {
                MoreListButton(stringResource(R.string.contact_us), {/*TODO*/})
                MoreListButton(stringResource(R.string.about_the_app), {/*TODO*/})
            }
        }

        Spacer(modifier = Modifier.height(size50Dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            colors = ButtonDefaults.buttonColors(containerColor = makYellow)
        ) {
            Text(text = stringResource(R.string.login), color = makGreen)
        }
    }
}

@Composable
fun MoreListButton(text: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(size16Dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium
        )
        Icon(
            painter = painterResource(R.drawable.ic_arrow_right),
            contentDescription = null,
            modifier = Modifier.size(size12Dp)
        )
    }
}

