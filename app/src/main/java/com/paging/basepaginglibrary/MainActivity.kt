package com.paging.basepaginglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paging.basepaginglibrary.ui.main.CharactersListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, CharactersListFragment.newInstance())
                    .commitNow()
        }
    }
}