package com.sams.br.marvelapp.ui.favorite

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.sams.br.marvelapp.R
import com.sams.br.marvelapp.`data`.model.character.CharacterModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class FavoriteCharacterFragmentDirections private constructor() {
  private data class ActionFavoriteCharacterFragmentToDetailCharacterFragment(
    public val characterId: CharacterModel
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_favoriteCharacterFragment_to_detailCharacterFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public
        fun actionFavoriteCharacterFragmentToDetailCharacterFragment(characterId: CharacterModel):
        NavDirections = ActionFavoriteCharacterFragmentToDetailCharacterFragment(characterId)
  }
}
