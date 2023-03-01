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
        
        ListaDoblementeEnlazada l = new ListaDoblementeEnlazada();
        assertEquals(false, l.contains("berni"));
        l.add("berni");
        assertEquals(true, l.contains("berni"));
        l.add("berni1");
        l.add("berni2");
        l.add("berni3");
        assertEquals(true, l.contains("berni"));

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
        ListaDoblementeEnlazada l = new ListaDoblementeEnlazada();
        assertEquals(true, l.isEmpty());
        l.add(new String("Prueba"));
        assertEquals(false, l.isEmpty());
        l.remove(new String("Prueba"));
        assertEquals(true, l.isEmpty());
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
        //TODO: Revisar
        ListaDoblementeEnlazada l = new ListaDoblementeEnlazada();

        //assertEquals(null, l.toArray());
        l.add(3);
        l.add(2);
        l.add(1);
        Object[] array = {1,2,3};
        assertEquals(array, l.toArray());

    }

    @Test
    public void testToArray2() {

    }
}
