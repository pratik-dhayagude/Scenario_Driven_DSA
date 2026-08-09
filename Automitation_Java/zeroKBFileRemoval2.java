import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
    
    Function Name : DirectoryScanner
    Input         : Name of Directory
    Description   : Delete all zero-byte files periodically
    Date          : 10/08/2026
    Author        : Pratik Dhananjay Dhayagude
    
    */
class ZeroKBFileRemoval2
{
    

    public static void DirectoryScanner(String DirectoryPath)
    {
        String Border = "-".repeat(40);

        System.out.println("Log file is created at the current location");

        Date CurrentDate = new Date();

        SimpleDateFormat sdf =
            new SimpleDateFormat("EEE MMM dd HH-mm-ss zzz yyyy");

        String TimeStamp = sdf.format(CurrentDate);

        String LogFileName = "Marvellous" + TimeStamp + ".log";

        LogFileName = LogFileName.replace(" ", "_");
        LogFileName = LogFileName.replace(":", "_");


        // -------------------------------------------------------
        // Checking
        // -------------------------------------------------------

        File Directory = new File(DirectoryPath);

        if(!Directory.exists())
        {
            System.out.println("Marvellous Automation Error: There is no such directory: "+ DirectoryPath);

            return;
        }

        if(!Directory.isDirectory())
        {
            System.out.println("Marvellous Automation Error: It is not a directory: "+ DirectoryPath);

            return;
        }
        System.out.println("Log file gets created with name: " + LogFileName);

        try
        {
            FileWriter fobj = new FileWriter(LogFileName);

            fobj.write(Border + "\n");
            fobj.write("Marvellous Automation Script\n");
            fobj.write(Border + "\n\n");

            fobj.write("Files from the directory are:\n\n");
            fobj.write(Border + "\n");


            int TotalFiles = 0;
            int EmptyFiles = 0;


            
            TotalFiles = ScanDirectory(
                Directory,
                fobj
            );


            

            fobj.write(Border + "\n");
            fobj.write(
                "Total Files Scanned : "
                + TotalFiles
                + "\n"
            );

            fobj.write(Border + "\n");
            fobj.write(
                "Log file gets created as : "
                + TimeStamp
                + "\n"
            );

            fobj.write(Border + "\n");

            fobj.close();

        }
        catch(IOException e)
        {
            System.out.println(
                "Error while creating log file: "
                + e.getMessage()
            );
        }
    }


    /*
    
    Function Name : ScanDirectory
    Description   : Recursively scan directory
    
    */

    public static int ScanDirectory(File Directory,FileWriter fobj)throws IOException
    {
        int TotalFiles = 0;

        File[] Files = Directory.listFiles();

        if(Files == null)
        {
            return 0;
        }

        for(File CurrentFile : Files)
        {
            if(CurrentFile.isDirectory())
            {
                TotalFiles = TotalFiles + ScanDirectory(CurrentFile, fobj);
            }
            else
            {
                TotalFiles++;

                long FileSize = CurrentFile.length();

                fobj.write(
                    CurrentFile.getAbsolutePath()
                    + " : "
                    + FileSize
                    + " bytes\n"
                );


                if(FileSize == 0)
                {
                    boolean Deleted = CurrentFile.delete();

                    if(Deleted)
                    {
                        System.out.println( "Deleted : "+ CurrentFile.getAbsolutePath()
);
                    }
                }
            }
        }

        return TotalFiles;
    }


    /*
    
        Function Name : main
        Input          : Command line arguments
        Description    : Controls the automation script
    
    */

    public static void main(String A[])
    {
        

        System.out.println("===================================");
        System.out.println("Marvellous Automation Script");
        System.out.println("===================================");

        if(A.length != 1)
        {
            System.out.println("Invalid number of arguments");
            System.out.println(
                "Please use --h or --u for more information"
            );

            return;
        }

        if(A[0].equalsIgnoreCase("--h"))
        {
            System.out.println(
                "This automation script is used to scan the directory"
            );

            System.out.println(
                "For better usage please check --u flag"
            );
        }

        else if(A[0].equalsIgnoreCase("--u"))
        {
            System.out.println("Please execute the program as:");

            System.out.println(
                "java ZeroKBFileRemoval2 DirectoryName"
            );

            System.out.println(
                "Directory name should be absolute path"
            );
        }


        ///
        // Directory Path
        ///
        else
        {
            String DirectoryPath = A[0];
            ScheduledExecutorService Scheduler =
                Executors.newScheduledThreadPool(1

            Scheduler.scheduleAtFixedRate(
                () -> DirectoryScanner(DirectoryPath),
                0,
                1,
                TimeUnit.MINUTES
            );
        }

        System.out.println("===================================");
        System.out.println("Thank you for using Marvellous Automation Script" );
        System.out.println("===================================");
    }
}