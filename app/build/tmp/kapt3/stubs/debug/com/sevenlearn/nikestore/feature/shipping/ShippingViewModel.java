package com.sevenlearn.nikestore.feature.shipping;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/sevenlearn/nikestore/feature/shipping/ShippingViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "orderRepository", "Lcom/sevenlearn/nikestore/data/repo/order/OrderRepository;", "(Lcom/sevenlearn/nikestore/data/repo/order/OrderRepository;)V", "submitOrder", "Lio/reactivex/Single;", "Lcom/sevenlearn/nikestore/data/SubmitOrderResult;", "firstName", "", "lastName", "postalCode", "phoneNumber", "address", "paymentMethod", "app_debug"})
public final class ShippingViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    private final com.sevenlearn.nikestore.data.repo.order.OrderRepository orderRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.sevenlearn.nikestore.data.SubmitOrderResult> submitOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod) {
        return null;
    }
    
    public ShippingViewModel(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.order.OrderRepository orderRepository) {
        super();
    }
}