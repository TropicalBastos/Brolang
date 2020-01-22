package com.tropicalbastos.brolang.compiler;

import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

public class BrolangCompiler {

    private String source;
    private String createdPath;

    private static final String SOURCE_CODE_IDENTIFIER = "3d3f1acd-3787-4c1b-99b3-db6194d5d7b2.c";

    public BrolangCompiler(String cSource) {
        this.source = cSource;
    }

    public void compile(String outFile) {
        this._tempCreate();
        this._compile(outFile);

        Map<String, String> env = System.getenv();
        String debug = env.getOrDefault("DEBUG", null);
        
        if (debug == null)
            this._clean();
    }

    private void _tempCreate() {
        try {
            FileOutputStream outputStream = new FileOutputStream(SOURCE_CODE_IDENTIFIER);
            byte[] bytesToWrite = source.getBytes("UTF-8");
            outputStream.write(bytesToWrite);
            outputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            this._clean();
            System.exit(-1);
        }
    }

    private void _clean() {
        File file = new File(SOURCE_CODE_IDENTIFIER); 
        file.delete();
    }

    private void _compile(String outFile) {
        try
        { 
            // Command to create an external process 
            String compileCommand = "gcc -o " + outFile + " " + SOURCE_CODE_IDENTIFIER;
  
            // Running the above command 
            Runtime run  = Runtime.getRuntime(); 
            Process proc = run.exec(compileCommand); 
            proc.waitFor();
        } 
  
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        }
    }
    
}