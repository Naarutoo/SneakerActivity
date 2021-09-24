package com.example.sneakeractivity.Adapters;

import android.content.ClipData;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sneakeractivity.R;
import com.example.sneakeractivity.ResponseDTO;

import java.util.ArrayList;

public class SneakerAdapter extends RecyclerView.Adapter<SneakerAdapter.SneakerHolder> {
    private ArrayList<ResponseDTO> list;


    public SneakerAdapter(ArrayList<ResponseDTO> list) {
        this.list = list;

    }

    @NonNull
    @Override
    public SneakerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sneakerview, parent, false);
        return new SneakerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SneakerHolder holder, int position) {
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SneakerHolder extends RecyclerView.ViewHolder {
        private ImageView mIvImage;
        private TextView mTvName, mTvPrice;
        private LinearLayout linearLayout;


        public SneakerHolder(@NonNull View itemView) {
            super(itemView);

            initview(itemView);
        }

        private void initview(View itemView) {
            // mIvImage = itemView.findViewById(R.id.image);
            mTvName = itemView.findViewById(R.id.tvName);
            mTvPrice = itemView.findViewById(R.id.tvprice);
            linearLayout = itemView.findViewById(R.id.linearlayout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });
        }

        public void setData(ResponseDTO response) {
            Glide.with(mIvImage).load(response.getMedia().getImageUrl()).into(mIvImage);
            mTvName.setText(response.getName());
            mTvPrice.setText(response.getRetailPrice() + "");
        }
    }
}
