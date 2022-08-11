package magicofspring.springindepth.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// @Qualifier like naming the class, and we can use that name.
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        // Logic for Quick sort.
        return numbers;
    }
}
