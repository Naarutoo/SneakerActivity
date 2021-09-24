package com.example.sneakeractivity;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ResponseDTO implements Serializable {

	@SerializedName("sizes")
	private List<SizesDTO> sizes;

	@SerializedName("releaseDate")
	private String releaseDate;

	@SerializedName("year")
	private int year;

	@SerializedName("styleId")
	private String styleId;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("media")
	private MediaDTO media;

	@SerializedName("brand")
	private String brand;

	@SerializedName("retailPrice")
	private int retailPrice;

	@SerializedName("shoe")
	private String shoe;

	@SerializedName("colours")
	private List<ColoursDTO> colours;

	public void setSizes(List<SizesDTO> sizes){
		this.sizes = sizes;
	}

	public List<SizesDTO> getSizes(){
		return sizes;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setStyleId(String styleId){
		this.styleId = styleId;
	}

	public String getStyleId(){
		return styleId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setMedia(MediaDTO media){
		this.media = media;
	}

	public MediaDTO getMedia(){
		return media;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setRetailPrice(int retailPrice){
		this.retailPrice = retailPrice;
	}

	public int getRetailPrice(){
		return retailPrice;
	}

	public void setShoe(String shoe){
		this.shoe = shoe;
	}

	public String getShoe(){
		return shoe;
	}

	public void setColours(List<ColoursDTO> colours){
		this.colours = colours;
	}

	public List<ColoursDTO> getColours(){
		return colours;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDTO{" + 
			"sizes = '" + sizes + '\'' + 
			",releaseDate = '" + releaseDate + '\'' + 
			",year = '" + year + '\'' + 
			",styleId = '" + styleId + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",media = '" + media + '\'' + 
			",brand = '" + brand + '\'' + 
			",retailPrice = '" + retailPrice + '\'' + 
			",shoe = '" + shoe + '\'' + 
			",colours = '" + colours + '\'' + 
			"}";
		}
}