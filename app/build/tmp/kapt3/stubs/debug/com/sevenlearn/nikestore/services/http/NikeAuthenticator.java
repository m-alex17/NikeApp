package com.sevenlearn.nikestore.services.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/sevenlearn/nikestore/services/http/NikeAuthenticator;", "Lokhttp3/Authenticator;", "Lorg/koin/core/component/KoinComponent;", "()V", "apiService", "Lcom/sevenlearn/nikestore/services/http/ApiService;", "getApiService", "()Lcom/sevenlearn/nikestore/services/http/ApiService;", "apiService$delegate", "Lkotlin/Lazy;", "userLocalDataSource", "Lcom/sevenlearn/nikestore/data/repo/source/UserDataSource;", "getUserLocalDataSource", "()Lcom/sevenlearn/nikestore/data/repo/source/UserDataSource;", "userLocalDataSource$delegate", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "refreshToken", "", "app_debug"})
public final class NikeAuthenticator implements okhttp3.Authenticator, org.koin.core.component.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy apiService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy userLocalDataSource$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.services.http.ApiService getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sevenlearn.nikestore.data.repo.source.UserDataSource getUserLocalDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable()
    okhttp3.Route route, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String refreshToken() {
        return null;
    }
    
    public NikeAuthenticator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}