package com.sevenlearn.nikestore.data.repo.order;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\bH\u0016J>\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/order/OrderRepositoryImpl;", "Lcom/sevenlearn/nikestore/data/repo/order/OrderRepository;", "orderDataSource", "Lcom/sevenlearn/nikestore/data/repo/order/OrderDataSource;", "(Lcom/sevenlearn/nikestore/data/repo/order/OrderDataSource;)V", "getOrderDataSource", "()Lcom/sevenlearn/nikestore/data/repo/order/OrderDataSource;", "checkout", "Lio/reactivex/Single;", "Lcom/sevenlearn/nikestore/data/Checkout;", "orderId", "", "list", "", "Lcom/sevenlearn/nikestore/data/OrderHistoryItem;", "submit", "Lcom/sevenlearn/nikestore/data/SubmitOrderResult;", "firstName", "", "lastName", "postalCode", "phoneNumber", "address", "paymentMethod", "app_debug"})
public final class OrderRepositoryImpl implements com.sevenlearn.nikestore.data.repo.order.OrderRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.sevenlearn.nikestore.data.repo.order.OrderDataSource orderDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.SubmitOrderResult> submit(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.sevenlearn.nikestore.data.Checkout> checkout(int orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.OrderHistoryItem>> list() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.order.OrderDataSource getOrderDataSource() {
        return null;
    }
    
    public OrderRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.order.OrderDataSource orderDataSource) {
        super();
    }
}