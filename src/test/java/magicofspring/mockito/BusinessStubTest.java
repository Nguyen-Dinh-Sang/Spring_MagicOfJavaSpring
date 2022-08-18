//package magicofspring.mockito;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class BusinessStubTest {
//
//    @Test
//    void findTheGreatestFromAllData() {
//        BusinessImpl business = new BusinessImpl(new DataServiceStub());
//        int result = business.findTheGreatestFromAllData();
//        assertEquals(23, result);
//    }
//}
//
//// Have to write a lot of code like this to maintain this.
//class DataServiceStub implements DataService {
//
//    @Override
//    public int[] retrieveAllDate() {
//        return new int[] {23, 4, 5};
//    }
//}