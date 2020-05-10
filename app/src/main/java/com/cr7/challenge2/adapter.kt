package com.cr7.challenge2
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

 class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
     //sebuah list untuk menampung objek fragment
    private val halaman = listOf(
         fragment1(),
         fragment2(),
         fragment3()
     )
     //menentukan fragment yang kaan dibuka pada posisi tertentu
     override fun getItem(position: Int): Fragment {
        return halaman[position]
     }
     override fun getCount(): Int {
         return halaman.size
     }

     override fun getPageTitle(position: Int): CharSequence? {
         return when(position){
             0 -> "HOME"
             1 -> "PREVIOUS"
             else-> "NEXT "
         }
     }
 }