package com.example.sneakeractivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sneakeractivity.Adapters.SneakerAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SneakerFragment extends Fragment {
private ArrayList<ResponseDTO> list = new ArrayList<>();
private RecyclerView recyclerView;
private SneakerAdapter sneakerAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sneaker, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
        setUprecyclerView();
        CallApi();

    }

    private void CallApi() {
        ApiService apiService = Network.getInstance().create(ApiService.class);
      apiService.getSneakers().enqueue(new Callback<List<ResponseDTO>>() {
          @Override
          public void onResponse(Call<List<ResponseDTO>> call, Response<List<ResponseDTO>> response) {
              list.addAll(response.body());
              setUprecyclerView();
          }

          @Override
          public void onFailure(Call<List<ResponseDTO>> call, Throwable t) {

          }
      });
    }

    private void setUprecyclerView() {
        sneakerAdapter = new SneakerAdapter(list);
        recyclerView.setAdapter(sneakerAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void initviews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }


}