package chris.test.cluster.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
	
	@Id
	private Long id;
	
	@Column(name = "username")
	private String username;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "number")
	private String number;
	
	public User() {
		super();
	}

	public User(Long id, String username, String nickname, String number) {
		super();
		this.id = id;
		this.username = username;
		this.nickname = nickname;
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this, true);
	}

}
