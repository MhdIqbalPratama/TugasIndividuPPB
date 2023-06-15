package com.example.week9

import android.R
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var tvSelectedOption: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.week9.R.layout.activity_main)

        tvSelectedOption = findViewById(com.example.week9.R.id.tvSelectedOption)

        val btnShowPicker: Button = findViewById(com.example.week9.R.id.btnShowPicker)
        btnShowPicker.setOnClickListener {
            showPicker()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(com.example.week9.R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            com.example.week9.R.id.menu_item1 -> {
                tvSelectedOption.text = "Pilihan : 1"
                return true
            }
            com.example.week9.R.id.menu_item2  -> {
                tvSelectedOption.text = "Pilihan : 2"
                return true
            }
            com.example.week9.R.id.menu_item3 -> {
                tvSelectedOption.text = "Pilihan : 3"
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun showMenu() {
        openOptionsMenu()
    }

    private fun showPicker() {
        val pickerOptions = arrayOf("1", "2", "3")

        val builder = androidx.appcompat.app.AlertDialog.Builder(this)
        builder.setTitle("Pilih : ")

        builder.setItems(pickerOptions) { _, which ->
            tvSelectedOption.text = "Kepilih: ${pickerOptions[which]}"
        }

        builder.create().show()
    }
}