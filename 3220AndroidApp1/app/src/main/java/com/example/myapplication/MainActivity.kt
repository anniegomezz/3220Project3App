package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_view)

        // Find buttons and the image container
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val imageContainer: FrameLayout = findViewById(R.id.imageContainer)

        // Set onClick listeners for each button
        button1.setOnClickListener {
            val imageView = ImageView(this)
            imageView.setImageResource(R.drawable.image1) // Replace with your actual image resource
            imageContainer.removeAllViews() // Clear previous content
            imageContainer.addView(imageView) // Add the new image
        }

        button2.setOnClickListener {
            val imageView = ImageView(this)
            imageView.setImageResource(R.drawable.image2) // Replace with your actual image resource
            imageContainer.removeAllViews()
            imageContainer.addView(imageView)
        }

        button3.setOnClickListener {
            val imageView = ImageView(this)
            imageView.setImageResource(R.drawable.image3) // Replace with your actual image resource
            imageContainer.removeAllViews()
            imageContainer.addView(imageView)
        }



//        setContent {
//            MyApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android App")
//                }
//            }
//        }



    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//            text = "Hello $name!",
//            modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyApplicationTheme {
//        Greeting("Android")
//    }
//}