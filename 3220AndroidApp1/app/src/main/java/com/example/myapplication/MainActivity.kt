package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.animation.AlphaAnimation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_view)

        //Toolbar to show page title
//        val toolbar: Toolbar = findViewById(R.id.topBar)
//        setSupportActionBar(toolbar)

        // Define buttons
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val imageContainer: FrameLayout = findViewById(R.id.imageContainer)

        //onClick listeners for each button

//        //roller
//        button1.setOnClickListener {
//            val imageView = ImageView(this)
//            imageView.setImageResource(R.drawable.image1)
//            imageContainer.removeAllViews()
//            imageContainer.addView(imageView)
//        }
//        //splatling
//        button2.setOnClickListener {
//            val imageView = ImageView(this)
//            imageView.setImageResource(R.drawable.image2)
//            imageContainer.removeAllViews()
//            imageContainer.addView(imageView)
//        }
//        //charger
//        button3.setOnClickListener {
//            val imageView = ImageView(this)
//            imageView.setImageResource(R.drawable.image3)
//            imageContainer.removeAllViews()
//            imageContainer.addView(imageView)
//        }
        //roller (roller paintbrush weapon)
        button1.setOnClickListener {
            switchImage(imageContainer, R.drawable.image1) // Image 1
        }
        //splatling (gatling gun/machine gun)
        button2.setOnClickListener {
            switchImage(imageContainer, R.drawable.image2) // Image 2
        }
        //charger (sniper gun)
        button3.setOnClickListener {
            switchImage(imageContainer, R.drawable.image3) // Image 3
        }



    }

    private fun switchImage(container: FrameLayout, imageResId: Int) {
        // Create a new ImageView for the new image
        val newImageView = ImageView(this)
        newImageView.setImageResource(imageResId)

        // Add fade-out animation to the existing image
        val fadeOut = AlphaAnimation(1.0f, 0.0f)
        fadeOut.duration = 300 // 300ms fade out duration

        // Add fade-in animation to the new image
        val fadeIn = AlphaAnimation(0.0f, 1.0f)
        fadeIn.duration = 300 // 300ms fade in duration

        // Remove all previous views
        container.removeAllViews()

        // Start fade-out animation
        val currentImageView = container.getChildAt(0) as? ImageView
        currentImageView?.startAnimation(fadeOut)

        // Add the new image to the container and start fade-in animation
        container.addView(newImageView)
        newImageView.startAnimation(fadeIn)
    }


}

