package com.ero.mysmartband

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class DetailActivity : AppCompatActivity() {
    private var nama: String = ""
    private var baterai: String = ""
    private var deskripsi: String  = ""
    private var display: String = ""
    private var fitur: String = ""
    private var foto: Int = 0
    private var harga: String = ""
    private var link: String = ""

    private lateinit var ytWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        intent.apply {
            nama = getStringExtra("NAMA")?:""
            baterai = getStringExtra("BATERAI")?:""
            deskripsi = getStringExtra("DESKRIPSI")?:""
            display = getStringExtra("DISPLAY")?:""
            fitur = getStringExtra("FITUR")?:""
            foto = getIntExtra("FOTO", 0)
            harga = getStringExtra("HARGA")?:""
            link = getStringExtra("LINK")?:""
        }

        setupView()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setupView(){
        toolbar_detail.run {
            this.setNavigationOnClickListener {
                onBackPressed()
                this@DetailActivity.finish()
            }
        }
        appbar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            var scrollRange = -1

            if (scrollRange == -1){
                scrollRange = appBarLayout.totalScrollRange
            }

            if (scrollRange + verticalOffset == 0){
                toolbar_detail.setNavigationIcon(R.drawable.ic_back)
                collapsing_toolbar.setCollapsedTitleTextColor(resources.getColor(R.color.colorWhite))
            } else {
                toolbar_detail.setNavigationIcon(R.drawable.ic_back_black)
                collapsing_toolbar.setCollapsedTitleTextColor(resources.getColor(R.color.colorBlack))
            }
        })
        collapsing_toolbar.title = nama
        tv_deskripsi.text = deskripsi
        tv_harga.text = harga
        tv_display.text = display
        tv_fitur.text = fitur
        tv_baterai.text = baterai
        Glide.with(this@DetailActivity).load(foto).error(R.drawable.ic_huaweiband_4).into(toolbar_image)

        youtube_web_view.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }

        val webSettings = youtube_web_view.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true

        Log.e("LINK", link)
        youtube_web_view.loadUrl(link)
    }
}