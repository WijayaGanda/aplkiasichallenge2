package com.cr7.bismillah.data


import com.cr7.bismillah.API.ApiRepository
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("dateEvent")
    var dateEvent: String? = null,
    @SerializedName("dateEventLocal")
    val dateEventLocal: ApiRepository? = null,
    @SerializedName("idAPIfootball")
    val idAPIfootball: String,
    @SerializedName("idAwayTeam")
    var idAwayTeam: String? = null,
    @SerializedName("idEvent")
    var IdEvent: String? = null,
    @SerializedName("idHomeTeam")
    var idHomeTeam: String? = null,
    @SerializedName("idLeague")
    val idLeague: String,
    @SerializedName("idSoccerXML")
    val idSoccerXML: String,
    @SerializedName("intAwayScore")
    var intAwayScore: String? = null,
    @SerializedName("intAwayShots")
    val intAwayShots: String? = null,
    @SerializedName("intHomeScore")
    var intHomeScore: String? = null,
    @SerializedName("intHomeShots")
    val intHomeShots: String? = null,
    @SerializedName("intRound")
    val intRound: String? = null,
    @SerializedName("intSpectators")
    val intSpectators: String? = null,
    @SerializedName("strAwayFormation")
    val strAwayFormation: String? = null,
    @SerializedName("strAwayGoalDetails")
    val strAwayGoalDetails: String? = null,
    @SerializedName("strAwayLineupDefense")
    val strAwayLineupDefense: String? = null,
    @SerializedName("strAwayLineupForward")
    val strAwayLineupForward: String? = null,
    @SerializedName("strAwayLineupGoalkeeper")
    val strAwayLineupGoalkeeper: String? = null,
    @SerializedName("strAwayLineupMidfield")
    val strAwayLineupMidfield: String? = null,
    @SerializedName("strAwayLineupSubstitutes")
    val strAwayLineupSubstitutes: String? = null,
    @SerializedName("strAwayRedCards")
    val strAwayRedCards: String? = null,
    @SerializedName("strAwayTeam")
    var strAwayTeam: String? = null,
    @SerializedName("strAwayYellowCards")
    val strAwayYellowCards: String? = null,
    @SerializedName("strBanner")
    val strBanner: String? = null,
    @SerializedName("strCircuit")
    val strCircuit: String? = null,
    @SerializedName("strCity")
    val strCity: String? = null,
    @SerializedName("strCountry")
    val strCountry: String? = null,
    @SerializedName("strDate")
    val strDate: String? = null,
    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String? = null,
    @SerializedName("strEvent")
    val strEvent: String,
    @SerializedName("strEventAlternate")
    val strEventAlternate: String? = null,
    @SerializedName("strFanart")
    val strFanart: String? = null,
    @SerializedName("strFilename")
    val strFilename: String? = null,
    @SerializedName("strHomeFormation")
    val strHomeFormation: String? = null,
    @SerializedName("strHomeGoalDetails")
    val strHomeGoalDetails: String? = null,
    @SerializedName("strHomeLineupDefense")
    val strHomeLineupDefense: String? = null,
    @SerializedName("strHomeLineupForward")
    val strHomeLineupForward: String? = null,
    @SerializedName("strHomeLineupGoalkeeper")
    val strHomeLineupGoalkeeper: String? = null,
    @SerializedName("strHomeLineupMidfield")
    val strHomeLineupMidfield: String? = null,
    @SerializedName("strHomeLineupSubstitutes")
    val strHomeLineupSubstitutes: String? = null,
    @SerializedName("strHomeRedCards")
    val strHomeRedCards: String,
    @SerializedName("strHomeTeam")
    var strHomeTeam: String? = null,
    @SerializedName("strHomeYellowCards")
    val strHomeYellowCards: String,
    @SerializedName("strLeague")
    val strLeague: String,
    @SerializedName("strLocked")
    val strLocked: String,
    @SerializedName("strMap")
    val strMap: Any,
    @SerializedName("strPoster")
    val strPoster: Any,
    @SerializedName("strPostponed")
    val strPostponed: String,
    @SerializedName("strResult")
    val strResult: Any,
    @SerializedName("strSeason")
    val strSeason: String,
    @SerializedName("strSport")
    val strSport: String,
    @SerializedName("strTVStation")
    val strTVStation: Any,
    @SerializedName("strThumb")
    val strThumb: Any,
    @SerializedName("strTime")
    val strTime: String,
    @SerializedName("strTimeLocal")
    val strTimeLocal: String,
    @SerializedName("strTweet1")
    val strTweet1: Any,
    @SerializedName("strTweet2")
    val strTweet2: Any,
    @SerializedName("strTweet3")
    val strTweet3: Any,
    @SerializedName("strVideo")
    val strVideo: Any
)