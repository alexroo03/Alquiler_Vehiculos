package com.example.alquiler_vehiculos

class VehiculosProvider {
    companion object{
        val vehiculosList = listOf<Vehiculos>(
            Vehiculos(
                modelo = "Carrozado con trampilla",
                nPlaza = "3 plazas",
                capacidad = "20M3",
                imagen = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg"

            ),
            Vehiculos(
                modelo = "Carrozado sin trampilla",
                nPlaza = "3 plazas",
                capacidad = "20M3",
                imagen = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg"

            ),
            Vehiculos(
                modelo = "Furgoneta grande",
                nPlaza = "3 plazas",
                capacidad = "15M3",
                imagen = "https://blanauto.com/sites/default/files/inline-images/mercedes-sprinter.png.jpg"

            ),
            Vehiculos(
                modelo = "Furgoneta mediana",
                nPlaza = "3 plazas",
                capacidad = "8M3",
                imagen = "https://blanauto.com/sites/default/files/inline-images/1539849303199.jpg"

            ),
            Vehiculos(
                modelo = "Furgoneta pequeña",
                nPlaza = "2 plazas",
                capacidad = "4M3",
                imagen = "https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg"

            ),
        )
    }
}