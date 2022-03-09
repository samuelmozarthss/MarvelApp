package com.sams.br.marvelapp.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020%H\u0016J,\u0010&\u001a\u001e\u0012\f\u0012\n )*\u0004\u0018\u00010(0(\u0012\f\u0012\n )*\u0004\u0018\u00010*0*0\'2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u0002022\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u00103\u001a\u000204H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00065"}, d2 = {"Lcom/sams/br/marvelapp/ui/detail/DetailCharacterFragment;", "Lcom/sams/br/marvelapp/ui/base/BaseFragment;", "Lcom/sams/br/marvelapp/databinding/FragmentDetailsCharacterBinding;", "Lcom/sams/br/marvelapp/ui/detail/DetailCharacterViewModel;", "()V", "args", "Lcom/sams/br/marvelapp/ui/detail/DetailCharacterFragmentArgs;", "getArgs", "()Lcom/sams/br/marvelapp/ui/detail/DetailCharacterFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "characterModel", "Lcom/sams/br/marvelapp/data/model/character/CharacterModel;", "comicAdapter", "Lcom/sams/br/marvelapp/ui/adapter/ComicAdapter;", "getComicAdapter", "()Lcom/sams/br/marvelapp/ui/adapter/ComicAdapter;", "comicAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/sams/br/marvelapp/ui/detail/DetailCharacterViewModel;", "viewModel$delegate", "collectObserver", "Lkotlinx/coroutines/Job;", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "Landroid/view/MenuInflater;", "onLoadCharacter", "Lcom/bumptech/glide/request/target/ViewTarget;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "Landroid/graphics/drawable/Drawable;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onShowDialog", "onViewCreated", "view", "Landroid/view/View;", "setupRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailCharacterFragment extends com.sams.br.marvelapp.ui.base.BaseFragment<com.sams.br.marvelapp.databinding.FragmentDetailsCharacterBinding, com.sams.br.marvelapp.ui.detail.DetailCharacterViewModel> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy comicAdapter$delegate = null;
    private com.sams.br.marvelapp.data.model.character.CharacterModel characterModel;
    
    public DetailCharacterFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.sams.br.marvelapp.ui.detail.DetailCharacterViewModel getViewModel() {
        return null;
    }
    
    private final com.sams.br.marvelapp.ui.detail.DetailCharacterFragmentArgs getArgs() {
        return null;
    }
    
    private final com.sams.br.marvelapp.ui.adapter.ComicAdapter getComicAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onShowDialog(com.sams.br.marvelapp.data.model.character.CharacterModel characterModel) {
    }
    
    private final kotlinx.coroutines.Job collectObserver() {
        return null;
    }
    
    private final com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, android.graphics.drawable.Drawable> onLoadCharacter(com.sams.br.marvelapp.data.model.character.CharacterModel characterModel) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView setupRecyclerView() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.sams.br.marvelapp.databinding.FragmentDetailsCharacterBinding getViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
}