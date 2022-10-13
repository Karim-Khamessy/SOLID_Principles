package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule
{
    private final IReader _reader;
    private final IWriter _writer;
    public EncodingModule(IReader reader, IWriter writer)
    {
        _reader = reader;
        _writer = writer;
    }
    public void encode() throws IOException
    {
        String aLine = _reader.read();
        String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
        _writer.write(encodedLine);
    }
}

