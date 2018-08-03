package com.uziassantosferreira.retrospective

import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class RetrospectiveFragmentPagerAdapter(fragmentManager: FragmentManager,
                                        private val tabLayout: TabLayout):
        FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment = PostsFragment.newInstance()

    override fun getPageTitle(position: Int): CharSequence?
        = when(position){
            0 -> "Good"
            1 -> "Improve"
            else -> ""
        }

    override fun getCount(): Int  = 2
}