package entity;

public class Record {

	private String startHour;
	private String startMin;
	private String endHour;
	private String endMin;
	private String task;

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getStartMin() {
		return startMin;
	}

	public void setStartMin(String startMin) {
		this.startMin = startMin;
	}

	public String getEndHour() {
		return endHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	public String getEndMin() {
		return endMin;
	}

	public void setEndMin(String endMin) {
		this.endMin = endMin;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getWorkTime() {
		return (Integer.parseInt(endHour) - Integer.parseInt(startHour)) * 60 + Integer.parseInt(endMin) - Integer.parseInt(startMin);

	}

}
