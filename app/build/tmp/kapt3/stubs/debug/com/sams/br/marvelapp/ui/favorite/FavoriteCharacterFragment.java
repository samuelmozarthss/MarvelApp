package com.sams.br.marvelapp.ui.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0012H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/sams/br/marvelapp/ui/favorite/FavoriteCharacterFragment;", "Lcom/sams/br/marvelapp/ui/base/BaseFragment;", "Lcom/sams/br/marvelapp/databinding/FragmentFavoriteCharacterBinding;", "Lcom/sams/br/marvelapp/ui/favorite/FavoriteCharacterViewModel;", "()V", "characterAdapter", "Lcom/sams/br/marvelapp/ui/adapter/CharacterAdapter;", "getCharacterAdapter", "()Lcom/sams/br/marvelapp/ui/adapter/CharacterAdapter;", "characterAdapter$delegate", "Lkotlin/Lazy;", "characterModel", "Lcom/sams/br/marvelapp/data/model/character/CharacterModel;", "viewModel", "getViewModel", "()Lcom/sams/br/marvelapp/ui/favorite/FavoriteCharacterViewModel;", "viewModel$delegate", "clickAdapter", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "itemTouchHelperCallback", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "observer", "Lkotlinx/coroutines/Job;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FavoriteCharacterFragment extends com.sams.br.marvelapp.ui.base.BaseFragment<com.sams.br.marvelapp.databinding.FragmentFavoriteCharacterBinding, com.sams.br.marvelapp.ui.favorite.FavoriteCharacterViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy characterAdapter$delegate = null;
    private com.sams.br.marvelapp.data.model.character.CharacterModel characterModel;
    
    public FavoriteCharacterFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.sams.br.marvelapp.ui.favorite.FavoriteCharacterViewModel getViewModel() {
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
    
    private final kotlinx.coroutines.Job observer() {
        return null;
    }
    
    private final void clickAdapter() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback itemTouchHelperCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.sams.br.marvelapp.databinding.FragmentFavoriteCharacterBinding getViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
}