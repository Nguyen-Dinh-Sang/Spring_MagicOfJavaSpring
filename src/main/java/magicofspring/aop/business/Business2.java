package magicofspring.aop.business;

import magicofspring.aop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    private Dao2 dao2;

    public String calculateSomeThing() {
        return dao2.retrieveSomething();
    }
}
