package JDBC.database.entity;

public class Project {
	private Long id;
	private String title;

	public Project() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String titale) {
		this.title = titale;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + "]";
	}
	

}
