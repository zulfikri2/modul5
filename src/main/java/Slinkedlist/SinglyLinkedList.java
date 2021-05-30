
package Slinkedlist;

public class SinglyLinkedList {
     protected Node first;
    protected Node last;
    public int size;
    
    public SinglyLinkedList(){
        first = null;
        last = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public int getSize(){
        return size;
    }
    
    public void insertAwal(int val){
        Node nptr = new Node(val, null);
        if(first == null){
            first = nptr;
            last = first;
            
        } else {
            nptr.setLink(first);
            first = nptr;
        }
        size++;
    }
    
    public void insertAkhir(int val){
        Node nptr = new Node(val, null);
        if(first == null){
            first = nptr;
            last = first;
    } else {
            last.setLink(nptr);
            last = nptr;
        }
        size++;
    }
    
    public void insertAtPos(int val, int pos){
        Node nptr = new Node(val, null);
        if(pos > size){
            System.out.println("Posisi melebihi bataslinked list"); 
        } else if (pos == 1){
            insertAwal(val);
        } else if (pos == size){
            insertAkhir(val);
        } else {
            Node ptr = first;
            pos = pos - 1;
            for(int i = 1; i < size; i++){
                if(i == pos ){
                    Node tmp = ptr.getLink();
                    ptr.setLink(nptr);
                    nptr.setLink(tmp);
                    break;
                }
                
                ptr = ptr.getLink();
        }
            size++;
    }
}
        public void deleteAwal(){
            first = first.getLink();
            size--;
        }
        
        public void deleteAkhir(){
            Node temp = first;
            for(int i = 1; i < size-1; i++){
                temp = temp.getLink();
                last = temp;
                last.setLink(null);
                size--;
            }
        }
        
        public void deleteAtPos(int pos){
            if(pos > size){
                System.out.println("Posisi node melebihi ukuran");
                
            } else if(pos == 1){
                this.deleteAwal();
            } else if(pos == size){
                this.deleteAkhir();
            } else {
                Node ptr = first;
                pos--;
                for(int i = 1; i < pos; i++){
                    if(i == pos){
                        Node temp = ptr.getLink();
                        temp = temp.getLink();
                        ptr.setLink(temp);
                        break;
                    }
                    ptr = ptr.getLink();
                }
                size--;
            }
        }
        
        public void display(){
            Node ptr = first;
            while(true){
                if(ptr == null)
                    break;
                    System.out.print(ptr.getData() + "->");
                    ptr = ptr.getLink();
                }
                System.out.println();
            }

    void delteAtPos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }

