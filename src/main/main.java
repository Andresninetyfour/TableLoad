package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;
import com.google.gson.Gson;

import model.Model;

public class main {


	public static void main(String[] args) throws Exception{
		
		String file = "/export/home/alara/Desktop/TableLoad/contentdb_confirmation.json";
		String json = readFileAsString(file);
		
		String data = json.replace("} ] }", "} ] },");
		String data1 = data.replace(" \"GENERAL\" }",  "\"GENERAL\" },");
		String finalstring = data1.substring(0, data1.length()-3);
						
		
		StringBuilder add = new StringBuilder(finalstring);
		add.insert(0, "[");
		add.insert(finalstring.length()+1, "]");
		//System.out.println(add);
		PrintWriter writer = new PrintWriter("the-file-name.json", "UTF-8");
		writer.println(add.toString());
		writer.close();
		
		
		/*JsonNode jsonTree = new ObjectMapper().readTree(new File("/export/home/alara/Desktop/TableLoad/the-file-name.txt"));
		Builder csvSchemaBuilder = CsvSchema.builder();
	    JsonNode firstObject = jsonTree.elements().next();
		firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);});
		CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();
		CsvMapper csvMapper = new CsvMapper();
		csvMapper.writerFor(JsonNode.class)
		.with(csvSchema)
		.writeValue(new File("/export/home/alara/Desktop/TableLoad/orderLines.csv"), jsonTree);*/
	}
	
	
	
	
	
	public static String readFileAsString(String file) throws Exception{
		return new String(Files.readAllBytes(Paths.get(file)));
	}
	
	
}
