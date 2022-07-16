package com.sevenlearn.nikestore.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/CommentRepositoryImpl;", "Lcom/sevenlearn/nikestore/data/repo/CommentRepository;", "commentDataSource", "Lcom/sevenlearn/nikestore/data/repo/source/CommentDataSource;", "(Lcom/sevenlearn/nikestore/data/repo/source/CommentDataSource;)V", "getCommentDataSource", "()Lcom/sevenlearn/nikestore/data/repo/source/CommentDataSource;", "getAll", "Lio/reactivex/Single;", "", "Lcom/sevenlearn/nikestore/data/Comment;", "productId", "", "insert", "app_debug"})
public final class CommentRepositoryImpl implements com.sevenlearn.nikestore.data.repo.CommentRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.source.CommentDataSource commentDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Comment>> getAll(int productId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.Comment> insert() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.source.CommentDataSource getCommentDataSource() {
        return null;
    }
    
    public CommentRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.source.CommentDataSource commentDataSource) {
        super();
    }
}