package de.eis.tomee.agent.tomee;

import javax.enterprise.context.ApplicationScoped;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * User: dmitry
 * Date: 09.01.13
 * Time: 14:43
 */
@ApplicationScoped
public class InstanceService {
    public void createInstance(String name, ZipInputStream stream) {
        if (checkInstanceExist(name)) {
            throw new InstanceExistsException();
        }

    }

    public void removeInstance(String name) {

    }

    public boolean checkInstanceExist(String name) {
        return false;
    }

    /*static public void extractFolder(ZipInputStream stream) throws ZipException, IOException
    {
        int BUFFER = 2048;

        String newPath = "test";

        new File(newPath).mkdir();
        // Process each entry
        while (stream.)
        {
            // grab a zip file entry
            ZipEntry entry = (ZipEntry) zipFileEntries.nextElement();
            String currentEntry = entry.getName();
            File destFile = new File(newPath, currentEntry);
            //destFile = new File(newPath, destFile.getName());
            File destinationParent = destFile.getParentFile();

            // create the parent directory structure if needed
            destinationParent.mkdirs();

            if (!entry.isDirectory())
            {
                BufferedInputStream is = new BufferedInputStream(zip
                        .getInputStream(entry));
                int currentByte;
                // establish buffer for writing file
                byte data[] = new byte[BUFFER];

                // write the current file to disk
                FileOutputStream fos = new FileOutputStream(destFile);
                BufferedOutputStream dest = new BufferedOutputStream(fos,
                        BUFFER);

                // read and write until last byte is encountered
                while ((currentByte = is.read(data, 0, BUFFER)) != -1) {
                    dest.write(data, 0, currentByte);
                }
                dest.flush();
                dest.close();
                is.close();
            }

            if (currentEntry.endsWith(".zip"))
            {
                // found a zip file, try to open
                extractFolder(destFile.getAbsolutePath());
            }
        }
    }*/
}
