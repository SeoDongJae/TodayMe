package com.example.todayme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.todayme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setInitialize()
    }

    private fun setInitialize() {
        // 뷰 바인딩 구성
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMove.setOnClickListener(this)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.btn_move -> {
                startActivity(Intent(binding.root.context, ResultActivity::class.java))
            }
        }
    }
}