package com.sams.br.marvelapp.ui.detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.sams.br.marvelapp.`data`.model.character.CharacterModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailCharacterFragmentArgs(
  public val character: CharacterModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(CharacterModel::class.java)) {
      result.putParcelable("character", this.character as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(CharacterModel::class.java)) {
      result.putSerializable("character", this.character as Serializable)
    } else {
      throw UnsupportedOperationException(CharacterModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailCharacterFragmentArgs {
      bundle.setClassLoader(DetailCharacterFragmentArgs::class.java.classLoader)
      val __character : CharacterModel?
      if (bundle.containsKey("character")) {
        if (Parcelable::class.java.isAssignableFrom(CharacterModel::class.java) ||
            Serializable::class.java.isAssignableFrom(CharacterModel::class.java)) {
          __character = bundle.get("character") as CharacterModel?
        } else {
          throw UnsupportedOperationException(CharacterModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__character == null) {
          throw IllegalArgumentException("Argument \"character\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"character\" is missing and does not have an android:defaultValue")
      }
      return DetailCharacterFragmentArgs(__character)
    }
  }
}
