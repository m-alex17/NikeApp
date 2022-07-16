package com.sevenlearn.nikestore.data.repo.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/source/ProductRemoteDataSource;", "Lcom/sevenlearn/nikestore/data/repo/source/ProductDataSource;", "apiService", "Lcom/sevenlearn/nikestore/services/http/ApiService;", "(Lcom/sevenlearn/nikestore/services/http/ApiService;)V", "getApiService", "()Lcom/sevenlearn/nikestore/services/http/ApiService;", "addToFavorites", "Lio/reactivex/Completable;", "product", "Lcom/sevenlearn/nikestore/data/Product;", "deleteFromFavorites", "getFavoriteProducts", "Lio/reactivex/Single;", "", "getProducts", "sort", "", "app_debug"})
public final class ProductRemoteDataSource implements com.sevenlearn.nikestore.data.repo.source.ProductDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.services.http.ApiService apiService = null;
    
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
    public final com.sevenlearn.nikestore.services.http.ApiService getApiService() {
        return null;
    }
    
    public ProductRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.services.http.ApiService apiService) {
        super();
    }
}