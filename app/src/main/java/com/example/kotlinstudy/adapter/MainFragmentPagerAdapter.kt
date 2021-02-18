package com.example.kotlinstudy.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.kotlinstudy.ui.fragment.HomeFragment
import com.example.kotlinstudy.ui.fragment.OtherFragment
import com.example.kotlinstudy.ui.fragment.VideoFragment

class MainFragmentPagerAdapter(private val myContext: Context, fm: FragmentManager, internal var list: ArrayList<String>) : FragmentPagerAdapter(fm) {


    override fun getCount(): Int {

        return list.size


    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return HomeFragment()
            }
            1 -> {
                return VideoFragment()
            }
            2 -> {
                return OtherFragment()
            }

            else -> {
                return HomeFragment()
            }

        }


    }

    override fun getPageTitle(position: Int): CharSequence? {
        return list.get(position)
    }


}