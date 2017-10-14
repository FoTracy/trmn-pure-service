package user.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
	@Id
	private Long id;
	private String userName;
	private boolean siteMaster;
	private String password;
	private String favRaces;  // JSON type. Added JSON dependency "quick-json" in app.props -> https://code.google.com/archive/p/quick-json/
	private Date created;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isSiteMaster() {
		return siteMaster;
	}
	public void setSiteMaster(boolean siteMaster) {
		this.siteMaster = siteMaster;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFavRaces() {
		return favRaces;
	}
	public void setFavRaces(String favRaces) {
		this.favRaces = favRaces;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
}
