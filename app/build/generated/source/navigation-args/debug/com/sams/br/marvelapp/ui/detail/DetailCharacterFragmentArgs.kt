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
  public val characterId: CharacterModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(CharacterModel::class.java)) {
      result.putParcelable("characterId", this.characterId as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(CharacterModel::class.java)) {
      result.putSerializable("characterId", this.characterId as Serializable)
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
      val __characterId : CharacterModel?
      if (bundle.containsKey("characterId")) {
        if (Parcelable::class.java.isAssignableFrom(CharacterModel::class.java) ||
            Serializable::class.java.isAssignableFrom(CharacterModel::class.java)) {
          __characterId = bundle.get("characterId") as CharacterModel?
        } else {
          throw UnsupportedOperationException(CharacterModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__characterId == null) {
          throw IllegalArgumentException("Argument \"characterId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"characterId\" is missing and does not have an android:defaultValue")
      }
      return DetailCharacterFragmentArgs(__characterId)
    }
  }
}
