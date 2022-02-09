package th.ac.kku.cis.lab.pokedex

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import th.ac.kku.cis.lab.pokedex.model.PokemonAPIResult

interface APIInterface {

    @GET("pokemon/")
    fun getPokemons() : Call<PokemonAPIResult>

    companion object {
        var BASE_URL = "https://pokeapi.co/api/v2/pokemon/59"
        fun create() : APIInterface {
            var retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(APIInterface::class.java)
        }
    }
}