// Generated by view binder compiler. Do not edit!
package com.sams.br.marvelapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.sams.br.marvelapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemComicBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imgComic;

  @NonNull
  public final MaterialTextView tvDescriptionComic;

  @NonNull
  public final MaterialTextView tvNameComic;

  private ItemComicBinding(@NonNull MaterialCardView rootView, @NonNull ImageView imgComic,
      @NonNull MaterialTextView tvDescriptionComic, @NonNull MaterialTextView tvNameComic) {
    this.rootView = rootView;
    this.imgComic = imgComic;
    this.tvDescriptionComic = tvDescriptionComic;
    this.tvNameComic = tvNameComic;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemComicBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemComicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_comic, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemComicBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgComic;
      ImageView imgComic = ViewBindings.findChildViewById(rootView, id);
      if (imgComic == null) {
        break missingId;
      }

      id = R.id.tvDescriptionComic;
      MaterialTextView tvDescriptionComic = ViewBindings.findChildViewById(rootView, id);
      if (tvDescriptionComic == null) {
        break missingId;
      }

      id = R.id.tvNameComic;
      MaterialTextView tvNameComic = ViewBindings.findChildViewById(rootView, id);
      if (tvNameComic == null) {
        break missingId;
      }

      return new ItemComicBinding((MaterialCardView) rootView, imgComic, tvDescriptionComic,
          tvNameComic);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
