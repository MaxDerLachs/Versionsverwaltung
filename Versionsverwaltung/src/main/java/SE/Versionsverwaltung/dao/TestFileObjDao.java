package SE.Versionsverwaltung.dao;

import SE.Versionsverwaltung.model.FileObj;

public class TestFileObjDao {
    public static void main( String[] args ) {

        System.out.println(FileObjDao.getFileObjByID("0002").getFileName());
        System.out.println(FileObjDao.getFileObjByNameAndVersion("test_001","1.0.0").getFileID());
        System.out.println(FileObjDao.getFileObjByNameAndVersion("test_001","1.1.0").getFileID());

        FileObj fileObj =new FileObj(
                "0006",
                "Gedicht",
                "Rosen sind rot. Veilchen sind blau. Die Sonne ist gelb. Ich hab kein Geld. Ich bin ein Held.",
                "1.2.0",
                "1.1.0",
                "Knaxi",
                false);

        String result = FileObjDao.insertDocument(fileObj) ? "Insert successful." : "Insert failed.";
        System.out.println(result);
    }
}