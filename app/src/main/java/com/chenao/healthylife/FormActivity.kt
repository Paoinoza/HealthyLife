package com.chenao.healthylife

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3
import java.util.*

class FormActivity : AppCompatActivity() {
    private val formList = mutableListOf<Int>() // Lista de diseños de formulario
    private lateinit var viewPager: ViewPager2
    private var selectedDate: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        viewPager = findViewById(R.id.view_pager2)

        // Agrega los diseños de formulario a la lista
        formList.add(R.layout.item_form_page)
        formList.add(R.layout.item_form_page1)
        formList.add(R.layout.item_form_page2)
        formList.add(R.layout.item_form_page3)
        formList.add(R.layout.item_form_page4)
        formList.add(R.layout.item_form_page5)
        formList.add(R.layout.item_form_page6)


        // Agrega más páginas de formulario según tus necesidades

        viewPager.adapter = FormPagerAdapter(formList)
        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(viewPager)

    }


}
