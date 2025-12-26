package com.mukrram.composeca2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mukrram.composeca2.ui.theme.ComposeCA2Theme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeCA2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Spacer(modifier = Modifier.padding(innerPadding))
                    RegistrationForm()
                }
            }
        }
    }
}

@Composable
fun RegistrationForm() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    val options = listOf("Student","Professional")
    val snackBarHost = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    var value by remember { mutableStateOf("") }

    Scaffold(
        snackbarHost = { SnackbarHost(snackBarHost) },
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            OutlinedTextField(
                value = name,
                onValueChange = {
                    name = it
                },
                label = { Text("Name") },
            )
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },
                label = { Text("Email ID") },
            )
            OutlinedTextField(
                value = phone,
                onValueChange = {
                    phone = it
                },
                label = { Text("Phone No.") },
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                options.forEach { string ->
                    RadioButton(
                        string == value,
                        onClick = {value = string}
                    )
                    Text(string)
                }
            }
            Button(
                onClick = {
                    if(name.isEmpty() || email.isEmpty() || phone.isEmpty() || value.isEmpty()) {
                        scope.launch {
                            snackBarHost.showSnackbar(
                                "Please fill all the input fields",
                                "Close",
                                true,
                                SnackbarDuration.Short,
                            )
                        }
                    } else {
                        scope.launch {
                            snackBarHost.showSnackbar(
                                "Registration Successfully Completed.",
                                "Close",
                                true,
                                SnackbarDuration.Short,
                            )
                        }
                    }
                },
                modifier = Modifier.width(220.dp)
            ) {
                Text("Register")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegistrationFormPreview() {
    RegistrationForm()
}