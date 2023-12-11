package user.entities;

import javax.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name="roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;	
	
	@Column
	public String title;
	
	public Role(String roleTitle) {
		this.title = roleTitle;
	}
}
