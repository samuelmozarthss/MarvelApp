package com.sams.br.marvelapp.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0010H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\f\u0010\r\u00a8\u0006&"}, d2 = {"Lcom/sams/br/marvelapp/ui/search/SearchCharacterFragment;", "Lcom/sams/br/marvelapp/ui/base/BaseFragment;", "Lcom/sams/br/marvelapp/databinding/FragmentSearchCharacterBinding;", "Lcom/sams/br/marvelapp/ui/search/SearchCharacterViewModel;", "()V", "characterAdapter", "Lcom/sams/br/marvelapp/ui/adapter/CharacterAdapter;", "getCharacterAdapter", "()Lcom/sams/br/marvelapp/ui/adapter/CharacterAdapter;", "characterAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/sams/br/marvelapp/ui/search/SearchCharacterViewModel;", "viewModel$delegate", "clickAdapter", "", "collectObserver", "Lkotlinx/coroutines/Job;", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "searchInit", "query", "", "searchQuery", "setupRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "updateCharacterList", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchCharacterFragment extends com.sams.br.marvelapp.ui.base.BaseFragment<com.sams.br.marvelapp.databinding.FragmentSearchCharacterBinding, com.sams.br.marvelapp.ui.search.SearchCharacterViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy characterAdapter$delegate = null;
    
    public SearchCharacterFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.sams.br.marvelapp.ui.search.SearchCharacterViewModel getViewModel() {
        return null;
    }
    
    private final com.sams.br.marvelapp.ui.adapter.CharacterAdapter getCharacterAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job collectObserver() {
        return null;
    }
    
    private final void searchInit(java.lang.String query) {
    }
    
    private final void updateCharacterList() {
    }
    
    private final void searchQuery(java.lang.String query) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void clickAdapter() {
    }
    
    private final androidx.recyclerview.widget.RecyclerView setupRecyclerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.sams.br.marvelapp.databinding.FragmentSearchCharacterBinding getViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
}