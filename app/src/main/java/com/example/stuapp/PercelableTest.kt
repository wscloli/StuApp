package com.example.stuapp

import android.os.Parcel
import android.os.Parcelable

/**
 *
 *@Auther MikuCat
 *@Time 2023/8/2
 */
class PercelableTest() : Parcelable{
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PercelableTest> {
        override fun createFromParcel(parcel: Parcel): PercelableTest {
            return PercelableTest(parcel)
        }

        override fun newArray(size: Int): Array<PercelableTest?> {
            return arrayOfNulls(size)
        }
    }
}