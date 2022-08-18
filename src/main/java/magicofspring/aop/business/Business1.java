package magicofspring.aop.business;

import magicofspring.aop.TrackTime;
import magicofspring.aop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomeThing() {
        return dao1.retrieveSomething();
    }
}
