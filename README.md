# Notion Link
- [Swapview Animation using placeholder](https://www.notion.so/Swapview-Animation-using-placeholder-f87852d0ad134fba9acf3a4806cac0ac)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9e07da74-efdd-4c6e-b13a-ee6706d8bbb7/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9e07da74-efdd-4c6e-b13a-ee6706d8bbb7/Untitled.png)

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun swapView(view: View) {
        TransitionManager.beginDelayedTransition(layout)
        placeHolder.setContentId(view.id)
    }

}
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <androidx.constraintlayout.widget.Placeholder
        android:id="@+id/placeHolder"
        android:layout_width="80dp"
        android:layout_height="64dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ImageView
        android:id="@+id/imageView6"
        android:layout_width="48dp"
        android:layout_height="64dp"
        android:layout_marginBottom="24dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/imageView5"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/imageView4"
        android:onClick="swapView"
        tools:srcCompat="@tools:sample/avatars" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:layout_marginBottom="24dp"
        android:src="@drawable/ic_launcher_background"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/imageView"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        android:onClick="swapView"
        tools:srcCompat="@tools:sample/avatars" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:layout_marginBottom="24dp"
        android:src="@drawable/ic_launcher_background"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/imageView4"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/imageView2"
        android:onClick="swapView"
        tools:srcCompat="@tools:sample/avatars" />

    <ImageView
        android:id="@+id/imageView4"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:layout_marginBottom="24dp"
        android:src="@drawable/ic_launcher_background"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/imageView6"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/imageView"
        android:onClick="swapView"
        tools:srcCompat="@tools:sample/avatars" />

    <ImageView
        android:id="@+id/imageView5"
        android:layout_width="48dp"
        android:layout_height="64dp"
        android:layout_marginBottom="24dp"
        android:src="@drawable/ic_launcher_background"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/imageView3"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/imageView6"
        android:onClick="swapView"
        tools:srcCompat="@tools:sample/avatars" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="48dp"
        android:layout_height="64dp"
        android:layout_marginBottom="24dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/imageView5"
        android:src="@drawable/ic_launcher_background"
        android:onClick="swapView"
        tools:srcCompat="@tools:sample/avatars" />

</androidx.constraintlayout.widget.ConstraintLayout>
```