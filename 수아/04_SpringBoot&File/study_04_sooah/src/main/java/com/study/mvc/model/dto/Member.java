package com.study.mvc.model.dto;

public class Member {
	private int id;
	private String name; // 이름 
	private String jumin; // 주민번호 (Social Security Number)
	private String phone; // 폰번호
	private String address; // 주소
	private String profileImage; // 프로필사진
	private int age; // 나이 


	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String name, String jumin, String phone, String address, String profileImage) {
		this.name = name;
		this.jumin = jumin;
		this.phone = phone;
		this.address = address;
		this.profileImage = profileImage;
		this.age = calculateAge(jumin);
	}
	
	// 주민번호 -> 나이 계산
    private int calculateAge(String jumin) {
    	
        String yearPart = jumin.substring(0, 2); // 주민번호 앞 2자리
        char centuryIndicator = jumin.charAt(7); // 주민번호 7번째 자리로 세기 구분
        String century = (centuryIndicator == '1' || centuryIndicator == '2') ? "19" : "20";

        // 완전한 연도 계산 (예: 1995 또는 2095)
        int year = Integer.parseInt(century + yearPart);
        System.out.println(year);

        return 2024 - year;
    }
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	    this.age = calculateAge(jumin); // 주민번호 설정 시 나이 자동 계산
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	
   // 디버깅용
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jumin='" + jumin + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", age=" + age +
                '}';
    }
	
}
