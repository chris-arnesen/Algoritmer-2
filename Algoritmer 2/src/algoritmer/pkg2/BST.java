/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmer.pkg2;

import java.util.Iterator;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Mats Engesund
 * @param <E>
 */
public class BST<E extends Comparable<E>> implements Tree<E> {
    
    // BST inits og konstruktør 
    protected TreeNode<E> root;
    protected int size = 0; 
    
    
    public BST() {
    }
    
    public BST(E[] objects) {
        for(int i = 0; i < objects.length; i++)
            add(objects[i]);
    }
    
    
    // TreeNode klassa
    public static class TreeNode<E> {
        protected E element; 
        protected TreeNode<E> left; 
        protected TreeNode<E> right; 
        
        public TreeNode(E e) {
            element = e; 
        }
    }
    

    @Override
    public boolean search(E e) {
        TreeNode<E> current = root; 
        while(current != null) {
            if(e.compareTo(current.element) < 0) {
                current = current.left; 
            }else if(e.compareTo(current.element) > 0) {
                current = current.right; 
            } else 
                return true;
        }
        return false;
    }

    @Override
    public boolean insert(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
