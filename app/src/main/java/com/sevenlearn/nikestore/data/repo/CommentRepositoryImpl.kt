package com.sevenlearn.nikestore.data.repo

import com.sevenlearn.nikestore.data.Comment
import com.sevenlearn.nikestore.data.repo.source.CommentDataSource
import io.reactivex.Single

class CommentRepositoryImpl(val commentDataSource: CommentDataSource) : CommentRepository {
    override fun getAll(productId: Int): Single<List<Comment>> = commentDataSource.getAll(productId)

    override fun insert(): Single<Comment> {
        TODO("Not yet implemented")
    }
}