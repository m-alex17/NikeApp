package com.sevenlearn.nikestore.feature.product;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/sevenlearn/nikestore/feature/product/CommentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sevenlearn/nikestore/feature/product/CommentAdapter$ViewHolder;", "showAll", "", "(Z)V", "value", "Ljava/util/ArrayList;", "Lcom/sevenlearn/nikestore/data/Comment;", "comments", "getComments", "()Ljava/util/ArrayList;", "setComments", "(Ljava/util/ArrayList;)V", "getShowAll", "()Z", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class CommentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sevenlearn.nikestore.feature.product.CommentAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.sevenlearn.nikestore.data.Comment> comments;
    private final boolean showAll = false;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sevenlearn.nikestore.data.Comment> getComments() {
        return null;
    }
    
    public final void setComments(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sevenlearn.nikestore.data.Comment> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sevenlearn.nikestore.feature.product.CommentAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sevenlearn.nikestore.feature.product.CommentAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final boolean getShowAll() {
        return false;
    }
    
    public CommentAdapter(boolean showAll) {
        super();
    }
    
    public CommentAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/sevenlearn/nikestore/feature/product/CommentAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "authorTv", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getAuthorTv", "()Landroid/widget/TextView;", "contentTv", "getContentTv", "dateTv", "getDateTv", "titleTv", "getTitleTv", "bindComment", "", "comment", "Lcom/sevenlearn/nikestore/data/Comment;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView titleTv = null;
        private final android.widget.TextView dateTv = null;
        private final android.widget.TextView authorTv = null;
        private final android.widget.TextView contentTv = null;
        
        public final android.widget.TextView getTitleTv() {
            return null;
        }
        
        public final android.widget.TextView getDateTv() {
            return null;
        }
        
        public final android.widget.TextView getAuthorTv() {
            return null;
        }
        
        public final android.widget.TextView getContentTv() {
            return null;
        }
        
        public final void bindComment(@org.jetbrains.annotations.NotNull()
        com.sevenlearn.nikestore.data.Comment comment) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}