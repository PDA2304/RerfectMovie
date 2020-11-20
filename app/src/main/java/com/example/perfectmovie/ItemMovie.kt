package com.example.perfectmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.perfectmovie.Model.Json_results
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_item_movie.*

class ItemMovie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_movie)
        var item = intent.getParcelableExtra<Json_results>("OBJECK")
        Title.text = item?.title
        release_date.text = item?.release_date

        description.setOnClickListener {
            description_text.text = item?.overview
            description_text.visibility = it.visibility }

        Picasso.with(this)
            .load(URI_IMAGE + item?.poster_path)
            .into(image_poster, object : Callback {
                override fun onSuccess() {
                    if (progressBar != null) {
                        progressBar.visibility = View.GONE
                    }
                }

                override fun onError() {
                    Log.i("this","")
                }
            })

    }
}