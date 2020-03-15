package com.example.testnew

import android.graphics.Movie
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.gif.GifDrawable


class MainActivity : AppCompatActivity() {

    lateinit var movie :Movie;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView) as ImageView

        //Glide.with(this).load("https://i.stack.imgur.com/wdvWZ.gif").into(imageView)
        //var gifDrawable :  GifDrawable =
        //Glide.with(this).asGif(gifDrawable).into(imageView)
        Glide.with(this).load(getDrawableImage(R.drawable.bird_drw)).into(imageView)

    }

    fun getDrawableImage(id: Int): Drawable{
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return resources.getDrawable(id, applicationContext.getTheme());
        } else {
            return resources.getDrawable(id);
        }
    }
}
