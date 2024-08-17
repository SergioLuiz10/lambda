package pack;

import java.util.List;
import java.util.function.Predicate;

public class aumentar {

    public double aumentare(List<obj> list , Predicate<obj> pred){
           double soma=0.0;
           for (obj O : list){
            if (pred.test(O)){
               soma+=O.getPreço();
              }
           }
           return  soma;
    }
}

