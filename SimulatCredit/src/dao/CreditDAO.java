package dao;

import model.Credit;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component("dao1")
public class CreditDAO implements iDAO<Credit,Long> {
    @Override
    public Credit trouverParID(Long aLong) {
        return BD_CREDITS().stream().filter(credit -> credit.getId()==aLong).findFirst().get();
    }

    static Set<Credit> BD_CREDITS(){
        return new HashSet<Credit>(
                Arrays.asList(
                        new Credit(1L,350000.0,120,2.5,"Houssam",0.0),
                        new Credit(2L,25000.0,60,2.0,"Mridi",0.0),
                        new Credit(3L,850000.0,240,2.5,"4IIR9",0.0)
                ));
    }
}
