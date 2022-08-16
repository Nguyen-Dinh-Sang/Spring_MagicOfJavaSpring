package magicofspring.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListTest {

    @Test
    public void testSize() {
        List list = mock(List.class);

        when(list.size()).thenReturn(10);

        assertEquals(10, list.size());
    }

    @Test
    public void testSizeMultiple() {
        List list = mock(List.class);

        when(list.size()).thenReturn(10).thenReturn(20);

        assertEquals(10, list.size());
        assertEquals(20, list.size());
    }

    @Test
    public void testGet() {
        List list = mock(List.class);

        when(list.get(0)).thenReturn("Data");

        assertEquals("Data", list.get(0));
        assertEquals(null, list.get(1));
    }

    @Test
    public void testGetGenericParameter() {
        List list = mock(List.class);

        when(list.get(Mockito.anyInt())).thenReturn("Data");

        assertEquals("Data", list.get(0));
        assertEquals("Data", list.get(2));
    }
}