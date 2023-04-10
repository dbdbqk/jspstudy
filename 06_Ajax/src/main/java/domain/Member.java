package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
	private int memberNo;
	private String id;
	private String name;
	private String gender;
	private String address;
}
