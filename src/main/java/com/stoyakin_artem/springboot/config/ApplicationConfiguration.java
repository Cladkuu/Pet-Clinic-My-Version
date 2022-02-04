package com.stoyakin_artem.springboot.config;

import com.stoyakin_artem.springboot.Service.CrudService;
import com.stoyakin_artem.springboot.Service.Impl.*;
import com.stoyakin_artem.springboot.Service.PetTypeService;
import com.stoyakin_artem.springboot.Service.SpecialityService;
import com.stoyakin_artem.springboot.repositories.PetRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.stoyakin_artem.springboot.repositories.OwnerRepository;

@Configuration
public class ApplicationConfiguration {

    @Bean
    CrudService ownerService(OwnerRepository ownerRep, PetRepository petRepository) {return new OwnerServiceImpl(ownerRep, petRepository); }

    @Bean
    CrudService petServiceImpl() {return new PetServiceImpl();
    }

    @Bean
    CrudService vetServiceImpl() {return new VetServiceImpl();
    }

    @Bean
    PetTypeService petTypeServiceImpl(){return new PetTypeServiceImpl();
    }

    @Bean
    SpecialityService specialityService() {return new SpecialityServiceImpl();
    }

}
