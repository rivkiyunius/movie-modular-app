package com.qatros.core.base

import androidx.recyclerview.widget.DiffUtil
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author rivki
 * Created 20/01/22 at 21.14
 */
@Singleton
class DiffCallback @Inject constructor() : DiffUtil.Callback() {
    private var oldList: List<Any> = emptyList()
    private var newList: List<Any> = emptyList()

    fun setList(oldList: List<Any>, newList: List<Any>) {
        this.oldList = oldList
        this.newList = newList
    }

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        oldList[oldItemPosition] == newList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        oldList[oldItemPosition] == newList[newItemPosition]
}