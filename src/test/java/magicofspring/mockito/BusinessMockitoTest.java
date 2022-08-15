package magicofspring.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BusinessMockitoTest {

    @Test
    void findTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveAllDate()).thenReturn(new int[] {23, 4, 6});

        BusinessImpl business = new BusinessImpl(dataServiceMock);
        int result = business.findTheGreatestFromAllData();
        assertEquals(23, result);
    }
}