package com.qatros.movie.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.qatros.core.base.DiffCallback
import com.qatros.core.repository.model.MoviesResponse
import com.qatros.core.utils.showImages
import com.qatros.movie.databinding.ItemViewMovieBinding

/**
 * @author rivki
 * Created 11/03/22 at 12.10
 */
class MovieAdapter(private val diffCallback: DiffCallback = DiffCallback()) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    private val listMovie = mutableListOf<MoviesResponse>()

    fun setUserData(movies: List<MoviesResponse>){
        calculateDiff(movies)
    }

    private fun calculateDiff(newData: List<MoviesResponse>){
        diffCallback.setList(listMovie, newData)
        val result = DiffUtil.calculateDiff(diffCallback)
        with(listMovie){
            clear()
            addAll(newData)
        }
        result.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(ItemViewMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        holder.bindItem(listMovie[position])
    }

    override fun getItemCount() = listMovie.size

    inner class ViewHolder(private val binding: ItemViewMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(movie: MoviesResponse){
            with(binding){
                movie.posterPath?.let { ivMovie.showImages(it) }
                tvTitleMovie.text = movie.title
            }
        }
    }
}