/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import java.util.Iterator;

/**
 *
 * @author Felipe
 */
interface ListTAD<T> {

    public void add (T element);

    public void add (int index, T element);

    public T get(int index);

    public T set(int index, T element);

    public boolean remove (T element);

    public T remove(int index);

    public boolean isEmpty ();

    public int size ();

    public boolean contains (T element);

    public int indexOf (T element);

    public void clear ();

    Iterator<T> iterator();
}

