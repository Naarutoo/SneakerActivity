package com.example.sneakeractivity;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class SizesDTO implements Serializable {

	@SerializedName("size")
	private int size;

	@SerializedName("id")
	private int id;

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"SizesDTO{" + 
			"size = '" + size + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}