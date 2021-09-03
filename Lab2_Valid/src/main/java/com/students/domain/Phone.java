/**
 * 
 */
package com.students.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Min(value = 100, message = "{Size.area}")
	@Max(value = 999, message = "{Size.area}")
	private Integer area;

	@NotNull
	@Min(value = 100, message = "{Size.prefix}")
	@Max(value = 999, message = "{Size.prefix}")
 	private Integer prefix;

	@NotNull
	@Min(value = 1000, message = "{Size.number}")
	@Max(value = 9999, message = "{Size.number}")
 	private Integer number;

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
