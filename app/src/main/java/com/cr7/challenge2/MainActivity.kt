package com.cr7.challenge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp_oke.adapter = MyPagerAdapter(supportFragmentManager)
        //menghubungkan viewpager dengan tab
        tablayout.setupWithViewPager(vp_oke)
        //menambahkan icon pada tablayout
        tablayout.getTabAt(0)!!.setIcon(R.drawable.ic_security)
        tablayout.getTabAt(1)!!.setIcon(R.drawable.ic_football)
        tablayout.getTabAt(2)!!.setIcon(R.drawable.ic_real_madrid)



    }
}
