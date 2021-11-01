package com.north.Hospital.domain;

import javax.persistence.*;


@Entity
public class Hospital {

	@Id
    String hospid;
    
	String hospname;
    
	Integer statecode;
    
	Integer districtid;
    
	String district;
    
	long hospcontactno;
    
	String hospaddress;
    
	String hosptype;
    
    String state;

	public Hospital(String hospid, String hospname, Integer statecode, Integer districtid, String district,
			long hospcontactno, String hospaddress, String hosptype, String state) {
		super();
		this.hospid = hospid;
		this.hospname = hospname;
		this.statecode = statecode;
		this.districtid = districtid;
		this.district = district;
		this.hospcontactno = hospcontactno;
		this.hospaddress = hospaddress;
		this.hosptype = hosptype;
		this.state = state;
	}

	public Hospital() {
		super();
	}

	public String getHospid() {
		return hospid;
	}

	public void setHospid(String hospid) {
		this.hospid = hospid;
	}

	public String getHospname() {
		return hospname;
	}

	public void setHospname(String hospname) {
		this.hospname = hospname;
	}

	public Integer getStatecode() {
		return statecode;
	}

	public void setStatecode(Integer statecode) {
		this.statecode = statecode;
	}

	public Integer getDistrictid() {
		return districtid;
	}

	public void setDistrictid(Integer districtid) {
		this.districtid = districtid;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getHospcontactno() {
		return hospcontactno;
	}

	public void setHospcontactno(long hospcontactno) {
		this.hospcontactno = hospcontactno;
	}

	public String getHospaddress() {
		return hospaddress;
	}

	public void setHospaddress(String hospaddress) {
		this.hospaddress = hospaddress;
	}

	public String getHosptype() {
		return hosptype;
	}

	public void setHosptype(String hosptype) {
		this.hosptype = hosptype;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Hospital [hospid=" + hospid + ", hospname=" + hospname + ", statecode=" + statecode + ", districtid="
				+ districtid + ", district=" + district + ", hospcontactno=" + hospcontactno + ", hospaddress="
				+ hospaddress + ", hosptype=" + hosptype + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((districtid == null) ? 0 : districtid.hashCode());
		result = prime * result + ((hospaddress == null) ? 0 : hospaddress.hashCode());
		result = prime * result + (int) (hospcontactno ^ (hospcontactno >>> 32));
		result = prime * result + ((hospid == null) ? 0 : hospid.hashCode());
		result = prime * result + ((hospname == null) ? 0 : hospname.hashCode());
		result = prime * result + ((hosptype == null) ? 0 : hosptype.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((statecode == null) ? 0 : statecode.hashCode());
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
		Hospital other = (Hospital) obj;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (districtid == null) {
			if (other.districtid != null)
				return false;
		} else if (!districtid.equals(other.districtid))
			return false;
		if (hospaddress == null) {
			if (other.hospaddress != null)
				return false;
		} else if (!hospaddress.equals(other.hospaddress))
			return false;
		if (hospcontactno != other.hospcontactno)
			return false;
		if (hospid == null) {
			if (other.hospid != null)
				return false;
		} else if (!hospid.equals(other.hospid))
			return false;
		if (hospname == null) {
			if (other.hospname != null)
				return false;
		} else if (!hospname.equals(other.hospname))
			return false;
		if (hosptype == null) {
			if (other.hosptype != null)
				return false;
		} else if (!hosptype.equals(other.hosptype))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (statecode == null) {
			if (other.statecode != null)
				return false;
		} else if (!statecode.equals(other.statecode))
			return false;
		return true;
	}

		

	
}
