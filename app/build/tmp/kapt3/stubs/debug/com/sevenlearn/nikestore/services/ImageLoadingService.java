package com.sevenlearn.nikestore.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/sevenlearn/nikestore/services/ImageLoadingService;", "", "load", "", "imageView", "Lcom/sevenlearn/nikestore/view/NikeImageView;", "imageUrl", "", "app_debug"})
public abstract interface ImageLoadingService {
    
    public abstract void load(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.view.NikeImageView imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl);
}