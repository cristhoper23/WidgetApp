package com.cristhoper.listviewactivity.services;

import com.cristhoper.listviewactivity.models.ListItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Cris on 4/12/2017.
 */

public interface ApiService {

    String API_BASE_URL = "https://api-productos-cristhoper23.c9users.io";

    @GET("api/v1/animales")
    Call<List<ListItem>> getAllAnimals();
}
