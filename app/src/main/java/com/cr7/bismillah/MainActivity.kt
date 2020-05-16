package com.cr7.bismillah

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //nama yang akan muncul di tablayout
    val menuTeks = arrayOf("Home", "Next", "Previous", "Biografi", "Profil")
    //gambar yang akan muncul di tablayout
    val menuIcon = arrayOf(
        R.drawable.ic_security, R.drawable.ic_football,
        R.drawable.ic_real_madrid, R.drawable.ic_football, R.drawable.ic_security
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //perpindahan halaman
        val adapter = ViewPagerAdapter(this)
        //viwpager untuk berpindah fragment
        vp2.setAdapter(adapter);
        //tablayout
        TabLayoutMediator(tbnavigasi, vp2,
            TabConfigurationStrategy { tab, position ->
                tab.text = menuTeks[position]
                tab.icon = ResourcesCompat.getDrawable(
                    resources,
                    menuIcon[position], null
                )
            }).attach()
    }
}

