package magicofspring.mockito;

public class BusinessImpl {
    private DataService dataService;

    public BusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllDate();

        int greatest = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }

        return greatest;
    }
}
