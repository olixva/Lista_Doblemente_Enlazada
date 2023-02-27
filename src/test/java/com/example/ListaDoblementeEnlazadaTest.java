package com.example;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListaDoblementeEnlazadaTest {
    
    @Test
    public void testAdd() {

    }

    @Test
    public void testAdd2() {

    }

    @Test
    public void testAddAll() {

    }

    @Test
    public void testAddAll2() {

    }

    @Test
    public void testClear() {

    }

    @Test
    public void testContains() {

    }

    @Test
    public void testContainsAll() {

    }

    @Test
    public void testGet() {

    }

    @Test
    public void testIndexOf() {

    }

    @Test
    public void testIsEmpty() {

    }

    @Test
    public void testIterator() {

    }

    @Test
    public void testLastIndexOf() {

    }

    @Test
    public void testListIterator() {

    }

    @Test
    public void testListIterator2() {

    }

    @Test
    public void testRemove() {

    }

    @Test
    public void testRemove2() {

    }

    @Test
    public void testRemoveAll() {

    }

    @Test
    public void testRetainAll() {

    }

    @Test
    public void testSet() {

    }

    @Test
    public void testSize() {

        ListaDoblementeEnlazada l = new ListaDoblementeEnlazada();
        assertEquals(0, l.size());

        l.add(new String("prueba"));
        assertEquals( 1, l.size());

        l.remove(new String("prueba"));
        assertEquals( 0, l.size());

    }

    @Test
    public void testSubList() {

    }

    @Test
    public void testToArray() {

    }

    @Test
    public void testToArray2() {

    }
}
