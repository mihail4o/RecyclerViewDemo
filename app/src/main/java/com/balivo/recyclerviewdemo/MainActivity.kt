package com.balivo.recyclerviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var weekDays: ArrayList<String>
    private lateinit var adapter: MyAdapter
    private lateinit var dividerItemDecoration: DividerItemDecoration
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Initialize adapter with empty data
        weekDays = ArrayList()
        adapter = MyAdapter(weekDays, this)

// Create LinearLayoutManager instance
        linearLayoutManager = LinearLayoutManager(this)

// Divider for items
        dividerItemDecoration = DividerItemDecoration(
                recycler_view.context,
                linearLayoutManager.orientation
        )

    // Set-Up RecyclerView
    recycler_view.setHasFixedSize(true)
    recycler_view.layoutManager = linearLayoutManager
    recycler_view.addItemDecoration(dividerItemDecoration)
    recycler_view.adapter = adapter
    getWeekDays()
    }
    /**
     * This method will add the data to
     * the weekDays list
     */
    private fun getWeekDays() {
        weekDays.add("Monday")
        weekDays.add("Tuesday")
        weekDays.add("Wednesday")
        weekDays.add("Thursday")
        weekDays.add("Friday")
        weekDays.add("Saturday")
        weekDays.add("Sunday")
        weekDays.add("Monday")
        weekDays.add("Tuesday")
        weekDays.add("Wednesday")
        weekDays.add("Thursday")
        weekDays.add("Friday")
        weekDays.add("Saturday")
        weekDays.add("Sunday")
// notify adapter that data has changed
        adapter.notifyDataSetChanged()
    }
}