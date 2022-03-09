package com.rahma.materiels;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rahma.materiels.entities.Electrique;
import com.rahma.materiels.entities.Materiel;
import com.rahma.materiels.repos.MaterielRepository;
@SpringBootTest
class MaterielsApplicationTests {
@Autowired
private MaterielRepository materielRepository;
/*
@Test
public void testCreateMateriel() {
	Electrique e = new Electrique();
	e.setIdElect(1L);
	Materiel mat = new Materiel(1L,"Isolateur galvanique \"module répéteur\" KFD0-CS-Ex1.51P" ,"Isolateur galvanique \"module répéteur\" KFD0-CS-Ex1.51P" ,"kfd", 150.00, e);
	materielRepository.save(mat);
}
*/
@Test
public void testFindMateriel()
{
Materiel m = materielRepository.findById(1L).get();

System.out.println(m);
}
/*
@Test
public void testUpdateMateriel()
{
Materiel m = materielRepository.findById(1L).get();
m.setQuantité(200.00);
materielRepository.save(m);
}
@Test
public void testDeleteMateriel()
{
materielRepository.deleteById(2L);;
}
@Test
public void testListerTousMateriels()
{
List<Materiel> mats = materielRepository.findAll();
for (Materiel m : mats)
{
System.out.println(m);
}

} */
@Test
public void testFindByNomMateriel()
{
List<Materiel> mats = materielRepository.findByNomMateriel("Isolateur galvanique \\\"module répéteur\\\" KFD0-CS-Ex1.51P");

for (Materiel m : mats)
{
System.out.println(m);
}

}
@Test
public void testFindByNomMaterielContains ()
{
List<Materiel> mats=materielRepository.findByNomMaterielContains("Isolateur galvanique \\\"module répéteur\\\" KFD0-CS-Ex1.51P");

for (Materiel m : mats)
{
System.out.println(m);
} }
@Test
public void testfindByNom()
{
List<Materiel> mats = materielRepository.findByNom("Isolateur galvanique \\\\\\\"module répéteur\\\\\\\" KFD0-CS-Ex1.51P");
for (Materiel m : mats)
{
System.out.println(m);
}

}
@Test
public void testfindByElectrique()
{
Electrique elect = new Electrique();
elect.setIdElect(1L);
List<Materiel> mats = materielRepository.findByElectrique(elect);
for (Materiel m : mats)
{
System.out.println(m);
}

}
}
