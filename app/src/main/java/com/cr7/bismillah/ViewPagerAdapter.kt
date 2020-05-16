package com.cr7.bismillah

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    //jumlah tablayout
    private val JUMLAH_MENU = 5
    //ketika posisi user
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> { return Fragment1() }
            1 -> { return Fragment2() }
            2 -> { return Fragement3() }
            3 -> { return Fragement4()}
            4 -> { return Fragement5()}
            else -> {
                return Fragment2()
            }
        }
    }
    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}