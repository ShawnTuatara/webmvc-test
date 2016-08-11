package sample.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.test.domain.OneObject;
import sample.test.domain.OneObjectRepository;

@Service
public class MyAnotherService {

   @Autowired
   private OneObjectRepository repo;

   public OneObject getOneObject(Long id) {
      return repo.findOne(id);
   }
}
