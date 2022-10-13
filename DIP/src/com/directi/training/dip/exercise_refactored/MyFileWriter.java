package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IWriter
{
   

    @Override
    public void write(String _fileName) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(_fileName));
        writer.write(encodedLine);
        writer.close();
    }
}
