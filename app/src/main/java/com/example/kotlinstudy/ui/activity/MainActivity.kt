/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.example.kotlinstudy.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.kotlinstudy.R
import com.example.kotlinstudy.adapter.MainFragmentPagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


//    初始化变量必须赋值或者延迟初始化 因此通过？初始化允许变量为null但是使用此变量时需加！！通知编译器不做非空校验
//    private  var tabLayout:TabLayout? = null
//    private  var viewPager:ViewPager? = null

//    lateinit延迟初始化，使用变量时可以不用！！
    private lateinit var tabLayout:TabLayout
    private lateinit var viewPager:ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initData()






    }

    private fun initView(){
        viewPager = findViewById<ViewPager>(R.id.view_pager)
        tabLayout = findViewById<TabLayout>(R.id.tab_layout)



    }

    private fun initData() {

        var list = ArrayList<String>()
        list.add("haha")
        list.add("xixi")
        list.add("haxi")




        viewPager.adapter = MainFragmentPagerAdapter(this,supportFragmentManager,list)

        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager!!.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {
            }
            override fun onTabReselected(tab: TabLayout.Tab) {
            }
        })

        tabLayout.setupWithViewPager(viewPager)


    }





}
