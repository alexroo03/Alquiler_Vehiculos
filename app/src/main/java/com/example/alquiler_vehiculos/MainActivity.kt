package com.example.alquiler_vehiculos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquiler_vehiculos.databinding.ActivityMainBinding
import com.example.alquiler_vehiculos.adapter.VehiculosAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Utilizamos el recuclerView para volver ha utilizar los campos creados
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = VehiculosAdapter(VehiculosProvider.vehiculosList)
    }
}