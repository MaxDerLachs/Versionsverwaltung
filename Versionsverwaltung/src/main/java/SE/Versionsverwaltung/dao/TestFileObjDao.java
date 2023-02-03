package SE.Versionsverwaltung.dao;

public class TestFileObjDao {
    public static void main( String[] args ) {

        System.out.println(FileObjDao.getFileObjByID("0002").getFileName());
        System.out.println(FileObjDao.getFileObjByNameAndVersion("test_001","1.0.0").getFileID());
        System.out.println(FileObjDao.getFileObjByNameAndVersion("test_001","1.1.0").getFileID());
    }
}