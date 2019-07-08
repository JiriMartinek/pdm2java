package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Filter {

	@JsonProperty("sPath")
	private String path;

	@JsonProperty("sOperator")
	private String operator;

	@JsonProperty("oValue1")
	private String value1;

	@JsonProperty("oValue1")
	private String value2;

	@JsonProperty("_bMultiFilter")
	private boolean multi;

	@JsonGetter("sPath")
	public String getPath() {
		return path;
	}

	@JsonSetter("sPath")
	public void setPath(String path) {
		this.path = path;
	}

	@JsonGetter("sOperator")
	public String getOperator() {
		return operator;
	}

	@JsonSetter("sOperator")
	public void setOperator(String operator) {
		this.operator = operator;
	}

	@JsonGetter("oValue1")
	public String getValue1() {
		return value1;
	}

	@JsonSetter("oValue1")
	public void setValue1(String value1) {
		this.value1 = value1;
	}

	@JsonGetter("oValue2")
	public String getValue2() {
		return value2;
	}

	@JsonSetter("oValue2")
	public void setValue2(String value2) {
		this.value2 = value2;
	}

	@JsonGetter("_bMultiFilter")
	public boolean getMulti() {
		return multi;
	}

	@JsonSetter("_bMultiFilter")
	public void setMulti(boolean multi) {
		this.multi = multi;
	}

	@Override
	public String toString() {
		return "Filter [path=" + path + ", operator=" + operator + ", value1=" + value1 + ", value2=" + value2 + ", multi=" + multi + "]";
	}

}
