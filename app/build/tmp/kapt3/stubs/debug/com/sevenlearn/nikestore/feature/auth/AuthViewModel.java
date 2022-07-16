package com.sevenlearn.nikestore.feature.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sevenlearn/nikestore/feature/auth/AuthViewModel;", "Lcom/sevenlearn/nikestore/common/NikeViewModel;", "userRepository", "Lcom/sevenlearn/nikestore/data/repo/UserRepository;", "(Lcom/sevenlearn/nikestore/data/repo/UserRepository;)V", "login", "Lio/reactivex/Completable;", "email", "", "password", "signUp", "app_debug"})
public final class AuthViewModel extends com.sevenlearn.nikestore.common.NikeViewModel {
    private final com.sevenlearn.nikestore.data.repo.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.data.repo.UserRepository userRepository) {
        super();
    }
}