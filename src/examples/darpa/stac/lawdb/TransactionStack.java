package darpa.stac.lawdb;

import java.util.*;

public class TransactionStack
{
    Deque<Undo> t_stack;
    BTree btree;
    public boolean is_active;
    public static int INSERT;
    public static int DELETE;
    public static int UPDATE;
    
    public TransactionStack(final BTree btree) {
        this.t_stack = null;
        this.is_active = false;
        this.t_stack = (Deque<Undo>)new ArrayDeque<Undo>(1000);
        this.btree = btree;
    }
    
    void begin() {
        while (this.t_stack.poll() != null) {}
        this.is_active = true;
    }
    
    public void addInsert(final BTree.Node n, final BTree.Node parent, final int key) {
        if (this.is_active) {
            final Undo undo = new Undo(TransactionStack.INSERT, n, parent, key);
            this.t_stack.addLast(undo);
        }
    }
    
    public void rollback() {
        while (this.t_stack.peekLast() != null) {
            final Undo last = (Undo)this.t_stack.removeLast();
            last.undo();
        }
    }
    
    public void commit() {
        while (this.t_stack.poll() != null) {}
    }
    
    public class Undo
    {
        int type;
        int key;
        BTree.Node n;
        BTree.Node nparent;
        BTree.Node newn;
        BTree.Node newnparent;
        
        public Undo(final int type, final BTree.Node n, final BTree.Node nparent, final int key) {
            this.type = type;
            this.n = n;
            this.key = key;
            this.nparent = nparent;
            this.newn = this.newn;
            this.newnparent = this.newnparent;
            this.prepare();
        }
        
        public void prepare() {
            if (this.type == TransactionStack.INSERT && this.n != null) {
                this.newn = this.n.copy(null);
                this.newnparent = this.nparent.copy(null);
            }
        }
        
        public void undo() {
            if (this.type == TransactionStack.INSERT) {
                if (this.n != null) {
                    this.nparent.copyin(this.newnparent);
                    this.n.copyin(this.newn);
                }
                else {
                    TransactionStack.this.btree.delete(this.key);
                }
            }
        }
    }
}
