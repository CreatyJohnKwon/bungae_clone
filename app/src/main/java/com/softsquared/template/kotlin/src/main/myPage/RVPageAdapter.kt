package com.softsquared.template.kotlin.src.main.myPage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class RVPageAdapterTab1(manager: FragmentManager): FragmentPagerAdapter(manager)
{
    private val fragmentList = ArrayList<Fragment>()
    private val titleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = titleList.size

    override fun getPageTitle(position: Int): CharSequence = titleList[position]

    fun addFragment(fragment: Fragment, title: String)
    {
        fragmentList.add(fragment)
        titleList.add(title)
    }

    fun addFragment(fragment: Fragment)
    {
        fragmentList.add(fragment)
        titleList.add("")
    }
}