package com.apherio.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by Apherio on 05/06/18.
 */

val Context.layoutInflater: LayoutInflater get() = LayoutInflater.from(this)