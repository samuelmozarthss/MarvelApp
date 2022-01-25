// Generated by view binder compiler. Do not edit!
package com.sams.br.marvelappstarter.databinding;

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
import com.sams.br.marvelappstarter.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCharacterBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imgCharacter;

  @NonNull
  public final MaterialTextView tvDescriptionCharacter;

  @NonNull
  public final MaterialTextView tvNameCharacter;

  private ItemCharacterBinding(@NonNull MaterialCardView rootView, @NonNull ImageView imgCharacter,
      @NonNull MaterialTextView tvDescriptionCharacter, @NonNull MaterialTextView tvNameCharacter) {
    this.rootView = rootView;
    this.imgCharacter = imgCharacter;
    this.tvDescriptionCharacter = tvDescriptionCharacter;
    this.tvNameCharacter = tvNameCharacter;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCharacterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_character, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCharacterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgCharacter;
      ImageView imgCharacter = ViewBindings.findChildViewById(rootView, id);
      if (imgCharacter == null) {
        break missingId;
      }

      id = R.id.tvDescriptionCharacter;
      MaterialTextView tvDescriptionCharacter = ViewBindings.findChildViewById(rootView, id);
      if (tvDescriptionCharacter == null) {
        break missingId;
      }

      id = R.id.tvNameCharacter;
      MaterialTextView tvNameCharacter = ViewBindings.findChildViewById(rootView, id);
      if (tvNameCharacter == null) {
        break missingId;
      }

      return new ItemCharacterBinding((MaterialCardView) rootView, imgCharacter,
          tvDescriptionCharacter, tvNameCharacter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
