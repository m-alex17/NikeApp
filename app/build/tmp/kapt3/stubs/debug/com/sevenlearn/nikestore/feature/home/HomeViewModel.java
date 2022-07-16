package com.sevenlearn.nikestore.feature.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/sevenlearn/nikestore/feature/home/HomeViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "productRepository", "Lcom/sevenlearn/nikestore/data/repo/ProductRepository;", "bannerRepository", "Lcom/sevenlearn/nikestore/data/repo/BannerRepository;", "(Lcom/sevenlearn/nikestore/data/repo/ProductRepository;Lcom/sevenlearn/nikestore/data/repo/BannerRepository;)V", "bannersLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/sevenlearn/nikestore/data/Banner;", "getBannersLiveData", "()Landroidx/lifecycle/MutableLiveData;", "productsLiveData", "Lcom/sevenlearn/nikestore/data/Product;", "getProductsLiveData", "addProductToFavorites", "", "product", "app_debug"})
public final class HomeViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Product>> productsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Banner>> bannersLiveData = null;
    private final com.sevenlearn.nikestore.data.repo.ProductRepository productRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Product>> getProductsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.sevenlearn.nikestore.data.Banner>> getBannersLiveData() {
        return null;
    }
    
    public final void addProductToFavorites(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.Product product) {
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.ProductRepository productRepository, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.BannerRepository bannerRepository) {
        super();
    }
}