package single.mei.typeX8_Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxy
 * @date: 2023/5/17 12:12 AM
 * @ClassName: Main
 */
public class Main {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFileList = listAllResourceFiles("");
        for (ResourceFile resourceFile : resourceFileList) {
            resourceFile.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFileList) {
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectPath) {
        List<ResourceFile> resourceFileList = new ArrayList<>();
        // ...
        resourceFileList.add(new PdfFile("a.pdf"));
        resourceFileList.add(new WordFile("b.doc"));
        resourceFileList.add(new PPTFile("c.ppt"));
        return resourceFileList;
    }

}
