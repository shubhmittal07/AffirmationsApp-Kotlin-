package com.example.affirmationsrevisited.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class affirmation(
        @StringRes val stringResourceID: Int,
        @DrawableRes val imageResourceID: Int)