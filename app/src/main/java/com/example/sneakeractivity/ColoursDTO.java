package com.example.sneakeractivity;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ColoursDTO implements Serializable {

	@SerializedName("color")
	private String color;

	@SerializedName("id")
	private int id;

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
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
			"ColoursDTO{" + 
			"color = '" + color + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}