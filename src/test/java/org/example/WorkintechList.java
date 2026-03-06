package org.example;

import java.util.*;

public class WorkintechList<E> extends ArrayList<E> {

    @Override
    public boolean add(E element) {
        // Tekrar eden eleman varsa ekleme
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    @Override
    public void add(int index, E element) {
        // Tekrar eden eleman varsa ekleme
        if (!this.contains(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E element : c) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @SuppressWarnings("unchecked")
    public void sort() {
        Collections.sort((List<Comparable>) this);
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            sort(); // Silme işleminden sonra sırala
        }
        return removed;
    }

    @Override
    public E remove(int index) {
        E removed = super.remove(index);
        sort(); // Silme işleminden sonra sırala
        return removed;
    }
}
