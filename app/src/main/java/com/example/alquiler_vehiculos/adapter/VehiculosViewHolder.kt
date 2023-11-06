package com.example.alquiler_vehiculos.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Vehiculos
import com.example.alquiler_vehiculos.databinding.ItemVehiculoBinding


class VehiculosViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemVehiculoBinding.bind(view)
    fun render (vehiculoModel: Vehiculos){
        binding.Modelo.text = vehiculoModel.modelo
        binding.nPlazas.text = vehiculoModel.nPlaza
        binding.Capacidad.text = vehiculoModel.capacidad

        Glide.with(binding.foto.context).load(vehiculoModel.imagen)
            .into(binding.foto)
    }
}