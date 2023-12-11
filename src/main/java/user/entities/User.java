package user.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name="users")
public class User {
	
	@Column
	private Long id;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private Long role_id;
	
	public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
	
}
