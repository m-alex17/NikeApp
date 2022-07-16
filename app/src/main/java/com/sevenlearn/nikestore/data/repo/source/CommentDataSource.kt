package com.sevenlearn.nikestore.data.repo.source

import com.sevenlearn.nikestore.data.Comment
import io.reactivex.Single

interface CommentDataSource {

    fun getAll(productId:Int): Single<List<Comment>>

    fun insert(): Single<Comment>
}