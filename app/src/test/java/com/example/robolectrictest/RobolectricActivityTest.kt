package com.example.robolectrictest

import android.widget.LinearLayout
import android.widget.TextView
import org.hamcrest.CoreMatchers.equalTo

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat


@RunWith(RobolectricTestRunner::class)
@Config(manifest=Config.NONE)
//@Config(constants = BuildConfig::class)
class RobolectricActivityTest {

    private var activity: MainActivity? = null
    private lateinit var textView:TextView

    @Before
    @Throws(Exception::class)
    fun setUp() {
        activity = Robolectric.buildActivity(MainActivity::class.java)
            .create()
            .resume()
            .get()
        textView = activity!!.findViewById(R.id.hello_textview)
    }

    @Test
    //@Throws(Exception::class)
    fun shouldHaveDefaultMargin() {
        val bottomMargin = (textView.layoutParams as LinearLayout.LayoutParams).bottomMargin
        assertEquals(5, bottomMargin.toLong())
        val topMargin = (textView.layoutParams as LinearLayout.LayoutParams).topMargin
        assertEquals(5, topMargin.toLong())
        val rightMargin = (textView.layoutParams as LinearLayout.LayoutParams).rightMargin
        assertEquals(10, rightMargin.toLong())
        val leftMargin = (textView.layoutParams as LinearLayout.LayoutParams).leftMargin
        assertEquals(10, leftMargin.toLong())
    }
    @Test
    @Throws(Exception::class)
    fun shouldHaveCorrectAppName() {
        val hello = activity!!.getResources().getString(R.string.hello)
        assertThat(textView.text.toString(), equalTo(hello))
    }
}