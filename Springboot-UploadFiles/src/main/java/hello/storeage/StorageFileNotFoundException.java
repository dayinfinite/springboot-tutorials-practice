package hello.storeage;

/**
 * @author dayinfinite
 * @deprecated
 * @date 2019/01/16
 * */
public class StorageFileNotFoundException extends  StorageException{
    public StorageFileNotFoundException(String message){
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
