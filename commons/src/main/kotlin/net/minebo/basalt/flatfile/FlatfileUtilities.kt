package net.minebo.basalt.flatfile

import net.minebo.basalt.Basalt
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.lang.reflect.Type

object FlatfileUtilities
{
    inline fun <reified T> getAllEntries(file: File, ofType: Type, fallbackValue: T? = null): T?
    {
        if (file.exists())
        {
            val reader = FileReader(file)

            return Basalt.gson.fromJson<T>(reader.readText(), ofType).also {
                reader.close()
            }
        } else
        {
            return fallbackValue.apply {
                file.createNewFile()
            }
        }
    }

    inline fun <reified T> writeToFile(file: File, value: T, ofType: Type)
    {
        if (!file.exists())
        {
            file.createNewFile()
        }

        val writer = FileWriter(file)

        writer.write(
            Basalt.gson.toJson(value, ofType)
        )

        writer.close()
    }
}