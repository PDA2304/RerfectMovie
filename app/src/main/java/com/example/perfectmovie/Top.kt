package com.example.perfectmovie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.perfectmovie.Model.ViewModel
import kotlinx.android.synthetic.main.fragment_top.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val  URI : String = "https://api.themoviedb.org/3/movie/"

class Top : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sendNetvorkReauest()



    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_top, container, false)
    }

    fun sendNetvorkReauest()
    {
        val builder = Retrofit.Builder().baseUrl(URI).addConverterFactory(GsonConverterFactory.create())
        val retrofit= builder.build()
        val interfase = retrofit.create<Interface_API>(Interface_API::class.java)

        val call: retrofit2.Call<ViewModel> = interfase.getTop_Movie()

        call.enqueue(object : retrofit2.Callback<ViewModel>
        {
            override fun onFailure(call: Call<ViewModel>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<ViewModel>, response: Response<ViewModel>) {
                var array = response.body()!!.result
                activity?.runOnUiThread () {

                    val recycler = activity?.findViewById<RecyclerView>(R.id.imageRecyclerView)
                    recycler?.layoutManager = LinearLayoutManager(activity)
                    recycler?.setHasFixedSize(true)
                    var anim  = AnimationUtils.loadAnimation(activity?.applicationContext,R.anim.myalpha)
                    val adapter: ItemAdapter = ItemAdapter(activity!!.applicationContext, array)
                    {

                    }
                    recycler?.adapter = adapter
                }
            }

        })


    }
}