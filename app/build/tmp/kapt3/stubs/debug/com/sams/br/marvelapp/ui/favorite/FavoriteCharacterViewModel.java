package com.sams.br.marvelapp.ui.favorite;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010\u0011\u001a\u00020\u000fH\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sams/br/marvelapp/ui/favorite/FavoriteCharacterViewModel;", "Landroidx/lifecycle/ViewModel;", "respository", "Lcom/sams/br/marvelapp/repository/MarvelRepository;", "(Lcom/sams/br/marvelapp/repository/MarvelRepository;)V", "_favorites", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/sams/br/marvelapp/ui/state/ResourceState;", "", "Lcom/sams/br/marvelapp/data/model/character/CharacterModel;", "favorites", "Lkotlinx/coroutines/flow/StateFlow;", "getFavorites", "()Lkotlinx/coroutines/flow/StateFlow;", "delete", "Lkotlinx/coroutines/Job;", "characterModel", "fetch", "app_debug"})
public final class FavoriteCharacterViewModel extends androidx.lifecycle.ViewModel {
    private final com.sams.br.marvelapp.repository.MarvelRepository respository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.sams.br.marvelapp.ui.state.ResourceState<java.util.List<com.sams.br.marvelapp.data.model.character.CharacterModel>>> _favorites = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.sams.br.marvelapp.ui.state.ResourceState<java.util.List<com.sams.br.marvelapp.data.model.character.CharacterModel>>> favorites = null;
    
    @javax.inject.Inject()
    public FavoriteCharacterViewModel(@org.jetbrains.annotations.NotNull()
    com.sams.br.marvelapp.repository.MarvelRepository respository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.sams.br.marvelapp.ui.state.ResourceState<java.util.List<com.sams.br.marvelapp.data.model.character.CharacterModel>>> getFavorites() {
        return null;
    }
    
    private final kotlinx.coroutines.Job fetch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull()
    com.sams.br.marvelapp.data.model.character.CharacterModel characterModel) {
        return null;
    }
}