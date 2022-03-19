package com.loads.Loads.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loadsdetails")
public class loads {
	public loads() {
		super();
		// TODO Auto-generated constructor stub
	}
	public loads(long shipperid, String loadp, String unloadp, String date, String trucktype, int truckno, int weight) {
		super();
		this.shipperid = shipperid;
		this.loadp = loadp;
		this.unloadp = unloadp;
		this.date = date;
		this.trucktype = trucktype;
		this.truckno = truckno;
		this.weight = weight;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long loadid;
	@Column(name= "shipper_id")
	private long shipperid;
	@Column(name="Load_p")
	private String loadp;
	@Column(name="unload_p")
	private String unloadp;
	@Column(name="date")
	private String date;
	@Column(name="T_type")
	private String trucktype;
	@Column(name="T_no")
	private int truckno;
	@Column(name="weight")
	private int weight;
	public long getLoadid() {
		return loadid;
	}
	public void setLoadid(long loadid) {
		this.loadid = loadid;
	}
	public long getShipperid() {
		return shipperid;
	}
	public void setShipperid(long shipperid) {
		this.shipperid = shipperid;
	}
	public String getLoadp() {
		return loadp;
	}
	public void setLoadp(String loadp) {
		this.loadp = loadp;
	}
	public String getUnloadp() {
		return unloadp;
	}
	public void setUnloadp(String unloadp) {
		this.unloadp = unloadp;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTrucktype() {
		return trucktype;
	}
	public void setTrucktype(String trucktype) {
		this.trucktype = trucktype;
	}
	public int getTruckno() {
		return truckno;
	}
	public void setTruckno(int truckno) {
		this.truckno = truckno;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

 
}
