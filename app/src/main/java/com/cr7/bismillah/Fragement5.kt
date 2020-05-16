package com.cr7.bismillah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation. Nullable
import androidx.fragment.app.Fragment

class Fragement5 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super .onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment5 ,
        container, false )
    }
    override fun onViewCreated(
        view: View,
        @Nullable savedInstanceState: Bundle?
    ) {
        super .onViewCreated(view, savedInstanceState)
    }

}