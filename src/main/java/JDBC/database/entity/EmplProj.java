package JDBC.database.entity;

public class EmplProj {
	private Long employeeId;
	private Long projectId;

	public EmplProj() {
		super();
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "EmplProj [employeeId=" + employeeId + ", projectId=" + projectId + "]";
	}

}
