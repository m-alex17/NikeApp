package com.sevenlearn.nikestore.data.repo.order

import com.sevenlearn.nikestore.data.Checkout
import com.sevenlearn.nikestore.data.OrderHistoryItem
import com.sevenlearn.nikestore.data.SubmitOrderResult
import io.reactivex.Single

interface OrderRepository {

    fun submit(
        firstName: String,
        lastName: String,
        postalCode: String,
        phoneNumber: String,
        address: String,
        paymentMethod: String
    ): Single<SubmitOrderResult>

    fun checkout(orderId: Int): Single<Checkout>

    fun list():Single<List<OrderHistoryItem>>
}