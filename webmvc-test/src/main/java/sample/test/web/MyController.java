package sample.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

   private final MyService ms;

   @Autowired
   public MyController(MyService ms) {
      this.ms = ms;
   }

   @GetMapping(path = "/{id}/data", produces = MediaType.APPLICATION_JSON_VALUE)
   public boolean getData(@PathVariable String id) {
      return ms.execute(id);
   }
}
