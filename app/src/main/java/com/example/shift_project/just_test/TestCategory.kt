package com.example.shift_project.just_test

import java.io.Serializable

class TestCategory(var id: Int, var name: String,var sum: Double) : Serializable{

    fun getInfo(): String{
        return "Category : $name, Sum: $sum"
    }
}

//
//<LinearLayout
//android:id="@+id/linearLayout"
//android:layout_width="0dp"
//android:layout_height="0dp"
//android:layout_marginStart="8dp"
//android:layout_marginTop="8dp"
//android:layout_marginEnd="8dp"
//android:layout_marginBottom="8dp"
//android:orientation="vertical"
//app:layout_constraintBottom_toBottomOf="parent"
//app:layout_constraintEnd_toEndOf="parent"
//app:layout_constraintStart_toStartOf="parent"
//app:layout_constraintTop_toTopOf="parent">
//
//<TextView
//android:id="@+id/shopTextView"
//android:layout_width="match_parent"
//android:layout_height="wrap_content"
//android:textColor="@color/colorPrimaryDark"
//android:textSize="24sp"
//android:textStyle="italic"/>
//</LinearLayout>