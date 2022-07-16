package com.sevenlearn.nikestore.feature;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/sevenlearn/nikestore/feature/ProductDetailViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "bundle", "Landroid/os/Bundle;", "commentRepository", "Lcom/sevenlearn/nikestore/data/repo/CommentRepository;", "cartRepository", "Lcom/sevenlearn/nikestore/data/repo/CartRepository;", "(Landroid/os/Bundle;Lcom/sevenlearn/nikestore/data/repo/CommentRepository;Lcom/sevenlearn/nikestore/data/repo/CartRepository;)V", "getCartRepository", "()Lcom/sevenlearn/nikestore/data/repo/CartRepository;", "commentsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/sevenlearn/nikestore/data/Comment;", "getCommentsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "productLiveData", "Lcom/sevenlearn/nikestore/data/Product;", "getProductLiveData", "onAddToCartBtn", "Lio/reactivex/Completable;", "app_debug"})
public final class ProductDetailViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.sevenlearn.nikestore.data.Product> productLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Comment>> commentsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.CartRepository cartRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sevenlearn.nikestore.data.Product> getProductLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Comment>> getCommentsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable onAddToCartBtn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.CartRepository getCartRepository() {
        return null;
    }
    
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.CommentRepository commentRepository, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.CartRepository cartRepository) {
        super();
    }
}