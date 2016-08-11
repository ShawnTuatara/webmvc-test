package sample.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sample.test.domain.OneObject;

@RestController
public class MyAnotherController {

   private final MyAnotherService service;
   
   @Autowired
   public MyAnotherController(MyAnotherService service) {
      this.service = service;
   }
   
   @GetMapping(path = "/{id}/another-data", produces = MediaType.APPLICATION_JSON_VALUE)
   public OneObject getAnotherData(@PathVariable String id) {
      return service.getOneObject(Long.valueOf(id));
   }
}
