package com.example.gambling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gambling.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener() { gamble() }

    }


        fun gamble() {
            var g1 = (1..13).random()
            var g2 = (1..13).random()
            var g3 = (1..13).random()
            var p = binding.moneyValue.text.toString()
            var o = p.toDoubleOrNull()
            if (g1 == 1 || g1 == 2) {
                binding.slot1.setImageResource(R.drawable._677586)
            } else if (g1 == 3 || g1 == 4) {
                binding.slot1.setImageResource(R.drawable.apple)
            } else if (g1 == 5 || g1 == 6) {
                binding.slot1.setImageResource(R.drawable.grape)
            } else if (g1 == 7 || g1 == 8) {
                binding.slot1.setImageResource(R.drawable.orange)
            } else if (g1 == 9 || g1 == 10) {
                binding.slot1.setImageResource(R.drawable.sweet_berries)
            } else if (g1 == 11 || g1 == 12) {
                binding.slot1.setImageResource(R.drawable.seven_leaf_clover)
            } else {
                binding.slot1.setImageResource(R.drawable.numba7)
            }

            if (g2 == 1 || g2 == 2) {
                binding.slot2.setImageResource(R.drawable._677586)
            } else if (g2 == 3 || g2 == 4) {
                binding.slot2.setImageResource(R.drawable.apple)
            } else if (g2 == 5 || g2 == 6) {
                binding.slot2.setImageResource(R.drawable.grape)
            } else if (g2 == 7 || g2 == 8) {
                binding.slot2.setImageResource(R.drawable.orange)
            } else if (g2 == 9 || g2 == 10) {
                binding.slot2.setImageResource(R.drawable.sweet_berries)
            } else if (g2 == 11 || g2 == 12) {
                binding.slot2.setImageResource(R.drawable.seven_leaf_clover)
            } else {
                binding.slot2.setImageResource(R.drawable.numba7)
            }

            if (g3 == 1 || g3 == 2) {
                binding.slot3.setImageResource(R.drawable._677586)
            } else if (g3 == 3 || g3 == 4) {
                binding.slot3.setImageResource(R.drawable.apple)
            } else if (g3 == 5 || g3 == 6) {
                binding.slot3.setImageResource(R.drawable.grape)
            } else if (g3 == 7 || g3 == 8) {
                binding.slot3.setImageResource(R.drawable.orange)
            } else if (g3 == 9 || g3 == 10) {
                binding.slot3.setImageResource(R.drawable.sweet_berries)
            } else if (g3 == 11 || g3 == 12) {
                binding.slot3.setImageResource(R.drawable.seven_leaf_clover)
            } else if (g3 == 13) {
                binding.slot3.setImageResource(R.drawable.numba7)
            }
        }
    }

