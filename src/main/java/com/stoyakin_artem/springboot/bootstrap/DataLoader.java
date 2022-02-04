package com.stoyakin_artem.springboot.bootstrap;

import com.stoyakin_artem.springboot.Entity.*;
import com.stoyakin_artem.springboot.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerRepository employeeRepo;
    private final VetRepository vetRepo;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;
    private final SpecialityRepository specialityRepository;
    private final VisitRepository visitRepository;

    public DataLoader(OwnerRepository employeeRepo, VetRepository vetRepo, PetRepository petRepository,
                      PetTypeRepository petTypeRepository, SpecialityRepository specialityRepository, VisitRepository visitRepository) {
        this.employeeRepo = employeeRepo;
        this.vetRepo = vetRepo;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
        this.specialityRepository = specialityRepository;
        this.visitRepository = visitRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        if(petTypes.size()==0){
            LoadData();
        }
    }

    private void LoadData() {
        System.out.println("Creating PetTypes...");
        PetType Dog = new PetType();
        Dog.setName("Dog");

        PetType Dog1 = new PetType();
        Dog1.setName("Dog");

        PetType Cat = new PetType();
        Cat.setName("Cat");

        petTypeRepository.save(Dog);
        petTypeRepository.save(Dog1);
        petTypeRepository.save(Cat);


        System.out.println("Creating Owners and Pets...");
        Owner owner1 = new Owner();
        owner1.setName("Michael");
        owner1.setSurname("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setPetType(Dog);
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        employeeRepo.save(owner1);
        petRepository.save(mikesPet);


        Owner owner2 = new Owner();
        owner2.setName("Fiona");
        owner2.setSurname("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");


        Pet AllePet = new Pet();
        AllePet.setOwner(owner2);
        AllePet.setBirthDate(LocalDate.now());
        AllePet.setPetType(Cat);
        AllePet.setName("CatRosco");
        AllePet.setPetType(Cat);
        owner2.getPets().add(AllePet);
        employeeRepo.save(owner2);
        petRepository.save(AllePet);


        System.out.println("Creating Specialities...");
        Speciality speciality = new Speciality();
        speciality.setDescription("Veteriarian 1 level");
        specialityRepository.save(speciality);

        Speciality speciality2 = new Speciality();
        speciality2.setDescription("Veteriarian 2 level");
        specialityRepository.save(speciality2);

        System.out.println("Creating Veterians...");
        Vet vet1 = new Vet();
        vet1.setName("Andrey");
        vet1.setSurname("Higay");
        vet1.getSpecialities().add(speciality);
        vetRepo.save(vet1);

        Vet vet2 = new Vet();
        vet2.setName("Arkadiy");
        vet2.setSurname("Gaydar");
        vet2.getSpecialities().add(speciality2);
        vetRepo.save(vet2);

        System.out.println("Creating pet's visits...");
        Visit visit1 = new Visit();
        visit1.setDate(LocalDate.now());
        visit1.setDescription("Leg problem");
        visit1.setPet(mikesPet);
        visit1.setVet(vet1);
        mikesPet.getVisits().add(visit1);
        visitRepository.save(visit1);

        Visit visit2 = new Visit();
        visit2.setDate(LocalDate.now());
        visit2.setDescription("Headache");
        visit2.setPet(AllePet);
        visit2.setVet(vet2);
        AllePet.getVisits().add(visit2);
        visitRepository.save(visit2);
    }
}
