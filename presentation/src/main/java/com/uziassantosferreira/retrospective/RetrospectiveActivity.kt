package com.uziassantosferreira.retrospective

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_retrospective.*

class RetrospectiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrospective)

        retrospectiveRecyclerView.layoutManager = LinearLayoutManager(this)

        retrospectiveRecyclerView.adapter = RetrospectiveAdapter(this)

    }
}
