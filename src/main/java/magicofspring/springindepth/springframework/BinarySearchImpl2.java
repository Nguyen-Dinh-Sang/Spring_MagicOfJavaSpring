package magicofspring.springindepth.springframework;

import magicofspring.springindepth.basic.SortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
// @Scope("prototype") is not really a good practice ->
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl2 {
    @Autowired
    @Qualifier("quick")
    // Priority: @Qualifier > @Primary > name
    private SortAlgorithm sortAlgorithm;

    private Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl2.class);

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array.
        return 3;
    }

    @PostConstruct
    private void postConstruct() {
        LOGGER.info("postConstruct");
    }

    @PreDestroy
    private void preDestroy() {
        LOGGER.info("preDestroy");
    }

}
