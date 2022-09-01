package com.compass.aspp.web;

import com.compass.aspp.domain.Angajat;
import com.compass.aspp.domain.Client;
import com.compass.aspp.domain.Constatare;
import com.compass.aspp.domain.EchipamentProductie;
import com.compass.aspp.domain.EchipamentService;
import com.compass.aspp.domain.Interventie;
import com.compass.aspp.domain.Job;
import com.compass.aspp.domain.Material;
import com.compass.aspp.domain.Rol;
import com.compass.aspp.domain.Utilizator;
import com.compass.aspp.service.AngajatService;
import com.compass.aspp.service.ClientService;
import com.compass.aspp.service.ConstatareService;
import com.compass.aspp.service.EchipamentProductieService;
import com.compass.aspp.service.EchipamentServiceService;
import com.compass.aspp.service.InterventieService;
import com.compass.aspp.service.JobService;
import com.compass.aspp.service.MaterialService;
import com.compass.aspp.service.RolService;
import com.compass.aspp.service.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.roo.addon.web.mvc.controller.converter.RooConversionService;

@Configurable
/**
 * A central place to register application converters and formatters. 
 */
@RooConversionService
public class ApplicationConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean {

	@Override
	protected void installFormatters(FormatterRegistry registry) {
		super.installFormatters(registry);
		// Register application converters and formatters
	}

	@Autowired
    AngajatService angajatService;

	@Autowired
    ClientService clientService;

	@Autowired
    ConstatareService constatareService;

	@Autowired
    EchipamentProductieService echipamentProductieService;

	@Autowired
    EchipamentServiceService echipamentServiceService;

	@Autowired
    InterventieService interventieService;

	@Autowired
    JobService jobService;

	@Autowired
    MaterialService materialService;

	@Autowired
    RolService rolService;

	@Autowired
    UtilizatorService utilizatorService;

	public Converter<Angajat, String> getAngajatToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.Angajat, java.lang.String>() {
            public String convert(Angajat angajat) {
                return new StringBuilder().append(angajat.getNume()).append(" ").append(angajat.getPrenume()).append(" ").append(angajat.getAdresa()).append(" ").append(angajat.getTelefon()).toString();
            }
        };
    }

	public Converter<Long, Angajat> getIdToAngajatConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.Angajat>() {
            public com.compass.aspp.domain.Angajat convert(java.lang.Long id) {
                return angajatService.findAngajat(id);
            }
        };
    }

	public Converter<String, Angajat> getStringToAngajatConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.Angajat>() {
            public com.compass.aspp.domain.Angajat convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Angajat.class);
            }
        };
    }

	public Converter<Client, String> getClientToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.Client, java.lang.String>() {
            public String convert(Client client) {
                return new StringBuilder().append(client.getNume()).append(" ").append(client.getTelefon()).append(" ").append(client.getAdresa()).append(" ").append(client.getEmail()).toString();
            }
        };
    }

	public Converter<Long, Client> getIdToClientConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.Client>() {
            public com.compass.aspp.domain.Client convert(java.lang.Long id) {
                return clientService.findClient(id);
            }
        };
    }

	public Converter<String, Client> getStringToClientConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.Client>() {
            public com.compass.aspp.domain.Client convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Client.class);
            }
        };
    }

	public Converter<Constatare, String> getConstatareToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.Constatare, java.lang.String>() {
            public String convert(Constatare constatare) {
                return new StringBuilder().append(constatare.getDescriere()).toString();
            }
        };
    }

	public Converter<Long, Constatare> getIdToConstatareConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.Constatare>() {
            public com.compass.aspp.domain.Constatare convert(java.lang.Long id) {
                return constatareService.findConstatare(id);
            }
        };
    }

	public Converter<String, Constatare> getStringToConstatareConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.Constatare>() {
            public com.compass.aspp.domain.Constatare convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Constatare.class);
            }
        };
    }

	public Converter<EchipamentProductie, String> getEchipamentProductieToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.EchipamentProductie, java.lang.String>() {
            public String convert(EchipamentProductie echipamentProductie) {
                return new StringBuilder().append(echipamentProductie.getNume()).toString();
            }
        };
    }

	public Converter<Long, EchipamentProductie> getIdToEchipamentProductieConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.EchipamentProductie>() {
            public com.compass.aspp.domain.EchipamentProductie convert(java.lang.Long id) {
                return echipamentProductieService.findEchipamentProductie(id);
            }
        };
    }

	public Converter<String, EchipamentProductie> getStringToEchipamentProductieConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.EchipamentProductie>() {
            public com.compass.aspp.domain.EchipamentProductie convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), EchipamentProductie.class);
            }
        };
    }

	public Converter<EchipamentService, String> getEchipamentServiceToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.EchipamentService, java.lang.String>() {
            public String convert(EchipamentService echipamentService) {
                return new StringBuilder().append(echipamentService.getNume()).append(" ").append(echipamentService.getSerie()).append(" ").append(echipamentService.getTip()).toString();
            }
        };
    }

	public Converter<Long, EchipamentService> getIdToEchipamentServiceConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.EchipamentService>() {
            public com.compass.aspp.domain.EchipamentService convert(java.lang.Long id) {
                return echipamentServiceService.findEchipamentService(id);
            }
        };
    }

	public Converter<String, EchipamentService> getStringToEchipamentServiceConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.EchipamentService>() {
            public com.compass.aspp.domain.EchipamentService convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), EchipamentService.class);
            }
        };
    }

	public Converter<Interventie, String> getInterventieToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.Interventie, java.lang.String>() {
            public String convert(Interventie interventie) {
                return new StringBuilder().append(interventie.getDataInceput()).append(" ").append(interventie.getDataSfarsit()).append(" ").append(interventie.getDescriereDefect()).toString();
            }
        };
    }

	public Converter<Long, Interventie> getIdToInterventieConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.Interventie>() {
            public com.compass.aspp.domain.Interventie convert(java.lang.Long id) {
                return interventieService.findInterventie(id);
            }
        };
    }

	public Converter<String, Interventie> getStringToInterventieConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.Interventie>() {
            public com.compass.aspp.domain.Interventie convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Interventie.class);
            }
        };
    }

	public Converter<Job, String> getJobToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.Job, java.lang.String>() {
            public String convert(Job job) {
                return new StringBuilder().append(job.getDataPrimirii()).append(" ").append(job.getDataFinalizarii()).toString();
            }
        };
    }

	public Converter<Long, Job> getIdToJobConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.Job>() {
            public com.compass.aspp.domain.Job convert(java.lang.Long id) {
                return jobService.findJob(id);
            }
        };
    }

	public Converter<String, Job> getStringToJobConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.Job>() {
            public com.compass.aspp.domain.Job convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Job.class);
            }
        };
    }

	public Converter<Material, String> getMaterialToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.Material, java.lang.String>() {
            public String convert(Material material) {
                return new StringBuilder().append(material.getNume()).append(" ").append(material.getCantitateMp()).toString();
            }
        };
    }

	public Converter<Long, Material> getIdToMaterialConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.Material>() {
            public com.compass.aspp.domain.Material convert(java.lang.Long id) {
                return materialService.findMaterial(id);
            }
        };
    }

	public Converter<String, Material> getStringToMaterialConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.Material>() {
            public com.compass.aspp.domain.Material convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Material.class);
            }
        };
    }

	public Converter<Rol, String> getRolToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.Rol, java.lang.String>() {
            public String convert(Rol rol) {
                return new StringBuilder().append(rol.getNumeRol()).toString();
            }
        };
    }

	public Converter<Long, Rol> getIdToRolConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.Rol>() {
            public com.compass.aspp.domain.Rol convert(java.lang.Long id) {
                return rolService.findRol(id);
            }
        };
    }

	public Converter<String, Rol> getStringToRolConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.Rol>() {
            public com.compass.aspp.domain.Rol convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Rol.class);
            }
        };
    }

	public Converter<Utilizator, String> getUtilizatorToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.compass.aspp.domain.Utilizator, java.lang.String>() {
            public String convert(Utilizator utilizator) {
                return new StringBuilder().append(utilizator.getNumeUtilizator()).append(" ").append(utilizator.getParola()).toString();
            }
        };
    }

	public Converter<Long, Utilizator> getIdToUtilizatorConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.compass.aspp.domain.Utilizator>() {
            public com.compass.aspp.domain.Utilizator convert(java.lang.Long id) {
                return utilizatorService.findUtilizator(id);
            }
        };
    }

	public Converter<String, Utilizator> getStringToUtilizatorConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.compass.aspp.domain.Utilizator>() {
            public com.compass.aspp.domain.Utilizator convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Utilizator.class);
            }
        };
    }

	public void installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getAngajatToStringConverter());
        registry.addConverter(getIdToAngajatConverter());
        registry.addConverter(getStringToAngajatConverter());
        registry.addConverter(getClientToStringConverter());
        registry.addConverter(getIdToClientConverter());
        registry.addConverter(getStringToClientConverter());
        registry.addConverter(getConstatareToStringConverter());
        registry.addConverter(getIdToConstatareConverter());
        registry.addConverter(getStringToConstatareConverter());
        registry.addConverter(getEchipamentProductieToStringConverter());
        registry.addConverter(getIdToEchipamentProductieConverter());
        registry.addConverter(getStringToEchipamentProductieConverter());
        registry.addConverter(getEchipamentServiceToStringConverter());
        registry.addConverter(getIdToEchipamentServiceConverter());
        registry.addConverter(getStringToEchipamentServiceConverter());
        registry.addConverter(getInterventieToStringConverter());
        registry.addConverter(getIdToInterventieConverter());
        registry.addConverter(getStringToInterventieConverter());
        registry.addConverter(getJobToStringConverter());
        registry.addConverter(getIdToJobConverter());
        registry.addConverter(getStringToJobConverter());
        registry.addConverter(getMaterialToStringConverter());
        registry.addConverter(getIdToMaterialConverter());
        registry.addConverter(getStringToMaterialConverter());
        registry.addConverter(getRolToStringConverter());
        registry.addConverter(getIdToRolConverter());
        registry.addConverter(getStringToRolConverter());
        registry.addConverter(getUtilizatorToStringConverter());
        registry.addConverter(getIdToUtilizatorConverter());
        registry.addConverter(getStringToUtilizatorConverter());
    }

	public void afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
}
