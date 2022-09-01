package com.compass.aspp.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@Entity
@RooJavaBean
@RooToString
@RooJpaEntity
public class Utilizator {

    @NotNull
    @Column(unique = true)
    @Size(min = 2)
    private String numeUtilizator;

    @NotNull
    @Size(min = 2)
    private String parola;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Rol> rol = new HashSet<Rol>();

    @ManyToOne
    private Angajat angajat;

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@Version
    @Column(name = "version")
    private Integer version;

	public Long getId() {
        return this.id;
    }

	public void setId(Long id) {
        this.id = id;
    }

	public Integer getVersion() {
        return this.version;
    }

	public void setVersion(Integer version) {
        this.version = version;
    }

	public String getNumeUtilizator() {
        return this.numeUtilizator;
    }

	public void setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }

	public String getParola() {
        return this.parola;
    }

	public void setParola(String parola) {
        this.parola = parola;
    }

	public Set<Rol> getRol() {
        return this.rol;
    }

	public void setRol(Set<Rol> rol) {
        this.rol = rol;
    }

	public Angajat getAngajat() {
        return this.angajat;
    }

	public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }
}
