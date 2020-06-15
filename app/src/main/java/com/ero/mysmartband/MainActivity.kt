package com.ero.mysmartband

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ListSmartbandAdapter.OnItemClickCallback {
    private var list: ArrayList<Smartband> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar_list.run {
            title = getString(R.string.daftar_smartband)
            setSupportActionBar(this)
        }
        recyclerSmartband.setHasFixedSize(true)

        list.addAll(SmartbandData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        recyclerSmartband.layoutManager = LinearLayoutManager(this)
        val listsbAdapter = ListSmartbandAdapter(this@MainActivity, list)
        recyclerSmartband.adapter = listsbAdapter

        listsbAdapter.setOnItemClickCallback(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_setting) {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onItemClicked(listsb: Smartband) {
        TODO("Not yet implemented")
    }
}
