package com.my.board;

import java.util.Date;

public class BoardVO {

	private int id;
	private int residence_type;
	private String confirmed_date;
	private int confirmed_status;
	private int all_confirmed_count;
	private int all_recovered_count;
	private int patient_id;
	private String route_date;
	private String route_name;
	private String route_arrive_time;
	private String route_leave_time;
	
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getResidence_type() {
		return residence_type;
	}
	public void setResidence_type(int residence_type) {
		this.residence_type = residence_type;
	}
	public String getConfirmed_date() {
		return confirmed_date;
	}
	public void setConfirmed_date(String confirmed_date) {
		this.confirmed_date = confirmed_date;
	}
	public int getConfirmed_status() {
		return confirmed_status;
	}
	public void setConfirmed_status(int confirmed_status) {
		this.confirmed_status = confirmed_status;
	}
	public int getAll_confirmed_count() {
		return all_confirmed_count;
	}
	public void setAll_confirmed_count(int all_confirmed_count) {
		this.all_confirmed_count = all_confirmed_count;
	}
	public int getAll_recovered_count() {
		return all_recovered_count;
	}
	public void setAll_recovered_count(int all_recovered_count) {
		this.all_recovered_count = all_recovered_count;
	}
	public String getRoute_date() {
		return route_date;
	}
	public void setRoute_date(String route_date) {
		this.route_date = route_date;
	}
	public String getRoute_name() {
		return route_name;
	}
	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}
	public String getRoute_arrive_time() {
		return route_arrive_time;
	}
	public void setRoute_arrive_time(String route_arrive_time) {
		this.route_arrive_time = route_arrive_time;
	}
	public String getRoute_leave_time() {
		return route_leave_time;
	}
	public void setRoute_leave_time(String route_leave_time) {
		this.route_leave_time = route_leave_time;
	}
}
