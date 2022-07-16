package com.sevenlearn.nikestore.data.repo.order;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H&J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH&\u00a8\u0006\u0013"}, d2 = {"Lcom/sevenlearn/nikestore/data/repo/order/OrderRepository;", "", "checkout", "Lio/reactivex/Single;", "Lcom/sevenlearn/nikestore/data/Checkout;", "orderId", "", "list", "", "Lcom/sevenlearn/nikestore/data/OrderHistoryItem;", "submit", "Lcom/sevenlearn/nikestore/data/SubmitOrderResult;", "firstName", "", "lastName", "postalCode", "phoneNumber", "address", "paymentMethod", "app_debug"})
public abstract interface OrderRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.SubmitOrderResult> submit(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sevenlearn.nikestore.data.Checkout> checkout(int orderId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sevenlearn.nikestore.data.OrderHistoryItem>> list();
}