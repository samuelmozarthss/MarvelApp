package com.sams.br.marvelapp.ui.list

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.sams.br.marvelapp.R
import com.sams.br.marvelapp.`data`.model.character.CharacterModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ListCharacterFragmentDirections private constructor() {
  private data class ActionListCharacterFragmentToDetailCharacterFragment(
    public val character: CharacterModel
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_listCharacterFragment_to_detailCharacterFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionListCharacterFragmentToDetailCharacterFragment(character: CharacterModel):
        NavDirections = ActionListCharacterFragmentToDetailCharacterFragment(character)
  }
}
