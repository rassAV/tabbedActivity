package com.example.tabbedactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var movieViewPager: ViewPager2
    private lateinit var movieTabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieViewPager = findViewById(R.id.viewPager)
        movieTabLayout = findViewById(R.id.tabLayout)

        val pagerAdapter = ScreenSlidePagerAdapter(this)
        movieViewPager.adapter = pagerAdapter

        TabLayoutMediator(movieTabLayout, movieViewPager) { tab, position ->
            when (position) {
                0 -> tab.text = getString(R.string.movie_title_1)
                1 -> tab.text = getString(R.string.movie_title_2)
                2 -> tab.text = getString(R.string.movie_title_3)
            }
        }.attach()
    }

    private inner class ScreenSlidePagerAdapter(activity: AppCompatActivity) :
        FragmentStateAdapter(activity) {
        override fun getItemCount(): Int = 3

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> MovieFragment1()
                1 -> MovieFragment2()
                2 -> MovieFragment3()
                else -> throw IllegalArgumentException("Invalid position")
            }
        }
    }
}