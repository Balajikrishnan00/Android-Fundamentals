package com.balaji_2_2_0_5.androidrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.balaji_2_2_0_5.androidrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var twitterList:RecyclerView?=null
    private var twitterListAdapter: TwitterListAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        twitterList=binding.twitterList

        twitterListAdapter=TwitterListAdapter()
        twitterList?.adapter=twitterListAdapter
        twitterList?.layoutManager=LinearLayoutManager(applicationContext,RecyclerView.VERTICAL,false)



    }
}