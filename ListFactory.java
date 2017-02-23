public class ListFactory {
    static boolean instance_flag =false;
    public ListFactory() throws SingletonException {
        if (instance_flag){ 
            throw new SingletonException("No se puede crear varias listas al mismo tiempo");
        }
            else{
                instance_flag = true; 
            }
    }
    public void finalize(){
        instance_flag = false; 
    }
    public AbstractList getList(int i){ 
        if (i==1){  
            return new SimpleCadenaList();
        }
        if(i==2){   
            return new DobleCadenaList();
        }
        else{       
            return new CircularList();
        }
    }
}