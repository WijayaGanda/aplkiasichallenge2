package com.cr7.bismillah.data

import com.cr7.bismillah.API.ApiRepository
import com.cr7.bismillah.API.TheSportdbApi
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter (private val view: MainView,
                     private val apiRepository: ApiRepository,
                     private val gson: Gson
) {
    fun getNextMatch(leagueId: String?) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(
                apiRepository.doRequest(TheSportdbApi.getNextMatch(leagueId)),
                NextEventItem::class.java
            )
            uiThread {
                view.hideLoading()
                view.showEventList(data.events)
            }
        }
    }
}