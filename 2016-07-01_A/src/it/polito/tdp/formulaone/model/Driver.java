package it.polito.tdp.formulaone.model;

public class Driver {

	private int driverId;
	private String forename;
	private String surname;

	public Driver(int driverId, String forename, String surname) {
		this.driverId = driverId;
		this.forename = forename;
		this.surname = surname;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + driverId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		if (driverId != other.driverId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("driverId=");
		builder.append(driverId);
		builder.append(", forename=");
		builder.append(forename);
		builder.append(", surname=");
		builder.append(surname);
		builder.append("\n");
		return builder.toString();
	}

}
