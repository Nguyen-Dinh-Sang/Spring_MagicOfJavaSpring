package magicofspring.springindepth.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// When there are two implements SortAlgorithm
// @Primary specifies which class should be injected when @Autowired
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        // Logic for Bubble sort.
        return numbers;
    }
}
