package com.cr7.bismillah.API
import android.os.Build
import com.cr7.bismillah.BuildConfig



object TheSportdbApi {
    fun getNextMatch(league : String?, event: String?): String{
        return "${BuildConfig.BASE_URL}api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/"+event+".php?id="+league
    }

    fun getNextMatch(league: String?): String {
        return "${BuildConfig.BASE_URL}api/v1/json/${BuildConfig.TSDB_API_KEY}/eventsnextleague.php?id=" + league
    }
}
