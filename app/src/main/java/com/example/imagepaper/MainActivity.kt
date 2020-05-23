package com.example.imagepaper

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    var viewPager: ViewPager? = null
    var adapter: PagerAdapter? = null
    private lateinit var images: IntArray
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Grab all the images and stuff them in our array
        images = intArrayOf(R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
                R.drawable.image6)

        // get a reference to the ViewPager in the layout
        viewPager = findViewById<View>(R.id.pager) as ViewPager

        // Initialize our adapter
        adapter = ImagePaperAdapter(this@MainActivity, images)

        // Binds the Adapter to the ViewPager
        viewPager!!.adapter = adapter
    }
}