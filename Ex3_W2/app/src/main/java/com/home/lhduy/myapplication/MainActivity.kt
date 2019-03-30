package com.home.lhduy.myapplication

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = BitmapFactory.decodeResource(resources, R.drawable.ava)
        val round = RoundedBitmapDrawableFactory.create(resources , img)
        //round.cornerRadius = 25f
        round.isCircular = true
        imageView.setImageDrawable(round)

        val img1 = BitmapFactory.decodeResource(resources, R.drawable.ava1)
        val round1 = RoundedBitmapDrawableFactory.create(resources , img1)
        //round.cornerRadius = 25f
        round1.isCircular = true
        imageView1.setImageDrawable(round1)

        val img2 = BitmapFactory.decodeResource(resources, R.drawable.ava2)
        val round2 = RoundedBitmapDrawableFactory.create(resources , img2)
        //round.cornerRadius = 25f
        round2.isCircular = true
        imageView2.setImageDrawable(round2)

        val img3 = BitmapFactory.decodeResource(resources, R.drawable.ava3)
        val round3 = RoundedBitmapDrawableFactory.create(resources , img3)
        //round.cornerRadius = 25f
        round3.isCircular = true
        imageView3.setImageDrawable(round3)

        val img4 = BitmapFactory.decodeResource(resources, R.drawable.ava4)
        val round4 = RoundedBitmapDrawableFactory.create(resources , img4)
        //round.cornerRadius = 25f
        round4.isCircular = true
        imageView4.setImageDrawable(round4)

        val img5 = BitmapFactory.decodeResource(resources, R.drawable.ava5)
        val round5 = RoundedBitmapDrawableFactory.create(resources , img5)
        //round.cornerRadius = 25f
        round5.isCircular = true
        imageView5.setImageDrawable(round5)

    }
}
