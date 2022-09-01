package com.compass.aspp.domain;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@Embeddable
public class Dimensiuni {

    @NotNull
    private Double latime;

    @NotNull
    private Double lungime;

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

	public Double getLatime() {
        return this.latime;
    }

	public void setLatime(Double latime) {
        this.latime = latime;
    }

	public Double getLungime() {
        return this.lungime;
    }

	public void setLungime(Double lungime) {
        this.lungime = lungime;
    }
}
