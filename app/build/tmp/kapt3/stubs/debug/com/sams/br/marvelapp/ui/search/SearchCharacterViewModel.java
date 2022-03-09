package com.sams.br.marvelapp.ui.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0002J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/sams/br/marvelapp/ui/search/SearchCharacterViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/sams/br/marvelapp/repository/MarvelRepository;", "(Lcom/sams/br/marvelapp/repository/MarvelRepository;)V", "_searchCharacter", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/sams/br/marvelapp/ui/state/ResourceState;", "Lcom/sams/br/marvelapp/data/model/character/CharacterModelResponse;", "searchCharacter", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchCharacter", "()Lkotlinx/coroutines/flow/StateFlow;", "fetch", "Lkotlinx/coroutines/Job;", "nameStartsWith", "", "handleResponse", "response", "Lretrofit2/Response;", "safeFetch", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SearchCharacterViewModel extends androidx.lifecycle.ViewModel {
    private final com.sams.br.marvelapp.repository.MarvelRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.sams.br.marvelapp.ui.state.ResourceState<com.sams.br.marvelapp.data.model.character.CharacterModelResponse>> _searchCharacter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.sams.br.marvelapp.ui.state.ResourceState<com.sams.br.marvelapp.data.model.character.CharacterModelResponse>> searchCharacter = null;
    
    @javax.inject.Inject()
    public SearchCharacterViewModel(@org.jetbrains.annotations.NotNull()
    com.sams.br.marvelapp.repository.MarvelRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.sams.br.marvelapp.ui.state.ResourceState<com.sams.br.marvelapp.data.model.character.CharacterModelResponse>> getSearchCharacter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fetch(@org.jetbrains.annotations.NotNull()
    java.lang.String nameStartsWith) {
        return null;
    }
    
    private final java.lang.Object safeFetch(java.lang.String nameStartsWith, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.sams.br.marvelapp.ui.state.ResourceState<com.sams.br.marvelapp.data.model.character.CharacterModelResponse> handleResponse(retrofit2.Response<com.sams.br.marvelapp.data.model.character.CharacterModelResponse> response) {
        return null;
    }
}