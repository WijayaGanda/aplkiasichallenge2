package com.cr7.bismillah.data

interface MainView {

    fun showLoading()

    fun hideLoading()

    fun showEventList(data:List<Event>)

}