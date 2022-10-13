package com.directi.training.dip.exercise_refactored;

public class MyDatabaseWriter implements IWriter
{
    MyDatabase _database;
    public MyDataBaseWriter(MyDatabase database)
    {
        _database = database;
    }


    @Override
    public void write(String input)
    {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }
}
