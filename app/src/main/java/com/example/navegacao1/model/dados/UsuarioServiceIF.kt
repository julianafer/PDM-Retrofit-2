package com.example.navegacao1.model.dados

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body
import retrofit2.http.Path
import retrofit2.http.DELETE

interface UsuarioServiceIF {

    @GET("usuarios")
    suspend fun listar(): List<Usuario>

    @POST("usuarios")
    suspend fun inserir(@Body usuario: Usuario): Usuario

    @DELETE("usuarios/{id}")
    suspend fun remover(@Path("id") id: String): Unit

    @GET("usuarios/{id}")
    suspend fun buscarPorId(@Path("id") id: String): Usuario

    //@GET("58013240/json/")
    //suspend fun getEndereco(): Endereco
}