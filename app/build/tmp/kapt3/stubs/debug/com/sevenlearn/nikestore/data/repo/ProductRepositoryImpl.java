package com.sevenlearn.nikestore.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u0011H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/ProductRepositoryImpl;", "Lcom/sevenlearn/nikestore/data/repo/ProductRepository;", "remoteDataSource", "Lcom/sevenlearn/nikestore/data/repo/source/ProductDataSource;", "localDataSource", "Lcom/sevenlearn/nikestore/data/repo/source/ProductLocalDataSource;", "(Lcom/sevenlearn/nikestore/data/repo/source/ProductDataSource;Lcom/sevenlearn/nikestore/data/repo/source/ProductLocalDataSource;)V", "getLocalDataSource", "()Lcom/sevenlearn/nikestore/data/repo/source/ProductLocalDataSource;", "getRemoteDataSource", "()Lcom/sevenlearn/nikestore/data/repo/source/ProductDataSource;", "addToFavorites", "Lio/reactivex/Completable;", "product", "Lcom/sevenlearn/nikestore/data/Product;", "deleteFromFavorites", "getFavoriteProducts", "Lio/reactivex/Single;", "", "getProducts", "sort", "", "app_debug"})
public final class ProductRepositoryImpl implements com.sevenlearn.nikestore.data.repo.ProductRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.source.ProductDataSource remoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.source.ProductLocalDataSource localDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Product>> getProducts(int sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Product>> getFavoriteProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable addToFavorites(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.Product product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable deleteFromFavorites(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.Product product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.source.ProductDataSource getRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.source.ProductLocalDataSource getLocalDataSource() {
        return null;
    }
    
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.source.ProductDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.source.ProductLocalDataSource localDataSource) {
        super();
    }
}