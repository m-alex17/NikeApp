package com.sevenlearn.nikestore.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/CommentRepository;", "", "getAll", "Lio/reactivex/Single;", "", "Lcom/sevenlearn/nikestore/data/Comment;", "productId", "", "insert", "app_debug"})
public abstract interface CommentRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Comment>> getAll(int productId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.Comment> insert();
}