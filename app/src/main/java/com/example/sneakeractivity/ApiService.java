package com.example.sneakeractivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("Dcosta2205/b1296ba25a429b3e299069b6de3d4a0d/raw/ebf77a564e4ec6c1705e1e85241a20170699b5b2/sneakerDatabase")
   Call<List<ResponseDTO>> getSneakers();
}
