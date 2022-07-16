package com.sevenlearn.nikestore.feature.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/sevenlearn/nikestore/feature/checkout/CheckoutViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "orderId", "", "orderRepository", "Lcom/sevenlearn/nikestore/data/repo/order/OrderRepository;", "(ILcom/sevenlearn/nikestore/data/repo/order/OrderRepository;)V", "checkoutLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sevenlearn/nikestore/data/Checkout;", "getCheckoutLiveData", "()Landroidx/lifecycle/MutableLiveData;", "app_debug"})
public final class CheckoutViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.sevenlearn.nikestore.data.Checkout> checkoutLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sevenlearn.nikestore.data.Checkout> getCheckoutLiveData() {
        return null;
    }
    
    public CheckoutViewModel(int orderId, @org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.order.OrderRepository orderRepository) {
        super();
    }
}