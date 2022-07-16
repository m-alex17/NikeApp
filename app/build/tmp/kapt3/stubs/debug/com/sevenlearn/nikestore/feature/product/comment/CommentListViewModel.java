package com.sevenlearn.nikestore.feature.product.comment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/sevenlearn/nikestore/feature/product/comment/CommentListViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "productId", "", "commentRepository", "Lcom/sevenlearn/nikestore/data/repo/CommentRepository;", "(ILcom/sevenlearn/nikestore/data/repo/CommentRepository;)V", "commentsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/sevenlearn/nikestore/data/Comment;", "getCommentsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "app_debug"})
public final class CommentListViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Comment>> commentsLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Comment>> getCommentsLiveData() {
        return null;
    }
    
    public CommentListViewModel(int productId, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.CommentRepository commentRepository) {
        super();
    }
}