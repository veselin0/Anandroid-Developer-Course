package com.example.selfpromoapp

import android.os.Parcel
import android.os.Parcelable

data class Message(
    val contactName: String?,
    val contactNumber: String?,
    val myDisplayName: String?,
    val includeJunior: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String?
)

