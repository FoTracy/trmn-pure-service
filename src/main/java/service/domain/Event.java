package service.domain;

import javax.persistence.*;

@Entity
@Table(name="events")
public class Event {
	@Id
	private Long id;
	private String event_name;
	private String location;
	private String website;
	
	@Lob
	private byte[] icon;  // not sure if this is right for DB longblob
	private String description;
	//@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean twoFiveK;
	//@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean marathon;
	//@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean fiveZeroK;
	//@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean fiveZeroM;
	//@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean oneZeroZeroK;
	//@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean oneZeroZeroM;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public byte[] getIcon() {
		return icon;
	}
	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isTwoFiveK() {
		return twoFiveK;
	}
	public void setTwoFiveK(boolean twoFiveK) {
		this.twoFiveK = twoFiveK;
	}
	public boolean isMarathon() {
		return marathon;
	}
	public void setMarathon(boolean marathon) {
		this.marathon = marathon;
	}
	public boolean isFiveZeroK() {
		return fiveZeroK;
	}
	public void setFiveZeroK(boolean fiveZeroK) {
		this.fiveZeroK = fiveZeroK;
	}
	public boolean isFiveZeroM() {
		return fiveZeroM;
	}
	public void setFiveZeroM(boolean fiveZeroM) {
		this.fiveZeroM = fiveZeroM;
	}
	public boolean isOneZeroZeroK() {
		return oneZeroZeroK;
	}
	public void setOneZeroZeroK(boolean oneZeroZeroK) {
		this.oneZeroZeroK = oneZeroZeroK;
	}
	public boolean isOneZeroZeroM() {
		return oneZeroZeroM;
	}
	public void setOneZeroZeroM(boolean oneZeroZeroM) {
		this.oneZeroZeroM = oneZeroZeroM;
	}
}
