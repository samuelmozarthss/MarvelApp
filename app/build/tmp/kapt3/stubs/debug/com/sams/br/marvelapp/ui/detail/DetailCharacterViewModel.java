package com.sams.br.marvelapp.ui.detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/sams/br/marvelapp/ui/detail/DetailCharacterViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/sams/br/marvelapp/repository/MarvelRepository;", "(Lcom/sams/br/marvelapp/repository/MarvelRepository;)V", "_details", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/sams/br/marvelapp/ui/state/ResourceState;", "Lcom/sams/br/marvelapp/data/model/comic/ComicModelResponse;", "details", "Lkotlinx/coroutines/flow/StateFlow;", "getDetails", "()Lkotlinx/coroutines/flow/StateFlow;", "fetch", "Lkotlinx/coroutines/Job;", "characterId", "", "handleResponse", "response", "Lretrofit2/Response;", "insert", "characterModel", "Lcom/sams/br/marvelapp/data/model/character/CharacterModel;", "safeFetch", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DetailCharacterViewModel extends androidx.lifecycle.ViewModel {
    private final com.sams.br.marvelapp.repository.MarvelRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.sams.br.marvelapp.ui.state.ResourceState<com.sams.br.marvelapp.data.model.comic.ComicModelResponse>> _details = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.sams.br.marvelapp.ui.state.ResourceState<com.sams.br.marvelapp.data.model.comic.ComicModelResponse>> details = null;
    
    @javax.inject.Inject()
    public DetailCharacterViewModel(@org.jetbrains.annotations.NotNull()
    com.sams.br.marvelapp.repository.MarvelRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.sams.br.marvelapp.ui.state.ResourceState<com.sams.br.marvelapp.data.model.comic.ComicModelResponse>> getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fetch(int characterId) {
        return null;
    }
    
    private final java.lang.Object safeFetch(int characterId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.sams.br.marvelapp.ui.state.ResourceState<com.sams.br.marvelapp.data.model.comic.ComicModelResponse> handleResponse(retrofit2.Response<com.sams.br.marvelapp.data.model.comic.ComicModelResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.sams.br.marvelapp.data.model.character.CharacterModel characterModel) {
        return null;
    }
}