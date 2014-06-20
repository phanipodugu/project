package com.luckypants.model;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonDeserialize;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

	private String title;

	@JsonIgnore private Author author;
	@JsonIgnore private image img;
	private String _author_id;
	private String ISBN;
	private String imageid;
	
	
	/**
	 * @return the imageid
	 */
	public String getImageid() {
		return imageid;
	}

	/**
	 * @param imageid the imageid to set
	 */
	public void setImageid(String imageid) {
		this.imageid = imageid;
	}

	/**
	 * @return the img
	 */
	public image getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(image img) {
		this.img = img;
	}

	@JsonDeserialize(as=ArrayList.class, contentAs=String.class)
	private ArrayList<String> genres;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public ArrayList<String> getGenres() {
		return genres;
	}
	 @JsonDeserialize(as=ArrayList.class, contentAs=String.class)
	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String get_author_id() {
		return _author_id;
	}

	public void set_author_id(String _author_id) {
		this._author_id = _author_id;
	}

}
