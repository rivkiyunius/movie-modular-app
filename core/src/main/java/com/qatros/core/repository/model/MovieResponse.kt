package com.qatros.core.repository.model

/**
 * @author rivki
 * Created 10/01/22 at 12.12
 */
import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("backdrop_path")
    var backdropPath: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("imdb_id")
    var imdbId: String?,
    @SerializedName("original_title")
    var originalTitle: String?,
    @SerializedName("overview")
    var overview: String?,
    @SerializedName("popularity")
    var popularity: Double?,
    @SerializedName("poster_path")
    var posterPath: String?,
    @SerializedName("release_date")
    var releaseDate: String?,
    @SerializedName("title")
    var title: String?,
    @SerializedName("vote_average")
    var voteAverage: Double?,
    @SerializedName("vote_count")
    var voteCount: Int?,
    var isFavorite: Boolean = false,
    @SerializedName("genre_ids")
    var genresIds: List<Int>,
    var genres: String?
)