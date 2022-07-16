package com.sevenlearn.nikestore.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/ProductRepository;", "", "addToFavorites", "Lio/reactivex/Completable;", "product", "Lcom/sevenlearn/nikestore/data/Product;", "deleteFromFavorites", "getFavoriteProducts", "Lio/reactivex/Single;", "", "getProducts", "sort", "", "app_debug"})
public abstract interface ProductRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Product>> getProducts(int sort);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Product>> getFavoriteProducts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable addToFavorites(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.Product product);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable deleteFromFavorites(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.Product product);
}