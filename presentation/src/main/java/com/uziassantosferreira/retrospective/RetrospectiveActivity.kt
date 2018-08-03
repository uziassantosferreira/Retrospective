package com.uziassantosferreira.retrospective

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_retrospective.*

class RetrospectiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrospective)
        setSupportActionBar(toolbar)

        viewPager.adapter = RetrospectiveFragmentPagerAdapter(supportFragmentManager, tabLayout)
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.icon = ContextCompat.getDrawable(this, R.drawable.ic_person)
        tabLayout.getTabAt(1)?.icon = ContextCompat.getDrawable(this, R.drawable.ic_person)

    }
}
