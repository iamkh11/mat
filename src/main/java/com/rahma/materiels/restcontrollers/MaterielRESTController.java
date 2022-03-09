package com.rahma.materiels.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rahma.materiels.entities.Materiel;
import com.rahma.materiels.service.MaterielService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class MaterielRESTController {
@Autowired
MaterielService materielService;
@RequestMapping(path = "/all" ,method = RequestMethod.GET)
public List<Materiel> getAllMateriels() {
return materielService.getAllMateriels();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Materiel getMaterieltById(@PathVariable("id") Long id) {
return materielService.getMateriel(id);

}
@RequestMapping(method = RequestMethod.POST)
public Materiel createMateriel(@RequestBody Materiel materiel) {
return materielService.saveMateriel(materiel);
}
@RequestMapping(method = RequestMethod.PUT)
public Materiel updateMateriel(@RequestBody Materiel materiel) {
return materielService.updateMateriel(materiel);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteMateriel(@PathVariable("id") Long id)
{
materielService.deleteMaterielById(id);
}
@RequestMapping(value="/prodscat/{idElect}",method = RequestMethod.GET)
public List<Materiel> getMaterielsByElectId(@PathVariable("idElect") Long idElect) {
return materielService.findByElectriqueIdElect(idElect);
}
}