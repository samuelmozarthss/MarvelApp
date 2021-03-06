// Generated by view binder compiler. Do not edit!
package com.sams.br.marvelapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import com.sams.br.marvelapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailsCharacterBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView imgCharacterDetails;

  @NonNull
  public final ProgressBar progressBarDetail;

  @NonNull
  public final RecyclerView rvComics;

  @NonNull
  public final MaterialTextView textView;

  @NonNull
  public final MaterialTextView tvDescriptionCharacterDetails;

  @NonNull
  public final MaterialTextView tvNameCharacterDetails;

  private FragmentDetailsCharacterBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ImageView imgCharacterDetails, @NonNull ProgressBar progressBarDetail,
      @NonNull RecyclerView rvComics, @NonNull MaterialTextView textView,
      @NonNull MaterialTextView tvDescriptionCharacterDetails,
      @NonNull MaterialTextView tvNameCharacterDetails) {
    this.rootView = rootView;
    this.imgCharacterDetails = imgCharacterDetails;
    this.progressBarDetail = progressBarDetail;
    this.rvComics = rvComics;
    this.textView = textView;
    this.tvDescriptionCharacterDetails = tvDescriptionCharacterDetails;
    this.tvNameCharacterDetails = tvNameCharacterDetails;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailsCharacterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailsCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_details_character, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailsCharacterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgCharacterDetails;
      ImageView imgCharacterDetails = ViewBindings.findChildViewById(rootView, id);
      if (imgCharacterDetails == null) {
        break missingId;
      }

      id = R.id.progressBarDetail;
      ProgressBar progressBarDetail = ViewBindings.findChildViewById(rootView, id);
      if (progressBarDetail == null) {
        break missingId;
      }

      id = R.id.rvComics;
      RecyclerView rvComics = ViewBindings.findChildViewById(rootView, id);
      if (rvComics == null) {
        break missingId;
      }

      id = R.id.textView;
      MaterialTextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tvDescriptionCharacterDetails;
      MaterialTextView tvDescriptionCharacterDetails = ViewBindings.findChildViewById(rootView, id);
      if (tvDescriptionCharacterDetails == null) {
        break missingId;
      }

      id = R.id.tvNameCharacterDetails;
      MaterialTextView tvNameCharacterDetails = ViewBindings.findChildViewById(rootView, id);
      if (tvNameCharacterDetails == null) {
        break missingId;
      }

      return new FragmentDetailsCharacterBinding((CoordinatorLayout) rootView, imgCharacterDetails,
          progressBarDetail, rvComics, textView, tvDescriptionCharacterDetails,
          tvNameCharacterDetails);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
