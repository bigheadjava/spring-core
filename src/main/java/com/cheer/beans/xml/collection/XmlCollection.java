package com.cheer.beans.xml.collection;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class XmlCollection {

	private Object[] objArrays;

	private List<Object> list;
	private Set<Object> sets;
	private Map<String, Object> map;

	private Properties props;
	private Date date1;

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Set<Object> getSets() {
		return sets;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Object[] getObjArrays() {
		return objArrays;
	}

	public void setObjArrays(Object[] objArrays) {
		this.objArrays = objArrays;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

}
