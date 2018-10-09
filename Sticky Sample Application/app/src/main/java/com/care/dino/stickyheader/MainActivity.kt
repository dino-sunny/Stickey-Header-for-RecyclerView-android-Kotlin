package com.care.dino.stickyheader

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val data:ArrayList<Data> = ArrayList()
    private lateinit var adapter: StickyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()

        my_recycler_view.layoutManager = LinearLayoutManager(this)
        adapter = StickyAdapter(data, this)

        my_recycler_view.adapter = adapter

        my_recycler_view.addItemDecoration(StickHeaderItemDecoration(adapter))

    }

    private fun getData() {

        val data1 = Data("Title one", "Sept 10", "","","",1)
        val data2 = Data("", "", "This is sub headline","2.30PM","Kochi",0)
        val data3 = Data("", "", "This is sub headline","2.30PM","Kochi",0)
        val data4 = Data("", "", "This is sub headline","2.30PM","Kochi",0)
        val data5 = Data("", "", "This is sub headline","2.30PM","Kochi",0)
        val data6 = Data("", "", "This is sub headline","2.30PM","Kochi",0)
        val data7 = Data("", "", "This is sub headline","2.30PM","Kochi",0)
        val data8 = Data("", "", "This is sub headline","2.30PM","Kochi",0)
        val data21 = Data("Title Two", "Sept 10", "","","",1)
        val data22 = Data("Title Three", "Sept 10", "","","",1)
        val data23 = Data("Title Four", "Sept 10", "","","",1)
        val data9 = Data("Title Five", "Sept 11", "","","",1)
        val data10 = Data("", "", "This is sub headline","2.30PM - 3.30PM","Lulu Cyber Tower",0)
        val data11 = Data("", "", "This is sub headline","6.30PM - 3.30PM","Lulu Cyber Tower",0)
        val data12 = Data("", "", "This is sub headline","9.30PM - 11.30PM","Lulu Cyber Tower",0)
        val data13 = Data("", "", "This is sub headline","6.30PM - 3.30PM","Lulu Cyber Tower",0)
        val data14 = Data("", "", "This is sub headline","6.30PM - 3.30PM","Lulu Cyber Tower",0)
        val data15 = Data("", "", "This is sub headline","6.30PM - 3.30PM","Lulu Cyber Tower",0)
        val data16 = Data("", "", "This is sub headline","6.30PM - 3.30PM","Lulu Cyber Tower",0)
        val data17 = Data("", "", "This is sub headline","6.30PM - 3.30PM","Lulu Cyber Tower",0)

        data.add(data1)
        data.add(data2)
        data.add(data3)
        data.add(data4)
        data.add(data5)
        data.add(data6)
        data.add(data7)
        data.add(data7)
        data.add(data8)
        data.add(data21)
        data.add(data22)
        data.add(data23)
        data.add(data9)
        data.add(data10)
        data.add(data11)
        data.add(data12)
        data.add(data13)
        data.add(data14)
        data.add(data15)
        data.add(data16)
        data.add(data17)

    }

}

