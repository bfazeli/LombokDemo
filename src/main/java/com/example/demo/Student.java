package com.example.demo;

public class Student {
	
	private final int id;
	private String name;	
	private String major;
	
	public Student(int id) {
		this.id = id;
	}
	
	public Student(int id, String name, String major) {
		this.id = id;
		this.name = name;
		this.major = major;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
    public String toString() { 
        return String.format( "id: %d name: %s major: %s", id, name, major); 
    }
	
	@Override 
	public boolean equals(Object obj) { 
		if (obj == this) { 
			return true; 
		} 
		if (obj == null || obj.getClass() != this.getClass()) { 
			return false; 
		} 
		Student student = (Student) obj; 
		return id == student.id && (name == student.name 
				|| (name != null && name.equals(student.getName()))) 
				&& (major == student.major || (major != null && major.equals(student.getMajor())));

	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        result = prime * result
                + ((major == null) ? 0 : major.hashCode());
        return result;
	}
}
