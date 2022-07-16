package com.sevenlearn.nikestore.services.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0003H\'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u000bH\'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r0\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\u0003H\'J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006%"}, d2 = {"Lcom/sevenlearn/nikestore/services/http/ApiService;", "", "addToCart", "Lio/reactivex/Single;", "Lcom/sevenlearn/nikestore/data/AddToCartResponse;", "jsonObject", "Lcom/google/gson/JsonObject;", "changeCount", "checkout", "Lcom/sevenlearn/nikestore/data/Checkout;", "orderId", "", "getBanners", "", "Lcom/sevenlearn/nikestore/data/Banner;", "getCart", "Lcom/sevenlearn/nikestore/data/CartResponse;", "getCartItemsCount", "Lcom/sevenlearn/nikestore/data/CartItemCount;", "getComments", "Lcom/sevenlearn/nikestore/data/Comment;", "productId", "getProducts", "Lcom/sevenlearn/nikestore/data/Product;", "sort", "", "login", "Lcom/sevenlearn/nikestore/data/TokenResponse;", "orders", "Lcom/sevenlearn/nikestore/data/OrderHistoryItem;", "refreshToken", "Lretrofit2/Call;", "removeItemFromCart", "Lcom/sevenlearn/nikestore/data/MessageResponse;", "signUp", "submitOrder", "Lcom/sevenlearn/nikestore/data/SubmitOrderResult;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "product/list")
    public abstract io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Product>> getProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort")
    java.lang.String sort);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "banner/slider")
    public abstract io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Banner>> getBanners();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "comment/list")
    public abstract io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.Comment>> getComments(@retrofit2.http.Query(value = "product_id")
    int productId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "cart/add")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.AddToCartResponse> addToCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "cart/remove")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.MessageResponse> removeItemFromCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "cart/list")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.CartResponse> getCart();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "cart/changeCount")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.AddToCartResponse> changeCount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "cart/count")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.CartItemCount> getCartItemsCount();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "auth/token")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.TokenResponse> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/register")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.MessageResponse> signUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "auth/token")
    public abstract retrofit2.Call<com.sevenlearn.nikestore.data.TokenResponse> refreshToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "order/submit")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.SubmitOrderResult> submitOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "order/checkout")
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.Checkout> checkout(@retrofit2.http.Query(value = "order_id")
    int orderId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "order/list")
    public abstract io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.OrderHistoryItem>> orders();
}