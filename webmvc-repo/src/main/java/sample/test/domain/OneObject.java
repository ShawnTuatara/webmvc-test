package sample.test.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class OneObject {

   @Id
   @GeneratedValue
   private Long id;

   public OneObject() {
   }

   public Long getId() {
      return id;
   }
}
