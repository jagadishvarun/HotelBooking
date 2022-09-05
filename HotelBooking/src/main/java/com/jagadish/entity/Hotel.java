package com.jagadish.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;
	private String hotelName;
	private String city;
	@Column(name="created_at")
	private Date createdAt;
	private int noOfRooms;
	private int noOfTravelers;
	private String wifi;
	private String restaurant; 
	private String airConditioning;
	private String meals;
	private long costOfStay;
	private int ratings;
    
			
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_fk",referencedColumnName = "hid")
	private List<Reviews> reviews;
	
	
}
