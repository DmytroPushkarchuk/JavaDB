package JDBC.database.entity;

public class Project {
	private Long id;
	private String titale;

	public Project() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitale() {
		return titale;
	}

	public void setTitale(String titale) {
		this.titale = titale;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", titale=" + titale + "]";
	}
	

}
