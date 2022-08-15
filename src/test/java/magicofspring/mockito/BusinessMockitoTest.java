package magicofspring.mockito;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class BusinessMockitoTest {

    @Mock
    DataService dataServiceMock2 = mock(DataService.class);

    @InjectMocks
    BusinessImpl business = new BusinessImpl(dataServiceMock2);

    @Test
    public void findTheGreatestFromAllData2Number() {
        when(dataServiceMock2.retrieveAllDate()).thenReturn(new int[] {23, 4, 6});
        int result = business.findTheGreatestFromAllData();
        assertEquals(23, result);
    }

    @Test
    void findTheGreatestFromAllData3Number() {
        DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveAllDate()).thenReturn(new int[] {23, 4, 6});

        BusinessImpl business = new BusinessImpl(dataServiceMock);
        int result = business.findTheGreatestFromAllData();
        assertEquals(23, result);
    }
}